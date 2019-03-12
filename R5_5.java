public class R5_5{
  public static void main(String[] args) {
    double x1 = f(2);
    double x2 = g(h(2));
    double x3 = k(g(2) + h(2));
    double x4 = f(0) + f(1) + f(2);
    double x5 = f(-1) + g(-1) + h(-1) + k(-1);
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);
    System.out.println(x4);
    System.out.println(x5);
  }
  public static double f(double x) {return g(x) + Math.sqrt(h(x));}
  public static double g(double x) {return 4 * h(x);}
  public static double h(double x) {return x*x + k(x) -1;}
  public static double k(double x) {return 2*(x+1);}
}
