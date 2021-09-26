import java.util.Scanner;

public class pattern {
    public static void main(String [] args)
    {
        System.out.println("Input A Character To Print Pattern ");
        Scanner sc=new Scanner(System.in);
        char character=sc.next().charAt(0);
        System.out.println("   "+ character);
        System.out.println("   "+ character);
        System.out.println(character +"  "+ character);
        System.out.println(" "+ character+character+"  ");

    }
}
