// Take file name as input to your program, If file is existing the open and display contents
// of the file. After displaying contents of file ask user – do you want to add the data at the
// end of file. If a user gives yes as response, then accept data from user and append it to
// file. If file in not existing then create a fresh new file and store user data into it. User
// should type exit on new line to stop the program.

import java.util.*;
import java.io.*;

class fileReadWrite{
	public static void main(String a[]){
	FileReader fr = null;
	try{
		fr = new FileReader(a[0]);
		BufferedReader br = new BufferedReader(fr);
		String str, str1;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		FileWriter fw = null;
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Are you want enter data in file :");
		char ch = (char)br1.read();
		if(ch=='y'){
			fr.close();
			fw = new FileWriter(a[0],true);
		}
		System.out.println("Enter the data \n Enter 'exit' to STOP :");
		while(!((str1=br1.readLine()).equals("exit"))){
			fw.write(str1);
			fw.write("\r\n");
		}
		fw.close();
	}
	catch(FileNotFoundException e){
		System.out.println("File not exists");
	}
	catch(IOException e){
		System.out.println(e);
	}
}
}