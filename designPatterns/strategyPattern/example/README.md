## 과제 1 정책이나 알고리즘을 분리하는 전략패턴

학교의 학생이 수강 신청을 하게되면 과목마다 각각 성적을 받게 된다.
이때, 성적에 대한 학점을 부여하는 정책은 다음과 같이 여러가지가 있을 수 있다.
전공 관련 여부에 따라 학점이 다르게 부여되는 경우, Pass/Fail로 만 학점을 부여하는 경우 등 다양한 학점에 대한 정책이 있을때 각 성적에 대해 다양한 정책을 어떻게 구현하면 좋을까?

아래 코드에 성적의 정책을 추가하여 다음과 같은 리포트를 구현하세요.

```
학생 Lee의 국어 과목성적은 100점 이고, 학점은 A 입니다.
학생 Lee의 수학 과목성적은 100점 이고, 학점은 S 입니다.
======================================
학생 Kim의 국어 과목성적은 55점 이고, 학점은 F 입니다.
학생 Kim의 수학 과목성적은 55점 이고, 학점은 D 입니다.
학생 Kim의 영어 과목성적은 100점 이고, 학점은 A 입니다.
```

```java
public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;
    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }
    public void addSubject(String name, int score, boolean majorCode){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }
}
public class Subject {
    private String name;
    private int scorePoint;
    private boolean majorCode;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
    public boolean isMajorCode() {
        return majorCode;
    }
    public void setMajorCode(boolean majorCode) {
        this.majorCode = majorCode;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100, false);
        studentLee.addSubject("수학", 100, true);
        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 55, true);
        studentKim.addSubject("수학", 55, false);
        studentKim.addSubject("영어", 100, false);
        studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();
    }
}
```

## 과제 1 해결

![Grade Strategy 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/main/Design%20Patterns/strategyPattern/example/Grade.jpg?raw=true)

- Subject 내부의 majorCode 변수를 없애고 client에서 결정하는 전략에 따라 성적을 반환할 수 있도록

### 과제 1에서 중점적으로 고민했던 부분

- 과목 채점방식이 결정되지 않았을 경우의 에러처리가 애매했음 -> 과목이 생성될때부터 어떻게 채점할지 결정되어야 함
- 기본 생성자 후 세터호출 대신 생성자에서 필요한 파라미터를 받는 방식으로 변경

## 과제 2 컴파일 없이 설정파일로 제어하는 전략패턴

사용하는 데이터베이스 플랫폼을 자유롭게 변경해야 하는 상황이라 가정하자.

다음 코드를 참고하여 추가적인 코드 수정없이 db.properties 환경파일의 내용만 변경하면 연결되는 DB도 바뀔 수 있도록 구현하라

```
// db.properties
DBTYPE=MYSQL
```

```java
public class UserInfo {
    private String userId;
    private String passwd;
    private String userName;

    public String getUserId() {
       return userId;
    }
    public void setUserId(String userId) {
       this.userId = userId;
    }
    public String getPasswd() {
       return passwd;
    }
    public void setPasswd(String passwd) {
       this.passwd = passwd;
    }
    public String getUserName() {
       return userName;
    }
    public void setUserName(String userName) {
       this.userName = userName;
    }
}

```

## 과제 2 해결

![DAO Strategy 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/main/Design%20Patterns/strategyPattern/example/DAO.jpg?raw=true)

- 최초 실행시 파일을 열어 UserInfoDao를 반환받도록

### 과제 2에서 중점적으로 고민했던 부분

- 실제 DB연결하는 작업없이도 패턴에 따라 동적으로 변경되는 부분만 보여줄 수 있도록 최대한 단순화
