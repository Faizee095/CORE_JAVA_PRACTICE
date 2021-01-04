class Employee{
  String name;
  int salary;
  String cname;
}


public class example {
  public static void main(String args[]){
    Employee e1 =new Employee();
    Employee e2 =new Employee();
    e1.name="Robert";
    e1.salary=23000;
    e1.cname="GArbage";
    e2.name="JArvis";
    e2.salary=23040;
    e2.cname="teapot";
    System.out.println(e1.name+" "+e1.salary+" "+e1.cname);
    System.out.println(e2.name+" "+e2.salary+" "+e2.cname);
  }
  

  
}
