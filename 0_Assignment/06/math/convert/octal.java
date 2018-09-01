package math.convert;

import java.util.*;
public class octal{
	public static String toOctal(int data){
		String BinRes = decimal.toBinary(data);
		int len = BinRes.length();
		int count=0;
		boolean notFirst = false;
		String temp="";
		int t1=0;
		for(int i =len-1;i>=0;i--){
			char c = BinRes.charAt(i);
			int r =Character.getNumericValue(c);
			if(count%3==0){
				if(notFirst)
					temp = temp.concat(String.valueOf(t1));
				t1=0;				
				t1=t1+(r*1);	
					
			}
			else if(count%3==1){
				t1=t1+(r*2);			
			}
			else if(count%3==2){
				t1=t1+(r*4);			
			}
			count++;
			if(len%3==1){
				if(i==0){
					int r1=0;
					r1=r1+(r*1);
					temp = temp.concat(String.valueOf(r1));
				}			
			}
			if(len%3==2){
				if(i==1){
					int r1=0;
					r1=r1+(r*1);
											char cz = BinRes.charAt(i-1);
								int rz =Character.getNumericValue(cz);
										r1=r1+(rz*1);
					temp = temp.concat(String.valueOf(r1));
				}			
			}
			notFirst=true;		
		}	
			 String reverse = "";
        
        
        for(int i = temp.length() - 1; i >= 0; i--)
        {
            reverse = reverse + temp.charAt(i);
        }
	
	return reverse;
	}
}
