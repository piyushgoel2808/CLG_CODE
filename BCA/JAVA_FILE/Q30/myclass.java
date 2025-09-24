package mypack;

public class myclass {
    int a = 1;
  private int pri_a = 2;
  protected int pro_a = 3;
  public int pub_a = 4;
  public myclass() {
    System.out.println("base class constructor called");
    System.out.println("a = " + a);
    System.out.println("pri_a = " + pri_a);
    System.out.println("pro_a "+ pro_a);
    System.out.println("pub_a "+ pub_a);
  }
}
