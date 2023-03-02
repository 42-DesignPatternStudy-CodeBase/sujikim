# Bridge Pattern

## 의도

- 객체의 확장성 향상
- 구현에서 추상을 분리, 독립적으로 다양성을 가질 수 있도록

## 핵심 포인트

![bridge pattern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/bridge/structure-en-2x.png)

- 추상부와 구현부 분리, 독립적으로 확장하는 계층 구조
  - 추상부 : 인터페이스, 상위 제어논리
  - 구현부 : 실제 작동하는 실행부
- 두 계층 구조의 연결 = 구성, 구현부에 실제 작업을 위임

## 다른 이름

handle

## 효과

- 여러 플랫폼을 지원하는 경우나 상황별 GUI 구현 방식이 달라지는 경우 유용
- 추상적인 개념에 대한 구현방식을 런타임에 결정 가능 -> 컴파일 의존성 제거
- 디자인 설계가 다소 복잡해지는 단점 고려해야
