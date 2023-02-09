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
![Car 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/week1/Design%20Patterns/Factory%20Method%20pattern/example/Car.jpg?raw=true)
- if else문 대신 상속으로 해결


### 과제에서 중점적으로 고민했던 부분
**public static final 로 선언된 상수들의 위치**

- 추상클래스 Car에 구체적인 정보를 담은 상수를 두는게 적절하지 않아보임 -> CarName으로 분리