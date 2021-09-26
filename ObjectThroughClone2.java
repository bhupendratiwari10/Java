public class ObjectThroughClone2 implements Cloneable {
    // String str=" I Hava created this object with clone method";
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    String str2=" I Hava created this object with clone method";
    public static void main(String[] args){
ObjectThroughClone2 obj1=new ObjectThroughClone2();
try{
    // New Object 
    ObjectThroughClone2 obj2=(ObjectThroughClone2) obj1.clone();
    System.out.println(obj2.str2);
}
catch(CloneNotSupportedException e){
    e.printStackTrace();
}
    }
    
}
