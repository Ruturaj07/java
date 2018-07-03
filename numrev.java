import java.util.*;
class numrev{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int newnum = 0;
		
		while(num!=0){
			
			int rem = num%10;
			//System.out.println(newnum*10+rem);
			newnum =newnum*10+rem;
			num = num/10;

		}
		System.out.println(newnum);
	}
}
