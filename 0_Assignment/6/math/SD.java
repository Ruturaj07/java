//SD
package math;

public class SD{
	public static double calculateSD(int[] data){
		int a = data.length;
		int total=0;			
		for(int i=0;i<a;i++){
			total+=data[i];		
		}	
		int mean = total/a;
		long res=0;
		for(int i=0;i<a;i++){
			res=(res+((mean-data[i])*(mean-data[i])));		
		}
		return res;
	}
}
