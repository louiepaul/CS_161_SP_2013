
public class L4 
{

	public static int min =1; //This should work for a
	public static int max = 1000; // This should work for b. I tried to figure out how to make this into 
								  // a user input, but couldn't figure out how, so I am being safe and 
								  // just defining it as 1000, but it could be any number really. 
	
	public static void main(String[]args){
				
		System.out.println("Here are 10 random numbers between 1 and 1000");
		
		//Got this from assignment 2. This runs the program 10 times
		//This should satisfy part e
		int t;
		for (t=0; t<10; t++){
		
			//Got this from lecture 1 in week 4 (printing the boxes). This gives us the random method from below
			//and it should give it to us 10 times from above
			random();
		}
	
	
	}
	//I included this because it says to do so for part c, but I am not entierly sure why I needed it. 
	//Maybe I was supposed to put part a and b here. 
	public static void setRange(int min, int max)
	{
		
		min = min;
		max = max;
	}
	
	//I got this from tutorial 4.1
	//This should satisfy part d. This method establishes what the random method is that we use above.
	public static int random()
	{
		
		int range = max - min;
		int result = (int)(Math.random() * range+min);
		System.out.println(result);
		return result;
		
	}
	
	
	
}
