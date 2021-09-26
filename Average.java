import java.util.Scanner;

class average_num{
    int first_num,second_num,third_num;

    average_num(){
        System.out.println("Enter First num :");
        Scanner sc1=new Scanner(System.in);
        first_num=sc1.nextInt();
        System.out.println("Enter second num :");
        Scanner sc2=new Scanner(System.in);
        second_num=sc2.nextInt();
        System.out.println("Enter third num :");
        Scanner sc3=new Scanner(System.in);
        third_num=sc3.nextInt();
        
    }
    double average(){
        return (first_num+second_num+third_num)/3;
        
    }
}


public class Average{
    public static void main (String [] args){
        average_num average=new average_num();
        double averag=average.average();
        System.out.print("Average is : ");
        System.out.println(averag);
    }
}