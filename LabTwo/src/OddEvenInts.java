import java.util.Scanner;

public class OddEvenInts {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userName;
		int userInt;

		System.out.println("What is your name: ");

		userName = scnr.nextLine();
		do { 
			
		
		System.out.println("Hello " + userName + " Enter an Integer between 1 and 100");
		userInt = scnr.nextInt();
		if (userInt > 100 || userInt < 1) {
			System.out.println("Hey, your number is out of range. Please enter a new number between 1 and 100: ");
			userInt = scnr.nextInt();
		}
		

			if (userInt % 2 != 0) {
				System.out.println("odd");
			}

			if (userInt % 2 == 0 && userInt <= 2 && userInt >= 25) {
				System.out.println(userName + " your number is even and Less then 25.");
			}
			if (userInt % 2 == 0 && userInt <= 26 && userInt >= 60) {
				System.out.println(userName + " your number is even and is inbetween 26 and 30.");
			}
			if (userInt % 2 == 0 && userInt >= 60) {
				System.out.println(userName + " your number is even and greater than 60");
			}
			if (userInt % 2 != 0 && userInt >= 60) {
				System.out.println(userName + " your number is odd and over 60.");

			}
			/*System.out.println("Do you want to continue? ");
			userInt = scnr.nextInt();*/
		}while (userInt >= 1 && userInt <= 100);
		}

		//System.out.println("Goodbye!");
	}

