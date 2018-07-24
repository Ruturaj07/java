//MULTILEVEL INHERITANCE
class A{
	int a;
	A(int x){
		a=x;	
	}
	public void display(){
		System.out.println("A: display a = "+a);	
	}
}

class B extends A{
	int a;
	B(int x,int y){
		super(x);
		a=y;	
	}
	public void display(){
		super.display();
		System.out.println("B: display a = "+a);	
	}
}

class C extends B{
	int a;
	C(int x,int y,int z){

		super(x,y);
		a=z;	
	}
	public void display(){
		super.display();
		System.out.println("C: display a = "+a);	
	}
}

class multilevelInheritance{
	public static void main(String a[]){
		C obj = new C(1,2,3);
		obj.display();
	}
}
