
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class linkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

