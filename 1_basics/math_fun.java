import java.util.*;
class mathematics__{
	int a,b,sum,mul,sub;
	double div;
	
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();	
	}

	void add(){
		sum=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+sum);
	}

	void sub(){
		sub=a-b;	
		System.out.println("Substraction of "+a+" and "+b+" is "+sub);
	}

	void mul(){
		mul=a*b;	
		System.out.println("Multiplication of "+a+" and "+b+" is "+mul);
	}

	void div(){
		div=((double)a)/b;
		System.out.println("Division of "+a+" and "+b+" is "+div);

	}
		
}
class math_fun{
	public static void main(String a[]){
		mathematics__ m1 = new mathematics__();		
		m1.getData();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
	}
}
