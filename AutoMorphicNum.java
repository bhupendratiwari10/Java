import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class AutoMorphicNum {
    
    public static void main(String[] args){
        // Defination of a automorphic no - A no is a auto morphic no when its squre inculde same number at last 
        // means --25^25=625 here 25 is a auto morphic number
        // -------------Logic start here--------------------
        int num;
        System.out.println("Input a num to check Automorphic Identity ");

        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
int remainder;
int num_last_digit=num%10;
int temp_num=num;
temp_num=temp_num/10;
        int square=num*num;
        int temp=square;
        int length=String.valueOf(num).length();
        // Here we can include two loops 
        for(int i=1; i<=length;i++){
            remainder=temp%10;
            for (;num>0;num=num/10)
            num_last_digit=num%10;
            if(remainder==num_last_digit){
                
            }
            else{
                System.out.println("THis is not a Automorphic number ");
                break;
            }


        }

    }
}
