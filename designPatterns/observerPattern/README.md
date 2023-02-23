# Oberver Pattern

## 의도
- 객체 사이의 일대다 의존관계 명시
- 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 변화를 통지받고 자동으로 갱신

## 핵심 포인트 
![observer pattern image from refactoring.guru](https://refactoring.guru/images/patterns/diagrams/observer/structure-2x.png)
- Subject는 상태가 변할 때마다 통지할 Observer 목록을 가지고 있음
- 갱신 프로토콜은 로직에 따라 push / pull 모델 선택 가능
    - push : 주체가 변경되면 모든 데이터를 옵저버에 전달
    - pull : 옵저버가 필요할 때마다 주기적으로 주체가 변경되었는지 체크

## 다른 이름
종속자 Dependent, 게시-구독 Publish-Subscribe

## 효과
- 관련된 객체사이의 일관성 유지, but 결합은 추상적으로만
- 주체와 감시자 모두 독립적으로 변형하기 쉬워짐