//average
package math;

public class Average{
	public static double calculateAverage(int[] data){
		int a = data.length;
		int total=0;			
		for(int i=0;i<a;i++){
			total+=data[i];		
		}	
		double res = total/a;
		return res;
	}
}
