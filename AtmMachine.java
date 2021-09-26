import java.util.Scanner;
import java.lang.System;
import javax.lang.model.util.ElementScanner14;
public class AtmMachine {
   public static void main(String[] args){
       double total_amount =1000000.00;
       System.out.println("---------------Welcome TO Apna ATM-------------------- ");
       System.out.println("Please Inter Your Choice ");
System.out.println("Press 1 for Withrawn money");
System.out.println("Press 2 for Check Balance");
System.out.println("Press 3 for Deposit money");
System.out.println("Press 4 for Exit ");
// System.out.println("Press Your Input ");
int choice;
Scanner sc=new Scanner (System.in);
choice =sc.nextInt();
// For Screen Clear
System.out.print("\033[H\033[2J");  
switch(choice){
    case 1:
    System.out.println("Enter Amount You want to withraw ");
    double w_amount;
    Scanner w_sc=new Scanner(System.in);
    w_amount=w_sc.nextDouble();
    if (w_amount<total_amount){
        total_amount=total_amount-w_amount;
        System.out.println("Your Remaining balance is " + total_amount);
       
    }
 else {
     System.out.println("Insufficiant Balance ");
 }
 break;
 case 2:
 System.out.println("Your Total Balance is " +total_amount);
break;

case 3:
System.out.println("Enter Amount you want to deposit ");
double d_amount ;
Scanner d_sc=new Scanner(System.in);
d_amount=d_sc.nextDouble();
total_amount=total_amount+d_amount;
System.out.println("Your Total Balance is " + total_amount);
break;

case 4:
System.exit(0);
default:
System.out.println("Incorrect Attempt : ");
   } 
}
}
