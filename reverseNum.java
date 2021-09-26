// import java.lang.Math;
import java.util.Scanner;
public class reverseNum {
   public static void main(String[] args){
    //    -------------------------Reverse a number using while loop-------------------------
//        
// System.out.println("Input A Number To Print its reverse number ");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
     
//        int reverse=0;
//        int remainder;
//        while( num!=0){
//            remainder=num%10;
//            reverse=reverse*10+remainder;
//            num=num/10;
//        }
//        System.out.println(reverse);
//    } 
// ----------------Reverse a number using for loop------------------------

System.out.println("Input A number to find its inverse number ");
int num;
Scanner sc=new Scanner (System.in);
num=sc.nextInt();
int reverse=0;
int remainder;
for(;num!=0; num=num/10){
    remainder=num%10;
    reverse=reverse*10+remainder;
}
System.out.println(reverse);
   }
}
