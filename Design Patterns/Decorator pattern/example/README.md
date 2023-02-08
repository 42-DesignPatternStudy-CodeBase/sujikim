## 주어진 과제
다음 객체를 구현하는데 Decorator pattern을 활용해보세요
- 커피 원두는 여러 종류가 있습니다. 이 원두를 활용하여 만드는 커피는 아메리카노, 라떼, 모카커피, 휘핑크림이 올라간 모카커피 등이 있습니다.
- 원두의 종류가 케냐와 에티오피아가 있다고 할 때 다음과 같이 여러 종류의 커피를 만들 수 있는 클래스 구조를 디자인 해보세요 커피에 첨가되는 장식자(Decorator)들은 다양하게 첨가되거나 바뀔 수 있습니다.

``` KenyaAmericano
KenyaAmericano Adding Milk
KenyaAmericano Adding Milk Adding Mocha Syrup
EtiopiaAmericano Adding Milk Adding Mocha Syrup Adding WhippedCream
```

## 과제 해결
![coffee 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/week1/Design%20Patterns/Decorator%20pattern/example/Coffee.jpg?raw=true)
- 상속과 구성, 데코레이터 패턴을 섞어서 사용

### 과제에서 중점적으로 고민했던 부분
**데코레이터를 설정하는 범위**

- 원두보다 음료단위로 주문하는 게 일반적 -> 커피를 원두에서 상속하지 않음
- 단순 원두에 추가메뉴 방지 -> 커피에 데코레이터 연결
- 아메리카노 뿐만 아니라 드립커피, 콜드브루 등 추출방식이 다른 커피가 추가될 상황을 고려해서 Coffee 추상 클래스 추가