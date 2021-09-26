import java.util.Scanner;

class volume {
double height;
double width;
double lenth;
 
  volume(){
      System.out.println("Enter Height : ");

Scanner sc=new Scanner(System.in);
 height=sc.nextDouble();
System.out.print("Enter Width :");
Scanner sc2=new Scanner(System.in);
 width=sc2.nextDouble();
System.out.println("Enter lenth :");
Scanner sc3=new Scanner(System.in);
 lenth=sc2.nextDouble();


}
double vol(){
   
   return  height*width*lenth;

}


}
public class demoMethod{
    
    public static void main(String [] args){
volume box1=new volume();
double vol;
vol = box1.vol();
System.out.print(vol);

    }
}
