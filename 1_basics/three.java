
import java.util.*;
class three{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Three Number :");
		int a1 = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		if(a1>b){
			if(a1>c){
				System.out.println(a+" is greater");
			}
			else{
				System.out.println(c+" is greater");
			}
		}
		else{
			if(b>c){
				System.out.println(b+" is greater");
			}
			else{
				System.out.println(c+" is greater");	
			}
		}
	}
}
