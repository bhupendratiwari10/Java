//   Working concept of Anonymous object
  
  class Calculation{
    void   square (int n){
System.out.println(n*n);
         
     }
   }
 public class AnonymousObject {
    
  public static void main (String[] args){
    //   Here We Have created a Anonymous object 
    // Calculation c=new Calculation();
new Calculation().square(5);
  }  
}
