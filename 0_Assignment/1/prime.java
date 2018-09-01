import java.util.*;
class prime{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i=2;i<(num/2);i++){
			if(num%i==0){
				flag = false;
				break;
			}		
		}
		if(flag)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is NOT prime number");
	}
}
