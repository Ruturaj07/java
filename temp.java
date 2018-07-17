/*Create Vehicle Interface with name, maxPassanger, and maxSpeed variables. Create LandVehicle and SeaVehicle Inteface from Vehicle interface. LandVehicle has numWheels variable and drive method. SeaVehicle has displacement variable and launchmethod. Create Car class from LandVehicle, HoverCraft from LandVehicle and SeaVehicle interface. Also create Ship from SeaVehicle. Provide additional methods in HoverCraft as enterLand and enterSea. Similarly provide other methods for class Car and Ship. Demonstrate all classes in a application.
*/	
interface Vehicle{
	String name;
	double maxPassanger;
	double maxSpeed;
}

interface LandVehicle extends Vehicle{
	int numWheels;
	public void drive();
}

interface SeaVehicle extends Vehicle{
	double displacement;
	public void launch();
}
//********************************


class Car implements Landvehicle{
	public void drive(){
		System.out.println("driving car");		
	}
	
}

class HoverCraft implements Landvehicle,SeaVehicle{
	public void enterLand(){System.out.println("entering land HoverCraft");}
	public void enterSea(){System.out.println("entering sea HoverCraft");}
	public void launch(){System.out.println("launching HoverCraft");}
	public void drive(){System.out.println("driving HoverCraft");}
}

class Ship implements SeaVehicle{
	public void launch(){System.out.println("launching ship");}
}

class application {
}

