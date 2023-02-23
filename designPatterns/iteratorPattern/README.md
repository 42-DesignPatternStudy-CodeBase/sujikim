# Iterator Pattern

## 의도

- 내부 구현을 노출하지 않고 집합체의 모든 원소를 순차적으로 접근

## 핵심 포인트

![iterator pattern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/iterator/structure-2x.png)

- 집합체와 iterator 모두 추상화
- first, next, isDone, currentItem 방식은 고전적인 방식
- java.util.iterator에서 다루는 next, hasNext, remove 방식이 최신

## 다른 이름

커서 Cursor

## 효과

- 순회하는 여러 방식을 다양하게 지원할 수 있음
- 서로 다른 집합 구조여도 동일한 방법으로 순회할 수 있음
