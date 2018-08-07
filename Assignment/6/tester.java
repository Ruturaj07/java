/* Develop a mathematical package for Statistical operations like Mean, Median, Average,
Standard deviation. Create a sub package in the math package -convert. In “convert”
package provide classes to convert decimal to octal, binary, hex and vice-versa. Develop
application program to use this package, and build executable jar file of it.*/

import java.util.*;
import math.*;
import math.convert.*;
class tester{
	public static void main(String[] a){
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("Mean  :"+Mean.calculateMean(array));
		System.out.println("Median :"+Median.calculateMedian(array));
		System.out.println("Average :"+Average.calculateAverage(array));
		System.out.println("Standard Deviation :"+SD.calculateSD(array));
		System.out.println("Decimal to Binary:"+decimal.toBinary(1234));
		
		System.out.println("Decimal to Octal:"+octal.toOctal(1234));
		System.out.println("Decimal to Hex:"+hex.toHex(10));
		
	}
}
