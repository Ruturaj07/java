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
	rect r1 = new rect();
	triangle t1 = new triangle();
	circle c1 = new circle();
	
	double x;
	double y;
	System.out.println("Enter length and breadth of rectangle :");
	x=sc.nextDouble();
	y=sc.nextDouble();
	System.out.println("Area of rectangle is "+r1.compute(x,y));
	
	System.out.println("Enter base and height of triangle :");
	x=sc.nextDouble();
	y=sc.nextDouble();
	System.out.println("Area of triangle is "+t1.compute(x,y));
	
	
	System.out.println("Enter radius of circle :");
	x=sc.nextDouble();
	y=x;
	System.out.println("Area of triangle is "+c1.compute(x,y));
	
	}
}
