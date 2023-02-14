public class PassFailGradeStrategy implements GradeStrategy {

    @Override
    public String getGrade(int scorePoint) {
        return scorePoint >= 50 ? "Pass" : "Fail";
    }
    
}
