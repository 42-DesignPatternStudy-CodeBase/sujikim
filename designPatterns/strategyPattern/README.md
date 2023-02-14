# Strategy pattern

## 의도
- 정책에 따라 알고리즘 계열을 변경
- 알고리즘을 계열별로 캡슐화, 정책에 따라 전략 교체

## 핵심 포인트
![Strategy pattern image from refactoring guru](https://refactoring.guru/images/patterns/diagrams/strategy/structure-2x.png)
- 가변적인 부분을 상호교환 가능한 전략 객체로 추출
- Context에는 모든 전략의 공통 로직만 구현
- 전략 인스턴스를 구성방식으로 저장

## 다른 이름
정책 (Policy)

## 효과
- 동적 혹은 정적으로 유연하게 전략을 바꿀 수 있음
