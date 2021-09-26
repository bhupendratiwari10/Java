class Rectangle{
  public float area(float length,float breadth){
        float area=length*breadth;
        return area;
    }
}
public class CreatingMultipleObject {
    public static void main(String[] args){
        // Here We are creating multiple objects in same line]
        Rectangle r1=new Rectangle(),r2=new Rectangle(),r3=new Rectangle();
      float first=  r1.area(15,20);
      float second=  r2.area(20,25);
        r3.area(50, 60);
        System.out.println(first);
        // System.out.println(r1);
        // System.out.println(r2);
        
    }
}
