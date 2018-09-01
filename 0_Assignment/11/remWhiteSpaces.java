// Write a program to remove whitespaces from a text file. Name of the file is given using
// command line.

import java.util.*;
import java.io.*;

class remWhiteSpaces{
	public static void main(String a[]){
	FileReader fr = null;
	FileWriter fw = null;
	try{
		fr = new FileReader(a[0]);
		fw = new FileWriter(a[1]);
		BufferedReader br = new BufferedReader(fr);
		String str,str1;
		while((str=br.readLine())!=null){
			str1=str.replaceAll("\\s+","");
			fw.write(str1);
		}
		fr.close();
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
