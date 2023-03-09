package adapterPattern.example.print;

public class PrintBannerComposition implements Print {

  private Banner banner;

  public PrintBannerComposition(String str) {
    banner = new Banner(str);
  }

  @Override
  public void printWeak() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
  
}
