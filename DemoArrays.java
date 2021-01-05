class ArrayOp{
  static void print(int b[]){
  for(int i :b){
    System.out.println(i);
  }
}
  int max(int b[]){
    int max=b[0];
    for(int i=0;i<b.length;i++){
      if(max<b[i]){
        max=b[i];
      }
    }
     return max;
}
  int min(int b[]){
    int min=b[0];
    for(int i=0;i<b.length;i++){
      if(min>b[i]){
        min=b[i];
      }
    }
    return min;
}
  int adds(int b[]){
    int sum=0;
    for(int i=0;i<b.length;i++){
      sum+=b[i];
      }
    return sum;
  }
}
public class DemoArrays {
  public static void main (String args[]){
    int b[]={3,4,5,7,8,4,2,45,7};
    ArrayOp.print(b);
    ArrayOp ao=new ArrayOp();
    System.out.println("maximun is"+"  "+ao.max(b));
    System.out.println("minimum is"+"  "+ao.min(b));
    System.out.println("sum is"+"  "+ao.adds(b));
  }
}

