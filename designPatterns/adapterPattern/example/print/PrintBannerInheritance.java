package adapterPattern.example.print;

public class PrintBannerInheritance extends Banner implements Print {
  
  public PrintBannerInheritance(String str) {
    super(str);
  }

  @Override
  public void printWeak() {
    super.showWithParen();
  }

  @Override
  public void printStrong() {
    super.showWithAster();
  }
  
}