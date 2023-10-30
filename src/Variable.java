public class Variable {
public static void main(String[] args) {
	
	//Variable Declaration
	//Syntax:- datatype variable = value;
	
	String name = "Gloria";
	System.out.println(name);   // String data type also called as "the special ninth type" by developers
	
	int Num = 7;
	System.out.println(Num);
	
	//Note that if you assign a new value to an existing variable, it will overwrite the previous value
	int No = 3;
	No = 5;  //No is now 5
	System.out.println(No);
	
	/*If you don't want others (or yourself) to overwrite existing values, 
	 * use the final keyword (this will declare the variable as "final" or "constant", 
	 * which means unchangeable and read-only) */
	
	final int number = 20;
	// number=25; // will generate an error: cannot assign a value to a final variable
	System.out.println(number);
			
			
	float decimalvalue = 7.7f;
	System.out.println(decimalvalue+1);
	
	char myletter = 'G'; // char enclosed within double quotes
			System.out.println(myletter);
			
	// ASCII VALUES
			char ascii=97;
			System.out.println(ascii);
	
	boolean myBool = true;
	System.out.println(myBool);
	
	//concatenation (+)
	String myname="Gloria";
	char mychar='E';
	System.out.println(myname+mychar);
	
	//Declare Multiple Variable
	int x=5, y=4, z=3;
	System.out.println(x+y*z); // * has more priority than +
	
	//Scientific Numbers
	//A floating point number can also be a scientific number with an "e or E " to indicate the power of 10
	float expo = 35e3f;
	System.out.println(expo);
	double d1 = 12E4d;
	System.out.println(d1);
	
	/* The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names */
	}
}
