package visitorPattern.example.entry;
import java.util.*;

public class ListVisitor extends Visitor {
  public static final String LIGHT_CYAN_BOLD = "\033[1;96m";
  public static final String RESET = "\033[0m";

  @Override
  public void visit(File file) {
    System.out.println(file);
  }

  @Override
  public void visit(Directory directory) {
    System.out.println(LIGHT_CYAN_BOLD + directory + RESET);

    Iterator<Entry> iterator = directory.iterator();
    
    while (iterator.hasNext()) {
      Entry entry = iterator.next();
      entry.accept(this);
    }
    System.out.println("");
  }
}
