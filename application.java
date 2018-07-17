/*Create Vehicle Interface with name, maxPassanger, and maxSpeed variables. Create LandVehicle and SeaVehicle Inteface from Vehicle interface. LandVehicle has numWheels variable and drive method. SeaVehicle has displacement variable and launchmethod. Create Car class from LandVehicle, HoverCraft from LandVehicle and SeaVehicle interface. Also create Ship from SeaVehicle. Provide additional methods in HoverCraft as enterLand and enterSea. Similarly provide other methods for class Car and Ship. Demonstrate all classes in a application.
*/	
interface Vehicle{
	String name="";
	int maxPassanger=0;
	double maxSpeed=0;
}

interface LandVehicle extends Vehicle{
	int numWheels=0;
	public void drive();
}

interface SeaVehicle extends Vehicle{
	double displacement=0;
	public void launch();
}
//********************************


class Car implements LandVehicle{
	String name;
	int maxPassanger;
	double maxSpeed;
	int numWheels;
	Car(String n, int p,double s, int w){
		name = n;
		maxPassanger = p;
		maxSpeed = s;
		numWheels = w;
	}
	public void drive(){
		System.out.println("\n\nCar : "+name+"\n Maximum Passangers\t: "+maxPassanger+"\n Maximum Speed \t\t: "+maxSpeed+"Km/Hr\n Wheels \t\t: "+numWheels);		
	}
	
}
class HoverCraft implements LandVehicle,SeaVehicle{
	String name;
	int maxPassanger;
	double maxSpeed;
	int numWheels;
	double displacement;
	HoverCraft(String n, int p,double s, int d,int w){
		name = n;
		maxPassanger = p;
		maxSpeed = s;
		displacement = d;
		numWheels = w;
	}
	public void enterLand(){System.out.println("\n\nHoverCraft : Activated Land Mode");}
	public void drive(){System.out.println("HowerCraft : "+name+"\n Maximum Passangers\t: "+maxPassanger+"\n Maximum Speed \t\t: "+maxSpeed+"Km/Hr\n Wheels \t\t: "+numWheels);}
	public void enterSea(){System.out.println("\n\nHoverCraft : Activated Sea Mode");}
	public void launch(){System.out.println("HoverCraft : "+name+"\n Maximum Passangers\t: "+maxPassanger+"\n Maximum Speed \t\t: "+maxSpeed+"Km/Hr\n Displacement\t\t: "+displacement);}
	
}

class Ship implements SeaVehicle{
	String name;
	int maxPassanger;
	double maxSpeed;
	double displacement;
	Ship(String n, int p,double s, int d){
		name = n;
		maxPassanger = p;
		maxSpeed = s;
		displacement = d;
	}
	public void launch(){
		System.out.println("\n\nShip : "+name+"\n Maximum Passangers\t: "+maxPassanger+"\n Maximum Speed \t\t: "+maxSpeed+"Km/Hr\n Displacement\t\t: "+displacement);
	}
}

//**********************************************
class application {
	public static void main(String a[]){
		Car c1 = new Car("Audi Q3",4,250.0,4);
		HoverCraft h1 = new HoverCraft("Autanic",500,100,100,12);
		Ship s1 = new Ship("Titanic",3000,50,100);
		
		c1.drive();
		h1.enterSea();
		h1.launch();
		h1.enterLand();
		h1.drive();
		s1.launch();
	}
}

