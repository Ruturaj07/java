import java.util.*;
import java.io.*;

class Student{
	public static void main(String a[]){
		
		/*
		FileOutputStream fout;
		try{
			fout = new FileOutputStream("s1.txt");
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");		
		}
		DataOutputStream dout = new DataOutputStream(fout);
		/*Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		dout.writeUTF(name);
		dout.writeInt(age);
		fout.close(); 
		
	}
}

