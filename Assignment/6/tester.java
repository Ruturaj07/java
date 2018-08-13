/* Develop a mathematical package for Statistical operations like Mean, Median, Average,
Standard deviation. Create a sub package in the math package -convert. In “convert”
package provide classes to convert decimal to octal, binary, hex and vice-versa. Develop
application program to use this package, and build executable jar file of it.*/

import java.util.*;
import math.*;
import math.convert.*;
class tester{
	public static void main(String[] a){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array : ");
		for(int i=0;i<n;i++)
			array[i] = sc.nextInt();
		System.out.println("\n\nMean \t\t\t:"+Mean.calculateMean(array));
		System.out.println("Median \t\t\t:"+Median.calculateMedian(array));
		System.out.println("Average \t\t:"+Average.calculateAverage(array));
		System.out.println("Standard Deviation \t:"+SD.calculateSD(array));
		
		System.out.println("\n\n\nEnter Decimal Number to Convert : ");
		int data = sc.nextInt();		
		System.out.println("\nDecimal to Binary\t:"+decimal.toBinary(data));
		
		System.out.println("Decimal to Octal\t:"+octal.toOctal(data));
		System.out.println("Decimal to Hex\t\t:"+hex.toHex(data));


		System.out.println("\n\n\nEnter Binary Number to Convert to Integer: ");
		String data1 = sc.next();
		System.out.println("\nDecimal\t:"+decimal.frBinToDec(data1));

		System.out.println("\n\n\nEnter Octal Number to Convert to Integer: ");
		String data2 = sc.next();
		System.out.println("\nDecimal\t:"+decimal.frOctToDec(data1));

		System.out.println("\n\n\nEnter Hex Number to Convert to Integer: ");
		String data3 = sc.next();
		System.out.println("\nDecimal\t:"+decimal.frHexToDec(data1));
	}
}
