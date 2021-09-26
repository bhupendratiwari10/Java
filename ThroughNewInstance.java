public class ThroughNewInstance {
    String str2="Through Second Object";
    void NamePrinting(){
        System.out.println("My Name is Bhuvi And I am Created through newinstance of method");
    }
    public static void main(String[] args){
        try{
            ThroughNewInstance obj1=ThroughNewInstance.class.newInstance();
            obj1.NamePrinting();
        }
        catch(InstantiationException e){
e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
        catch(ExceptionInInitializerError e){
            e.printStackTrace();
        }
        try{
            ThroughNewInstance obj2=ThroughNewInstance.class.newInstance();
           System.out.println(obj2.str2);
        }
        catch(InstantiationException e){
            e.printStackTrace();
        }
        catch(IllegalAccessException e){
e.printStackTrace();
        }
        catch(ExceptionInInitializerError e){
            e.printStackTrace();
        }
    }
}
