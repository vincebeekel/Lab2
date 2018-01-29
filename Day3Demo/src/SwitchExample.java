import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {

		int caseSwitch = 2;

		switch (caseSwitch) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("default case");
			break;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Grade: ");
		double grade = scan.nextDouble();
		
		switch((int) grade / 10 ) {
		case 1:
			System.out.println("10-19");
			break;
		case 2:
			System.out.println("20-29");
			break;
		case 3:
			System.out.println("30-39");
			break;
		}
		
		System.out.println("goodbye");
	}

}
