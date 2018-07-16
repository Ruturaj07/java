	
interface Vehicle{
	String name;
	double maxPassanger;
	double maxSpeed;
}

interface LandVehicle extends Vehicle{
	int numWheels;
	public void drive(){
	}
}

interface SeaVehicle extends Vehicle{
	double displacement;
	public void launch(){
	}
}
