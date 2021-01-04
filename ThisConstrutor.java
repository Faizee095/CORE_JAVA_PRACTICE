// "This" keyword for comstructor chaning

public class ThisConstrutor {
  public static void main(String args[]) {
    D d1=new D();
    D d2=new D(4);
    D d3=new D(4,7);
  }
}
class D{
  D(){
    System.out.println("Constructor with no arguments");
  }
  D(int a){
    System.out.println("Constructor with one arguments");
  }
  D(int x,int y){
    this(y);
    System.out.println("Constructor with two arguments");
  }
}
