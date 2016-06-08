import java.util.Scanner;

public class Vote_Eligibility {
	private static Scanner input;

	public static void main(String[] args) {
		double age;
		input = new Scanner(System.in);
		System.out.println("Enter Age:" );  
		age = input.nextDouble();
		if(age>=18){
		System.out.println("YOU ARE ELIGIBLE TO VOTE " );
		}
		else
		{
			System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
		}
	}
}
