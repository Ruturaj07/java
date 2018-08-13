import java.util.*;
class errHandling{
	public static void main(String args[]){
		int a,b;
		try{
			b=5;
			a=b/0;
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
