package strategyPattern.example.grade;

import java.util.ArrayList;

public class Student {
    
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;
    
    public Student(int studentID, String studentName){ 
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>(); 
    }

    public void addSubject(String name, int score, GradeStrategy gradeStrategy){ 
        Subject subject = new Subject(name, score, gradeStrategy);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (Subject subject : subjectList) {
            System.out.print("학생 " + studentName + "의 ");
            System.out.print(subject.getName() + " 과목");
            System.out.print("성적은 " + subject.getScorePoint() + "점 이고, ");
            System.out.println("학점은 " + subject.getGrade() + " 입니다.");
        }
    }
}
