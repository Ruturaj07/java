import java.util.*;
interface area{
	final double PI = 3.1415;
	double compute(double x,double y);
}

class rect implements area{
	public double compute(double x, double y){
		return x*y;	
	}
}

class triangle implements area{
	public double compute(double x, double y){
		return x*y/2;	
	}
}

class circle implements area{
	public double compute(double x, double y){
		return PI*x*y;	
	}
}
class interfaceArea{
	public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	area r1 = new rect();
	//area 
	//area 
	
	double x;
	double y;
	System.out.println("Enter length and breadth of rectangle :");
	x=sc.nextDouble();
	y=sc.nextDouble();
	System.out.println("Area of rectangle is "+r1.compute(x,y));
	
	r1 = new triangle();
	System.out.println("Enter base and height of triangle :");
	x=sc.nextDouble();
	y=sc.nextDouble();
	System.out.println("Area of triangle is "+r1.compute(x,y));
	r1 = new circle();
	
	System.out.println("Enter radius of circle :");
	x=sc.nextDouble();
	y=x;
	System.out.println("Area of triangle is "+r1.compute(x,y));
	
	}
}
