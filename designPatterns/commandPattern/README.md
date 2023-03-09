# Command Pattern

## 의도

- 작업의 처리와 요청 분리
- 요청의 캡슐화, 매개변수로 전달

## 핵심 포인트

![command attern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/command/structure-2x.png)

- receiver-action 1:1 대응
  - command 구현체들은 receiver 객체에 대한 참조자를 가짐
  - 요청에 따라 처리해야 하는 동작 호출

## 다른 이름

- action, transaction

## 효과

- 여러 다른 기능이 추가되더라도 동일한 방식으로 처리 가능
- 객체의 실행 독작 시점을 분리 지연
  - 콜백함수 처리와 유사
- 시점 제어 가능
  - 동작을 큐에 쌓아두고 특정 시점에 호출
- 저장, 복구, 취소 가능
  - 반대되는 행위를 취소하거나 기존의 동작을 취소하는 등
  - 명령 실행과정에서 오류가 발생하면 재실행
