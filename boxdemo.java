import java.util.*;
class box{
	double h,w,d;
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height, width and depth :");
		h=sc.nextDouble();
		w=sc.nextDouble();
		d=sc.nextDouble();
	}
	void volume(){
		System.out.println("Volume :"+(h*w*d));		
	}
}

class boxdemo{
	public static void main(String a[]){

	box b1 = new box();
	b1.getData();
	b1.volume();
	}
}
