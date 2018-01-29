import java.util.Scanner;

public class WhileLoopEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {  //ignorecase means that is can be Y or y
			// your code should start here
			
			System.out.println("do some stuff!");
			
		// this is where your code should end if your using htis as a template
			
			System.out.println("Do you want to continue? y/n");
			cont =scan.nextLine();			
			
		
		}
		
		// let user know the program has ended
		System.out.println("goodbye!");
		
		
		
		scan.close();
	}

}
