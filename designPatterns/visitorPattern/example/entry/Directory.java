package visitorPattern.example.entry;
import java.util.*;

public class Directory extends Entry {
    
  private String name;
  private ArrayList<Entry> children;

  public Directory(String name) {
    this.name = name;
    children = new ArrayList<Entry>();
  }
  
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int totalSize = 0;
    for (Entry child : children) {
      totalSize += child.getSize();
    }
    return totalSize;
  }
  
  public Entry add(Entry entry)  {
    children.add(entry);
    System.out.println("Add entry : " + entry.getName());
    return entry;
  }

  public Iterator<Entry> iterator() {
    return children.iterator();
  }
}