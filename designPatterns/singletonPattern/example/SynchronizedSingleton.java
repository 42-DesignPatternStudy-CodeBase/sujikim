package singletonPattern.example;

public class SynchronizedSingleton {
    
    private volatile static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static SynchronizedSingleton getinstance() {
        if (instance == null) { // getInstance 호출시마다 매번 lock하지 않도록
            synchronized(SynchronizedSingleton.class) {
                if (instance == null) // lock된 후로도 생성은 한번 더 확인
                    instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }
}
