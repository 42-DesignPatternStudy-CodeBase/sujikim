public class HyundaiFactory extends CarFactory {
    
    public HyundaiCar produceCar(String name) {
        if(name.equalsIgnoreCase(HyundaiCar.SONATA)) {
            return new Sonata();
        }
        else if(name.equalsIgnoreCase(HyundaiCar.GRANDEUR)) {
            return new Grandeur();
        }
        else if(name.equalsIgnoreCase(HyundaiCar.GENESIS)) {
            return new Genesis();
        }
        return null; 
    }
}
