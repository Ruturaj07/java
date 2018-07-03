import java.util.*;
class palim{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter String :");
		String str = sc.next();
		boolean flag = false;
		for(int i=0;i<((str.length())/2);i++){
			if(str.charAt(i)==str.charAt(str.length()-(i+1)))
				flag = true;
			else{
				flag=false;
				break;			
			}	
		}
		if(flag)
			System.out.println(str+" is palimdrome");
		else
			System.out.println(str+" is NOT palimdrome");
		
	}
}
