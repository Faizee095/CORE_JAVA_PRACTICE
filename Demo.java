// Static Block
class Demo {
  static int i=10;
  static{
    System.out.println("This is static block"+i);
  }
  public static void main(String args[]) {
    System.out.println("This is inside the main block");
    B b1=new B();
    b1.show();
  }
}

class B{
  static int x;
  void show(){
    System.out.println("Hello"+x);
  }
  static{
    x=5;
    System.out.println("hi"+x);
  }
}
