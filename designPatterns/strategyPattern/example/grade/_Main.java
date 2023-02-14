package strategyPattern.example.grade;

public class _Main {

    public static void main(String[] args) {

        GradeStrategy major = new MajorGradeStrategy();
        GradeStrategy nonMajor = new NonMajorGradeStrategy();
        GradeStrategy passFail = new PassFailGradeStrategy();

        Student studentLee = new Student(1001, "Lee"); 
        studentLee.addSubject("국어", 100, nonMajor);
        studentLee.addSubject("수학", 100, major);
        
        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 55, major); 
        studentKim.addSubject("수학", 55, nonMajor); 
        studentKim.addSubject("영어", 100, nonMajor);
        studentKim.addSubject("교사 지도", 85, passFail);
        studentKim.addSubject("봉사 활동", 45, passFail);
        
        studentLee.showGradeInfo(); 
        System.out.println("======================================"); 
        studentKim.showGradeInfo();

        /*
            [출력결과]
            학생 Lee의 국어 과목성적은 100점 이고, 학점은 A 입니다.
            학생 Lee의 수학 과목성적은 100점 이고, 학점은 S 입니다.
            ======================================
            학생 Kim의 국어 과목성적은 55점 이고, 학점은 F 입니다.
            학생 Kim의 수학 과목성적은 55점 이고, 학점은 D 입니다.
            학생 Kim의 영어 과목성적은 100점 이고, 학점은 A 입니다.
            학생 Kim의 교사 지도 과목성적은 85점 이고, 학점은 Pass 입니다.
            학생 Kim의 봉사 활동 과목성적은 45점 이고, 학점은 Fail 입니다. 
         */
        
    }    
}
