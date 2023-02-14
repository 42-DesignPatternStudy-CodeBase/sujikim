package strategyPattern.example.grade;

public class MajorGradeStrategy implements GradeStrategy {

    @Override
    public String getGrade(int scorePoint) {
        if (scorePoint >= 95)
            return "S";
        else if (scorePoint >= 90)
            return "A";
        else if (scorePoint >= 80)
            return "B";
        else if (scorePoint >= 70)
            return "C";
        else if (scorePoint >= 60)
            return "D";
        return "F";
    }
    
}
