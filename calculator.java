//import java.security.cert.Extension;
import java.util.Scanner;

//import jdk.javadoc.internal.tool.resources.javadoc;

public class calculator {
public static void main(String[] args) {
//   Calculator in java
// Message For User 
System.out.println("Input First Num : ");
Scanner sc=new Scanner(System.in);
short first_num=sc.nextShort();
int result;
System.out.println("Input Second NUmber : ");
Scanner new_sc=new Scanner(System.in);
short s_num =new_sc.nextShort();
System.out.println("Input Symbol You want To perform Operation (+,-,*,%,/)");
Scanner symbol=new Scanner(System.in);
char o_symbol=symbol.next().charAt(0);
// Actual Code For calculator
switch(o_symbol){
    case '+':
    System.out.println(first_num+s_num);
  break;
  case '-':
  System.out.println(first_num-s_num);
  break;
   case '*':
   System.out.println(first_num*s_num);
   break;
   case '/':
   System.out.println(first_num/s_num);
   break;
   default:
  System.out.println("Please enter correct operator");
}
// System.out.println(result);                                    
}
}
