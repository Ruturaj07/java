class mathematics{
	int a,b,sum,mul,sub;
	double div;
	
}
class maths{
	public static void main(String a[]){
		mathematics m1 = new mathematics();
		m1.a=10;
		m1.b=20;
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
