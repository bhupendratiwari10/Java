import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        double random=Random.class.getModifiers();
        System.out.println(random);
        // Random Number Generator through Math Class
        int random1=(int) Math.random()*(400-200+1)+200;
        System.out.println("Random Number using math class "+random1);
        // Random Number Generator through random class
        Random random2=new Random();
        // It Will   Generate Random number between 1 to 50
int random3=random2.nextInt(50);
System.out.println("Random number through random clss "+random3);


    }
}
