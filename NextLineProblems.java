import java.util.Scanner;

public class NextLineProblems
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an int: ");
		int intInput = in.nextInt();
		System.out.println("\nintInput: " + intInput);
		
		System.out.print("\nPlease enter a String: ");
		String leftOverInput = in.nextLine();
		String strInput = in.nextLine();
		System.out.println("\ninput left over from the nextInt leaves everything after the int that was found (mostly important being the end of line character): \"" + leftOverInput + "\"");
		System.out.println("strInput: \"" + strInput + "\"");
		
		System.out.println("\nNotice that I had to call nextLine to get rid of the rest of the line associated with the int vefore I could get teh second line I entered");
	}
}