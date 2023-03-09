package visitorPattern.example.entry;

public class FileTreatmentException extends RuntimeException {

  public FileTreatmentException() {
    super("잘못된 요청입니다.");
  }  
}
