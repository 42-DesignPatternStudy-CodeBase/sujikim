# Composite Pattern

## 의도

- 부분과 전체의 계층 표현을 트리구조로 구성
- 개별 객체와 복합 객체를 동일하게 다룸

## 핵심 포인트

![composite attern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/composite/structure-en-2x.png)

## 다른 이름

Object Tree

## 효과

- 단일 객체와 복합 객체를 동일하게 다뤄 코드가 단순해짐
- 단일 객체와 복합 객체의 구분을 하지 않기 때문에 단일 객체에는 필요하지 않은 연산을 포함하게 됨
  - 투명성을 위한 조치 (모두 동일한 인터페이스 유지)
  - 단일 책임 원칙에는 충돌됨 => 필요에 따라 설계
