package strategyPattern.example.grade;

public class Subject {    
    private String name; 
    private int scorePoint; 
    private GradeStrategy gradeStrategy;

    public Subject(String name, int scorePoint, GradeStrategy gradeStrategy) {
        this.name = name;
        this.scorePoint = scorePoint;
        this.gradeStrategy = gradeStrategy;
    }

    public String getName() { 
        return name;
    }
    public int getScorePoint() { 
        return scorePoint;
    }
    public GradeStrategy getGradeStrategy() { 
        return gradeStrategy;
    }
    
    public String getGrade() {
        return gradeStrategy.getGrade(this.scorePoint);
    }
}
