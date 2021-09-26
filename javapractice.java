import java.util.Scanner;

public class javapractice {
    //  A program for java practice
    public static void main(String[] args){
        System.out.println("Enter Four Charaters that will check if all are equals are not");
      System.out.println("Enter First Number");
        Scanner firstnum=new Scanner(System.in);
        short first_num=firstnum.nextShort();
      System.out.println("Enter Second Number");
        Scanner s_num=new Scanner(System.in);
        short second_num=firstnum.nextShort();
      System.out.println("Enter Third Number");
        Scanner t_num=new Scanner(System.in);
        short third_num=firstnum.nextShort();
      System.out.println("Enter Fourth Number");
        Scanner f_num=new Scanner(System.in);
        short fourth_num=firstnum.nextShort();
        // Logic Starts here 
        if((first_num==second_num) && (third_num==fourth_num)){
            System.out.println("Numbers Are Equal");

        }
        else{
            System.out.println("Not Equal");
        }
    }
}
