import java.util.*;
class fact{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=num;i>0;i--){
			fact = fact* i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
