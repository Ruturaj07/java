import java.util.*;
class mathematics_{
	int a,b,sum,mul,sub;
	double div;
	
}
class math_user{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		mathematics_ m1 = new mathematics_();
		System.out.println("Enter two numbers:");
		m1.a=sc.nextInt();
		m1.b=sc.nextInt();
		m1.sum=m1.a+m1.b;
		System.out.println("Addition of "+m1.a+" and "+m1.b+" is "+m1.sum);
		m1.sub=m1.a-m1.b;	
		System.out.println("Substraction of "+m1.a+" and "+m1.b+" is "+m1.sub);
		m1.mul=m1.a*m1.b;	
		System.out.println("Multiplication of "+m1.a+" and "+m1.b+" is "+m1.mul);
		m1.div=((double)m1.a)/m1.b;
		System.out.println("Division of "+m1.a+" and "+m1.b+" is "+m1.div);		
	
	}
}
