/*Develop a class Expr to create and evaluate given expression. Constructor accepts the
expression as String. For example, Expr("x^2") or Expr("sin(x)+3*x"). If the parameter
in the constructor call does not represent a legal expression, then the constructor throws
an IllegalArgumentException. The message in the exception describes the error. Provide
eval(double num) and eval(int num) method to evaluate given expression and return
evaluated answer. For example, if Expr represents the expression 3*x+1, then
func.value(5) is 3*5+1, or 16.Finally, getDefinition() returns the definition of the
expression. This is just the string that was used in the constructor that created the
expression object*/
import java.util.*;
import java.util.regex.*;
class exEval{
public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Expression");
	String exp = sc.next();
	Pattern r ;
	try{
		r = Pattern.compile(exp);	
	}catch(Exception e){
		System.out.println("Invalid Expression");
	}

}
}
