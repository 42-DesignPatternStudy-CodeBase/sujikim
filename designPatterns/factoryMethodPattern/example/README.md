## 주어진 과제
특정 코드를 상속과 Factory pattern 을 이용하여 리펙토링 하세요

```java
public  class Car {
     public static final String SONATA = "Sonata";
     public static final String GRANDEUR = "Grandeur";
     public static final String GENESIS = "Genesis";
     String productName;

     public Car(String productName) {
          this.productName = productName;
     }
     public String toString() {
          return productName;
     } 
}
public class CarTest {
     public static void main(String[] args) {
          CarTest test = new CarTest();
          Car car = test.produceCar("Sonata");
          System.out.println(car);
     }
     public Car produceCar(String name) {
          Car car = null;
          if( name.equalsIgnoreCase(Car.SONATA)) {
               car = new Car(Car.SONATA);    
          }
          else if( name.equalsIgnoreCase(Car.GRANDEUR)) {
               car = new Car(Car.GRANDEUR);
          }
          else if( name.equalsIgnoreCase(Car.GENESIS)) {
               car = new Car(Car.GENESIS);
          }
          else {
               car = new Car("noname");
          }
          return car; 
     }
}
```

## 과제 해결
- 기존 코드는 새로운 차를 추가할 경우 produceCar의 if else문에 추가해야 함
- 새로운 차 생산업체 및 차종을 추가해도 기존 차 생성에 영향을 미치지 않도록 분리

### 과제에서 중점적으로 고민했던 부분
**public static final 로 선언된 상수들의 위치**

- 추상클래스 Car에 구체적인 정보를 담은 상수를 두는게 적절하지 않아보임 
- HyundaiCar 클래스를 추가해서 관련된 클래스를 묶는 효과
- HyundaiFactory에서는 hyundaiCar만 만들어서 혹시라도 다른 브랜드 차종이 섞이지 않도록
