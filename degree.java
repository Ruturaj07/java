
import java.util.*;
class degree{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
	//*1.8+32	
	int choice;
	double temp,res;
	do{
		System.out.println("\n\n\nEnter Choice:\n1.Degree to Farenheit\n2.Farenheit to Degree\n3.Exit\nChoice:");
		choice = sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Enter in Degree:");
				temp = sc.nextDouble();
				res = ((temp*1.8)+32);
				System.out.println("In Farenheit :"+res);
				break;
			}
			case 2:{			
				System.out.println("Enter in Farenheit:");
				temp = sc.nextDouble();
				res = ((temp-32)/1.8);
				System.out.println("In Degree :"+res);
				break;
			}
			case 3:{
				break;
			}
	}}while(choice!=3);	
	}
}
