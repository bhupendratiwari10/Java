class overload{
    void namePrint(String a){
System.out.println(a);
    }
    void namePrint(int a,int b){
        System.out.println(a+b);
    }
}
public class methodOverload {
    int d=20;
    public static void Main(String[] args){
        overload a=new overload();
        int sum;
        a.namePrint("Bhuvi");
      a.namePrint(5,6);
      System.out.println(d);
    }
}
