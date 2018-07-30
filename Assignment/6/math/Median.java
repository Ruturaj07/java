//Median0
package math;
import java.util.Arrays;


public class Median{
	public static int calculateMedian(int[] data){
		Arrays.sort(data);			
		int a = data.length/2;
		
		return data[a];
	}
}
