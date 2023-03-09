# Visitor Pattern

## 의도
- 데이터와 처리 행위 분리
- 다수의 객체의 공통된 로직을 별도의 객체로 분리

## 핵심 포인트

![visitor attern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/visitor/structure-en-2x.png?id=8f0367e7fdc92dbe05df3a86f2d0db45)


## 효과
- 여러 객체의 공통 연산을 수정해야 할 때 모든 객체를 다 수정하지 않아도 됨
- 객체를 순회하면서 순회누적치 계산이 가능
- 방문자가 필요한 연산을 수행할만큼 내부 상태를 접근할 수 있도록 공개 -> 캡슐화 전략의 위배