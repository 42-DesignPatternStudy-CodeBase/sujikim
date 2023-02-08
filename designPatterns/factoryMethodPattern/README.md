# Factory Method Pattern
## 의도
- 객체를 생성하는 인터페이스는 미리 정의하지만, 인스턴스를 만드는 구체적인 내용은 하위클래스에 위임


## 핵심 포인트
![factory method pattern from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/factory-method/structure-2x.png)

- **생성과 구현을 분리**
- Product를 만드는 Creator 클래스와 create method를 추상화
- 자세한 구현내용은 하위 클래스에서 오버라이딩


## 다른 이름
가상 생성자 Virtual Constructor

## 효과
- 의존성에 종속되지 않도록 함
- 병렬적인 클래스 묶음 간의 연결 가능

