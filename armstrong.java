import java.util.Scanner;
import java.math.*;
public class armstrong {
    public static void main (String[] args){
        // A PRogram For finding a no. that is a armstrong no. or not
        int num;
System.out.println("Enter A nO to check armstrong no");
        Scanner sc = new Scanner(System.in);
num=sc.nextInt();
// Logic Start here 
// Armstrong no means 
// 1^1=1,2^1=2 ,153=1^3+5^3+3^3=153 These are armstrong numbers
int last;
double sum=0;
int length=String.valueOf(num).length();
int temp =num;
// System.out.print(length);
     while(temp>0){
         last=temp%10;
         sum += Math.pow(last,length);
        temp=temp/10;
     }
     
if (num==sum){
    System.out.println("Its A Armstrong number ");

}
else
    System.out.println("Its not a armstrong no.");

       
        
    }
}
