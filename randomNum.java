import java.util.Random;
import java.lang.*;

public class randomNum{
    public static void main(String[] args){
        // PRogram For Generating Random number from deiffrent types
//Using The random () Method
System.out.println(" First Random no is "+ Math.random());
System.out.println(" Second Random no is "+ Math.random());
System.out.println(" Third Random no is "+ Math.random());
System.out.println(" Fourth Random no is "+ Math.random());
// Random Value between a specified range
int min=100;
int max=200;
System.out.println("Double Value of a specified range " + Math.random()*(max-min+1)+min);
int random=(int) (Math.random()*(max-min+1)+min);
System.out.println("Value in integer Form "+ random);
// Int Random number Using the random class 
Random random1 =new Random();
random=random1.nextInt(190);
System.out.println("This Number is genretated from random class " + random);
// Float Random Number using random Class
float floatRandom;
Random random2=new Random();
 floatRandom= (float) (random2.nextFloat());
 System.out.print("This is float random number " +floatRandom);
 System.out.println();


//  The above methods parse a parameter bound (upper) that must be positive. It returns corresponding randomly generated value between 0 (inclusive) and the specified bound (exclusive). It throws IllegalArgumentExcetion if the bound is negative.
//  nextInt(int origin, int bound)
// nextDouble(int origin, int bound)
// nextLong(int origin, int bound)

//                          -------------Source Java t Point program chapter-----------------
    }
}