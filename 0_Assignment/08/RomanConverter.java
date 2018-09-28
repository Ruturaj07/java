import java.io.*;
import java.util.*;

 class RomanNumeral 
{
   private final int num;   
  private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,  50,   40,   10,     
                                                         9,    5,    4,    1 };                                          
  private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC","L",  "XL",  
                                                       "X",  "IX", "V",  "IV", "I" };

       public RomanNumeral(int number)
       {
          if (number < 1 && number > 3999)
           throw new NumberFormatException("Value of RomanNumeral must be positive.");          
          num = number;
       }
          
       public RomanNumeral(String roman) 
       {             
          if (roman.length() == 0)
             throw new NumberFormatException("An empty string does not define a Roman numeral.");
             
          roman = roman.toUpperCase();  
           int i = 0;       
          int rm = 0;  
          
          while (i < roman.length())
	  {
            char letter = roman.charAt(i);        // Letter at current position in string.
             int number = letterToNumber(letter);  // Numerical equivalent of letter.
           
             i++;             
             if (i == roman.length()) 
	      {                
                rm = rm+ number;
              }
             else 
	      {                 
                int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) 
		{
                   rm = rm + (nextNumber - number);
                   i++;
                }
                else
                {                   rm = rm+ number;
                }
             }
           }  // end while
            if (rm > 3999)
             throw new NumberFormatException("Roman numeral must have value 3999 or less.");
             
          num = rm;
        } // end constructor
       
      private int letterToNumber(char letter)
       {
          switch (letter)          
          {
             case 'I':  return 1;
             case 'V':  return 5;
             case 'X':  return 10;
             case 'L':  return 50;
             case 'C':  return 100;
             case 'D':  return 500;
             case 'M':  return 1000;
             default:   throw new NumberFormatException(
                          "Illegal character \"" + letter + "\" in Roman numeral");
          }
       }
       
      public String toString() //Returns String Value of Roman 
       {
          String roman = "";  
          int N = num;                               
          for (int i = 0; i < numbers.length; i++)
          {
             while (N >= numbers[i])    
             {
                roman = roman + letters[i];
                N = N - numbers[i];
             }
          }
                  return roman;
       }
          
       public int toInt() //Returns int Value of Roman 
       {          return num;       }          
    } // end class RomanNumeral


    public class RomanConverter 
    {
      public static void main(String[] args)
      {          
	int p=0;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
        System.out.println(" \n1.Convert Roman to int \n 2. Convert int to Roman \n  3.EXIT \nEnter the Option:");
         p= sc.nextInt();
         switch(p)
         {  
           case 1:
	   System.out.println("Enter a Roman numeral: ");
	   String str=sc.next();
	try {
                     RomanNumeral N = new RomanNumeral(str);
                     System.out.println( N.toString() + " = " + N.toInt());
                }
                catch (NumberFormatException e)
	        {
                     System.out.println("Invalid input.");
                     System.out.println(e.getMessage());
                }
              break;

	   case 2:
	   System.out.println("Enter a int to convert into Roman: ");
	   int num1=sc.nextInt();
             try 
                {
                     RomanNumeral N = new RomanNumeral(num1);
                     System.out.println( N.toInt()+ " = " +  N.toString());
                }
                catch (NumberFormatException e)
	        {
                     System.out.println("Invalid input.");
                     System.out.println(e.getMessage());
                }
              break;
          case 3: System.exit(0);
	    }//end of switch   
           }  // end while      
       }  // end main()
    } // end class RomanConverter
