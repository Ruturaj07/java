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
	box copy(box b){
		box r = new box();
		r.h=b.h;
		r.w=b.w;
		r.d=b.d;
		return r;	
	}
	public static void display(box b){
		System.out.println("Height = "+b.h+"\nWidth = "+b.w+"\nDepth = "+b.d+"\n");	
	}
}

class copyConReturningObject{
	public static void main(String a[]){

	box b1 = new box();
	b1.getData();
	box.display(b1);
	box b2 = new box();
	b2.copy(b1);
	box.display(b2);
	}
}
