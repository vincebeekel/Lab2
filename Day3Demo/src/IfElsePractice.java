import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");

		int age = scan.nextInt();
		
		if (age >= 18) {
			System.out.println("You can vote!");
		}
		else if(age < 18 && age >= 16) {
			System.out.println("Driving school");
		}
		else {
			System.out.println("do some research on driving");
		}
	scan.close();
	
	}
	

}
