import java.util.*;

class queue{
	int front = -1;
	int rear = -1;
	int[] Q = new int[100];
	public void Enque(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elemets to add :");
		int toAdd = sc.nextInt();
		if(front==-1&&rear==-1){
			front++;
			rear++;	
			Q[rear]=toAdd;
			System.out.println(toAdd+" is added to queue");
		}
		else if(rear>=0&&rear<100){
			rear++;
			Q[rear]=toAdd;
			System.out.println(toAdd+" is added to queue");
		}
		else{
			System.out.println("Queue is Full");
		}
		
		
}

public void Deque(){
	if(front==-1){
			System.out.println("Queue is Empty");
	}
	else if(front>rear){
			System.out.println("Queue is Empty");
	}
	else if(front>=0&&front<=99){
			int temp = Q[front];
			Q[front]=0;
			front++;
			System.out.println(temp+" is removed to queue");			
	}
}

public void display(){
		if(front==-1&&rear==-1){
			System.out.println("Queue is Empty");
		}	
		else{
			System.out.println("\nQueue:");
			for(int i=front;i<=rear;i++){
				System.out.print("\t"+Q[i]);
			}
			System.out.println("\n");
		}
}
}


class queueDemo{
public static void main(String a[]){
	queue q = new queue();
	Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 To add \nPress 2 to delete \nPress 3 to display \nPress 4 to quit\nCHOICE:");
	int choice = sc.nextInt();
	while(choice!=4){
		
		switch(choice)
		{
			
			case 1:
				q.Enque();
				break;
			case 2:
				q.Deque();
				break;
			case 3:
				q.display();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Choice");
				break;			
		}
System.out.println("\n\nPress 1 To add :\nPress 2 to delete :\nPress 3 to display :\nPress 4 to quit");
			choice = sc.nextInt();
	}
}
}
