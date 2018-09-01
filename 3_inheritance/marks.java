import java.util.*;

interface NCC{
	int BonusMarks = 10;
}

class subMarks implements NCC{
	public int sub1,sub2,sub3,sub4,sub5,total;
	public double perce;
			Scanner sc = new Scanner(System.in);
	public void enterMarks(){

		System.out.println("Enter marks for five subjects:");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		sub4 = sc.nextInt();
		sub5 = sc.nextInt();
	}
	public void calcTotal(){
		total=sub1+sub2+sub3+sub4+sub5;
		int isNcc=0;
		System.out.println("Did you praticipated in NCC Press 1 for yes else 0:");
		isNcc = sc.nextInt();
		if(isNcc==1)
			total+=BonusMarks;
		//return total;
	}
	public double calcPer(){
		perce =total/5;
		return perce;
	}
	
}

class marks extends subMarks implements NCC{
	public static void main(String a[]){
		subMarks s = new subMarks();
		s.enterMarks();
		s.calcTotal();
		double per = s.calcPer();
		
		
		System.out.println("Percentage :"+per+" %");
		
	}
}
