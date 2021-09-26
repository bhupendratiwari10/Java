public class ObjectThroughClone implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    String str ="I Am Bhuvi";
    public static void main(String[] args){
        ObjectThroughClone obj1=new ObjectThroughClone();
        try{
        ObjectThroughClone obj2=(ObjectThroughClone) obj1.clone();
        System.out.println( "THis PRinting is from clone method " +obj2.str);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();

        }
    }
}
