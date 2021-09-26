import java.util.Scanner;

class Area{
    double lenth,bredth;
    Area(){
        System.out.println("Enter THe lenth of rectangler");
        Scanner sc=new Scanner(System.in);
        lenth=sc.nextDouble();
        System.out.println("Enter THe bredth of rectangler");
        Scanner sc2=new Scanner(System.in);
        bredth=sc.nextDouble();

    }
    double area(){
        return lenth*bredth;
    }
}
public class RectangleArea{
    public static void main(String [] args){
Area rectangle=new Area();
double area=rectangle.area();
System.out.println(rectangle.area());
    }
}