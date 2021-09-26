import java.util.Scanner;

public class table{
public static void main (String[] args){
    // System.out.println("Hello World");
    // A Program that will take input from user and based on that will print table
    System.out.println("Input A num To Print Table ");
    Scanner sc=new Scanner (System.in);
    short num=sc.nextShort();
    int table;
    
//    System.out.println(num*10);
    // Logic Start Here
    for (short i=1;i<=10;i++){
          table=num*i;
         System.out.println(num + "*" + i + "="+ table);
    }

 }


}