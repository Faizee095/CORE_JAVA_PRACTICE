// static variable
class Emplooye{
  private String name;
  private int salary;
  private static String cname;
  public void input(String n,int s){
    name=n;
    salary=s;
  }
  public void cinput(String c){
    cname=c;
  }
  void show(){
    System.out.println(name+" "+salary+" "+cname);
  }
}


public class Example {
  public static void main(String args[]){
    Emplooye e1 =new Emplooye();
    Emplooye e2 =new Emplooye();
    e1.cinput("Gada Electronics");
    e1.input("Bagha", 1200 );
    e2.input("Jethalal", 120000);
    e1.show();
    e2.show();
  }
}
