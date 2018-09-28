import java.util.regex.*;
import java.util.*;
public class exp
{
     public static void main(String[] arguments)
     {
  	String expr;
	Scanner sc=new Scanner(System.in);
     	try
	{
		System.out.println("Enter the expression:");
		expr=sc.nextLine();
           	Pattern.compile(expr);
 		System.out.println("Expression is legal.");
                evaluateexp(expr);
        } 
	catch (IllegalArgumentException e)
	{
            System.out.println("Expression is not legal.");
            System.exit(1);
        }
     }

    

public static void evaluateexp(String ex)
    {
	   Scanner sc=new Scanner(System.in);
	   int result;
	   for(int i=0;i<ex.length();i++)
           {
              if(ex.charAt(i)=='+')
  	      {
    	result=Integer.parseInt(ex.substring(0, i))+Integer.parseInt(ex.substring(i+1,            
            ex.length()));
    		System.out.print(result);
  	      }   
	
	      if(ex.charAt(i)=='-')
  	      {
    		result=Integer.parseInt(ex.substring(0, i))-Integer.parseInt(ex.substring(i+1, ex.length()));
    		System.out.print(result);
  	      }  
 
	      if(ex.charAt(i)=='*')
  	      {
    	result=Integer.parseInt(ex.substring(0, i))*Integer.parseInt(ex.substring(i+1, 
             ex.length()));
    		System.out.print(result);
  	      } 
  
	      if(ex.charAt(i)=='/')
  	      {
    	result=Integer.parseInt(ex.substring(0, i))/Integer.parseInt(ex.substring(i+1,  
           ex.length()));
    		System.out.print(result);
  	      }         
    }

    }//end of main()

}//end of class