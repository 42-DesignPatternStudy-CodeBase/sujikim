package singletonPattern.example;

enum EnumSingleton {
    INSTANCE;
    // enum은 기본 생성자가 생성되지 않아서 private 생성자 불필요
    // INSTANCE는 private static final EnumSingleton instance = new EnumSingleton; 와 동일

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
