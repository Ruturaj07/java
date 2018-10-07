
import java.io.*;
import java.util.*;

public class linkedDemo {

	public static void main(String[] args) {

		File file = new File("./input.txt");
		BufferedReader reader = null;
		String st; 
		LinkedList<String> list = new LinkedList<>();
		
		try {
			reader = new BufferedReader(new FileReader(file));
			
			while ((st = reader.readLine()) != null) {
//			    System.out.println(st);
				list.add(st);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		for(int i = list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}


	}

}

