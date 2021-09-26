import java.util.Scanner;

public class javapractice2 {
    public static void main(String[]  args){
System.out.println("Input Double Numbers");
System.out.println("Input First Number");
Scanner num1=new Scanner(System.in);
double num01=num1.nextDouble();
System.out.println("Input Second Number");
Scanner num2=new Scanner(System.in);
double num02=num2.nextDouble();
if ((num01 > 0 && num01 <1)&& (num02 > 0 &&
num02 <1)){
    System.out.println("Both Values "+num01+ " And " + num02 +" Are Between 0 and 1");
}
else{
    System.out.println("Condition not satisfied");
}
    }
}
