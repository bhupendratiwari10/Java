import java.util.Scanner;

// This is a important program that illustrate the polymorphism property of java
// Here We Will Overload the methods
class square{
 float sq(float num){
return num*num;
}
}
public class important{
    public static void main (String[] args){
    //    Here We Are an integer variable and then we will call a function that will contain float parameter
        int num;
        float sq;
        square demo=new square();
        System.out.println("Enter the number you want to print square ");
        // Scanner sc = new Scanner(System.in);
       Scanner sc =new Scanner(System.in);
       num=sc.nextInt();
sq=demo.sq(num);
System.out.print(sq);

    }
}