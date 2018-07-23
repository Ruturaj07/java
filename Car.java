/*Create Separate Engine, Tyre, and Door Class. Create a Car class using these classes.
And show functionality of each component in the car.*/
import java.util.*;

class Tyre{
	int numTyres;
	double airPressure;
	String company;
	Tyre(int n,double a, String c){
		numTyres=n;
		airPressure=a;
		company=c;
	}
	public void display(){
		System.out.println("\nTyre:"+company+"\n\tAir Pressure:"+airPressure+"\n\tNumber of Tyres :"+numTyres); 	
	}
}

class Door extends Tyre{
	String opening;
	int number;
	Door(int n,double a, String c,String o, int nu){
		super(n,a,c);
		opening = o;
		number = nu;
	}
	public void display(){
		super.display();
		System.out.println("\nDoor :\n\tOpening:"+opening+"\n\tNumber:"+number);	
	}
}
class Engine extends Door{
	double torque;
	double horsePower;
	int strokes;
	String type;
	String company;
	Engine(int n,double a, String c,String o, int nu,double t, double h, int s, String ty, String co){
		super(n,a,c,o,nu);
		torque=t;
		horsePower=h;
		strokes=s;
		type=ty;
		company=co;
	}
	public void display(){
		super.display();
		System.out.println("\nEngine :"+company+"\n\tHorse Power :"+horsePower+"\n\tStrokes:"+strokes+"\n\tType:"+type+"\n\tTorque:"+torque);
	}
}


class Car extends Engine{
	String CarName;
	Car(int n,double a, String c,String o, int nu,double t, double h, int s, String ty, String co,String car){
		super(n,a,c,o,nu,t,h,s,ty,co);
		CarName = car;	
	}
	public void display(){
	
	System.out.println("Car : "+CarName);	
	super.display();
	}
public static void main(String a[]){
	Car c1 = new Car(4,32.2,"MRF","Vertical",4,800.2,600,6,"Hybrid","Merlin","Mercedes");
	
	c1.display();
}
}
