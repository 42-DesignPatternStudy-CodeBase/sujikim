# State pattern

## 의도
- 내부 상태에 따라 객체가 스스로 행동을 변경
- 상태별로 행동을 캡슐화, 현재 상태에 실제 행동을 위임

## 핵심 포인트
![state pattern image from refactoring guru](https://refactoring.guru/images/patterns/diagrams/state/structure-en-2x.png)
- 상태를 나타내는 클래스를 개별적으로 설정, 행동을 오버라이딩
- Context에서 현재 상태를 나타내는 변수 state와 각 상태 객체의 인스턴스를 가짐
- Context의 메소드는 현재 저장된 state의 메서드를 호출방식으로 위임
- 적절한 시기에 state 값을 다른 인스턴스로 전환 

## 다른 이름
상태 표현 객체 Object for State

## 효과
- 동일한 요청을 받더라도 자신의 현재 상태에 따라 반응
- 네트워크 연결과 같이 상황에 따라 동적으로 별도의 연산 처리 가능
- 상태를 별도의 객체로 표현하여 다른 객체들과 상관없이 정의 가능

### 고려해야 하는 상황
- 상태 객체 내부에서 다른 상태로의 전이를 하려면 Context객체의 레퍼런스를 변수로 가져야 함
