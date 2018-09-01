package math.convert;

import java.util.*;
public class hex{
	public static String toHex(int data){
		String BinRes = decimal.toBinary(data);
		int len = BinRes.length();
		int count=0;
		boolean notFirst = false;
		String temp="";
		int t1=0;
		for(int i =len-1;i>=0;i--){
			char c = BinRes.charAt(i);
			int r =Character.getNumericValue(c);
			
			if(count%4==0){
				
				if(notFirst){
					if(t1>=0&&t1<=9){
						temp = temp.concat(String.valueOf(t1));}
					else{
						switch(t1){
							case 10:{
								temp = temp.concat("A");
								break;
							}
							case 11:{
								temp = temp.concat("B");
								break;
							}
							case 12:{
								temp = temp.concat("C");
								break;
							}
							case 13:{
								temp = temp.concat("D");
								break;
							}
							case 14:{
								temp = temp.concat("E");
								break;
							}
							case 15:{
								temp = temp.concat("F");
								break;
							}
						}
					}
				}
				t1=0;				
				t1=t1+(r*1);	
					
			}
			
			else if(count%4==1){
				t1=t1+(r*2);			
			}
			else if(count%4==2){
				t1=t1+(r*4);			
			}
			else if(count%4==3){
				t1=t1+(r*8);			
			}
			count++;
			notFirst=true;
			
			if(len%4==1){
				if(i==0){
					int r1=0;
					r1=r1+(r*1);
					temp = temp.concat(String.valueOf(r1));
				}			
			}
			if(len%4==2){
				if(i==1){
					int r1=0;
					r1=r1+(r*1);
					char cz = BinRes.charAt(i-1);
					int rz =Character.getNumericValue(cz);
					r1=r1+(rz*2);
					temp = temp.concat(String.valueOf(r1));
				}			
			}
			if(len%4==3){
				if(i==2){
					int r1=0;
					r1=r1+(r*1);
					char cz = BinRes.charAt(i-1);
					int rz =Character.getNumericValue(cz);
					char czz = BinRes.charAt(i-2);
					int rzz =Character.getNumericValue(czz);
					r1=r1+(rz*2)+(rzz*4);
					temp = temp.concat(String.valueOf(r1));
				}			
			}
									
		}	
	
	switch(t1){
							case 10:{
								temp = temp.concat("A");
								break;
							}
							case 11:{
								temp = temp.concat("B");
								break;
							}
							case 12:{
								temp = temp.concat("C");
								break;
							}
							case 13:{
								temp = temp.concat("D");
								break;
							}
							case 14:{
								temp = temp.concat("E");
								break;
							}
							case 15:{
								temp = temp.concat("F");
								break;
							}
						}
	
	
	String reverse = "";
        
        
        for(int i = temp.length() - 1; i >= 0; i--)
        {
            reverse = reverse + temp.charAt(i);
        }
	
	return reverse;
	}
}
