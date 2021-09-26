import java.util.Scanner;
public class swap_num{
	
	public static void circlearea(){
		int r=10;
		float pie=3.14f;
		float area=pie*r*r;
		System.out.println("Area Of Circle is ");
		System.out.println(area);
		//return (area);
	}
	public static void fibonacci(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Number of terms you want to print in a fibonacci series");
		int n=sc.nextInt();
		
		int first=0;
		//int n=20;
		int second=1;
		int next;
		// Logic Starts here
		int i=0;
		System.out.println("Fibonacci Series is ");
		while (i<=n){
			if (i<=1)
				next=i;
		
		else{
		next=first+second;
		first=second;
		second=next;
		
		}
		System.out.println( next);
i++;	
		}	
		
	}
	public static void main(String args[]){
		int a=10;
		int b=20;
		circlearea();
		fibonacci();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}