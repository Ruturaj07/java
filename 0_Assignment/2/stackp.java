import java.util.*;

class stackp{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);	
		int stackptr[] = new int[100];
		int top=-1;
		int choice,temp;
		do{
		System.out.println("Enter Choice:\n1.Push\n2.Pop\n3.Display\n4.Exit\n\n\nChoice:");
		choice = sc.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Enter element to push");
				temp = sc.nextInt();
				if(top==0){
					top++;
					stackptr[top]=temp;
					
				}
				else if(top==99)
					System.out.println("Stack overflow");
				else{
					top++;
					stackptr[top]=temp;
				//	System.out.println(top);	
					
				}
				break;
			}
			case 2:{
				if(top>=0){
					temp=stackptr[top];
					top--;
					System.out.println(temp+" is poped");
				}
				else{
					System.out.println("Stack Underflow");
				}
				break;
			}
			case 3:{
				System.out.println("Stack :");
				for(int i=0;i<=top;i++){
					System.out.print("\t"+stackptr[i]);
				}
				System.out.println("\n");
				break;
			}
			case 4:{
				break;
			}
		}
		}while(choice!=4); 				
	}
}
