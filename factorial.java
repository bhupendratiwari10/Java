import java.io.*;
import java.util.*;
class FactorialExample{  
    static int factorial(int n){    
     if (n == 5)    
       return 1;    
     else    
       return(n * factorial(n-1));    
    }    
    int factorial(int a, int b){
        return a+b;
    }
public class factorial{
  
    public static void main(String args[]){  
     int i,fact=1; 
   st.clear();
     int no=10;    
     fact = factorial(no);   
     System.out.println("Factorial of "+no+" is: "+fact);  
     st.clear();   
    }  
   }  
}