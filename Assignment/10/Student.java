/*Take Student information such as name, age, weight, height, city, phone from user and
store it in the file using DataOutputStream and FileOutputStream and Retrive data using
DataInputStream and FileInputStream and display the result.*/

import java.util.*;
import java.io.*;

class Student{
	public static void main(String a[]) throws IOException{
		
		
		FileOutputStream fout = null;
		try{
			fout = new FileOutputStream("s1.txt");
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");		
		}
		DataOutputStream dout = new DataOutputStream(fout);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		System.out.println("Enter Weight:");
		double weight = sc.nextDouble();
		System.out.println("Enter Height:");
		double height = sc.nextDouble();
		
		System.out.println("Enter City:");
		//sc.next();
		String city = sc.next();
		System.out.println("Enter phone number:");
		long phno = sc.nextLong(); 
		dout.writeUTF(name);
		dout.writeInt(age);
		dout.writeDouble(weight);
		dout.writeDouble(height);
		dout.writeUTF(city);
		dout.writeLong(phno);
		fout.close(); 
		
		
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("s1.txt");
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");		
		}
		DataInputStream din = new DataInputStream(fin);
		System.out.println("\n\n\n\n");
		System.out.println("Name:"+din.readUTF());
		System.out.println("Age:"+din.readInt());
		System.out.println("Weight:"+din.readDouble());
		System.out.println("Height:"+din.readDouble());
		System.out.println("City:"+din.readUTF());
		System.out.println("Phone number:"+din.readLong());

	}
}

