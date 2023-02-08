# Decorator Pattern

## 의도
- 객체에 동적으로 새로운 책임 추가, 행동을 변형
- 상속이 아닌 구성 방식으로 해결

## 핵심 포인트 
![decorator pattern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/decorator/structure-2x.png)
- 기존 인스턴스를 생성자 파라미터로 전달받아서 private 변수로 저장
- 업캐스팅 및 오버라이딩을 위해 상속
- 데코레이터 필요에 따라 기존 인스턴스의 메서드 및 변수를 활용

## 다른 이름
랩퍼 Wrapper

## 효과
- 상속을 위한 정적 코드 추가 없이도 다양한 조합 활용 가능
