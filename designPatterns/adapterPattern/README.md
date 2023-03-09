# Adapter Pattern

## 의도

- 코드의 재사용
- 인터페이스가 일치하지 않더라도 호환되도록

## 핵심 포인트

- 두가지 방법으로 가능

- 상속
  ![adapter pattern with inheritance image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/adapter/structure-class-adapter-2x.png)

  - 두 인터페이스를 모두 상속, 오버라이딩

- 합성
  ![adapter pattern with composition image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter-2x.png)

  - 의존성 관계로 연결
  - 외부에서 인자로 받아 주입할 수도 있음

## 다른 이름

- wrapper

## 효과

- 시스템의 수많은 변화에도 적절하게 코드를 유지보수, 재사용할 수 있음
- 복잡한 객체 구조 정리 가능
