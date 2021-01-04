public class DefaultConstructor {
  public static void main(String args[]) {
    A a1=new A();
    A a2=new A(4);
    a1.display();
    a2.display();
  }
}

class A{
  int x;
  A(){
    x=2;
    System.out.println("Hello Object");
  }
  A(int a){
    x=a;
    System.out.println("Hello para object");
  }
  void display(){
    System.out.println("value of x="+x);
  }
}