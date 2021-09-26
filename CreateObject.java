public class CreateObject implements Cloneable{
   
   protected  CreateObject(){
        System.out.println("THis object created from new method");

    }
public static void main(String [] args){
    // Creating an object with new method 
    CreateObject obj1=new CreateObject();
    // CreateObject obj2=(CreateObject)obj1.clone();
}

}