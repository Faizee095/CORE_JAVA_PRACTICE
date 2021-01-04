public class ConstructorOverloading {
  public static void main(String args[]) {
    C c1=new C();
    C c2=new C(4);
    C c3=new C(4,7);
  }
}
class C{
  int a,b;
  C(){
    System.out.println("Constructor with no arguments");
    System.out.println("VAlue of a="+a+"and b="+b);
  }
  C(int x){
    a=x;
    System.out.println("Constructor with one arguments");
    System.out.println("VAlue of a="+a+"and b="+b);
  }
  C(int x, int y){
    a=x;
    b=y;
    System.out.println("Constructor with two arguments");
    System.out.println("VAlue of a="+a+"and b="+b);
  }
}
