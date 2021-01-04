public class ConstructorInheritance {
  public static void main(String args[]){
    F f=new F();
  }
}
class E{
  E(){
    System.out.println("Constructor E is invoked");
  }
}
class F extends E{
  F(){
  System.out.println("Constructor F is invoked");
  }
}