package math.convert;

import java.util.*;
public class decimal{
	public static String toBinary(int data){
		String temp="";
		int rem;
		while(data!=0){
			rem=data%2;
			data=data/2;
			temp = temp.concat(String.valueOf(rem));
		}	
	 String reverse = "";
        
        
        for(int i = temp.length() - 1; i >= 0; i--)
        {
            reverse = reverse + temp.charAt(i);
        }
	
	return reverse;
	}
}
