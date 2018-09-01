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
	public static int frBinToDec(String str){
		return Integer.parseInt(str,2);	
	}
	public static int frOctToDec(String str){
		return Integer.parseInt(str,8);	
	}
	public static int frHexToDec(String str){
		return Integer.parseInt(str,16);	
	}
}
