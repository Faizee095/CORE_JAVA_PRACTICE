class Employe{
  private String name;
  private int salary;
  private String cname;
  public void input(String n,int s,String c){
    name=n;
    salary=s;
    cname=c;
  }
  void show(){
    System.out.println(name+" "+salary+" "+cname);
  }
}


public class Abstraction {
  public static void main(String args[]){
    Employe e1 =new Employe();
    Employe e2 =new Employe();
    e1.input("Radhe", 1200, "pagalkhana");
    e2.input("Jethalal", 120000, "Gada Electronics");
    e1.show();
    e2.show();
  }
  

  
}
