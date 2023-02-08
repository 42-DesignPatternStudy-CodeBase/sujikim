public class _Main {

    public static void main(String[] args) {
        SimpleSingleton instanceA = SimpleSingleton.getInstance();
        SimpleSingleton instanceB = SimpleSingleton.getInstance();

        System.out.println(instanceA == instanceB);

        SynchronizedSingleton instanceC = SynchronizedSingleton.getinstance();
        SynchronizedSingleton instanceD = SynchronizedSingleton.getinstance();

        System.out.println(instanceC == instanceD);

        EnumSingleton instanceE = EnumSingleton.getInstance();
        EnumSingleton instanceF = EnumSingleton.getInstance();
        // enum 형식은 EnumSingleton.INSTANCE 방식으로 호출하기도 함

        System.out.println(instanceE == instanceF);
    }
    
}
