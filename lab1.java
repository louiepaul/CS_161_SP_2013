public class lab1 
{
	public static void main(String[]args)
	{
		//1. Create a program that runs
		     System.out.println("This should be a working program now!");
		
		//2.Create a program that:
		     
		//2. a. declares, initializes, and prints two different types of variables
		    
		     int myIntVariable;
		     myIntVariable = -29;
		     double myDouble = 98.7;
		     System.out.print("This is a variable of data type int:");
		     System.out.println(myIntVariable);
		     System.out.print("This is a variable of data type double:");
		     System.out.println(myDouble);
		     
		//2. b. declares, initializes, and prints two different types of constants
		    
		     final int THE_ANSWER = 42;
		     final double ANOTHER_CONSTANT;
		     ANOTHER_CONSTANT = 3.14159;
		     System.out.print("This is a constant of data type int:");
		     System.out.println(THE_ANSWER);
		     System.out.print("This is a constant of data type double:");
		     System.out.println(ANOTHER_CONSTANT);
		     
		//2. c. prints two different types of literals
		     
		     System.out.print("This is a literal data type boolean:");
		     System.out.println(true);
		     System.out.print("This is a literal data type char:");
		     System.out.println("Word");
		     
		/*3. Now create a program that uses some variables, constants, or literals to print values possible for the
             short and float data types as follows:*/
		     
        //3. a.try to find the lowest possible value for each of the data types,
          
		     int myMinShortVariable;
		     myMinShortVariable = -32768;
		     double myMinFloatVariable;
		     myMinFloatVariable =  1.40129846432481707e-45;
		     System.out.print("This is the Min Value of data type Short:");
		     System.out.println(myMinShortVariable);
		     System.out.print("This is the Min Value of data type Float:");
		     System.out.println(myMinFloatVariable);
		     
		     
		     
		//3. b.try to find the highest possible value for each of the data types,
         
		     final int MY_SHORT_CONSTANT_MAX = 32767;
		     final double MY_FLOAT_CONSTANT_MAX = 3.40282346638528860e+38;
		     System.out.print("This is the Max Value of data type Short:");
		     System.out.println(MY_SHORT_CONSTANT_MAX);
		     System.out.print("This is the Max Value of data type Float:");
		     System.out.println(MY_FLOAT_CONSTANT_MAX);
		     
		/*3. c.be sure to have the program print information stating what is 
		     going on so the user of the program
             knows what you are doing.*/
		     
		     final String MY_PART_3_EXPLINATION;
		     MY_PART_3_EXPLINATION = ("To show the max and min for the data types Short and Float," +
		     		"I used code similar to what was used in parts 1 and 2 of this lab. Since I don't know yet" +
		     		"how to code the min and max, I simply looked up their values and typed them in.");
		     System.out.println(MY_PART_3_EXPLINATION);
		  
		     
	
		
		     
		     
	}
}