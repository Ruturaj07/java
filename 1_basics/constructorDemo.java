import java.util.*;
class box{
	double h,w,d;
	//Default Constructor	
	box(){
		this.h=0;
		this.w=0;
		this.d=0;
	}

	//Parameterized Constructor
	box(double h,double w,double d){		
		this.h=h;
		this.w=w;
		this.d=d;	
	}
	void volume(){
		System.out.println("Volume :"+(h*w*d));		
	}
}

class constuctorDemo{
	public static void main(String a[]){	
	System.out.println("Calling Empty Constructor....");
	box b1 = new box();
	b1.volume();
	System.out.println("\nCalling Parameterized Constructor....");
	box b4 = new box(5,6,7);
	b4.volume();
	}
}
