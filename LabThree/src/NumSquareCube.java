import java.util.Scanner;

public class NumSquareCube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int userInput;
		int i;
		int sqrt;
		int cube;
		String number = "Number";
		String squared = "Squared";
		String cubed = "Cubed";
		String sixE	= "======";
		String y = "yes";
		
		
		System.out.println("Learn your squares and cubes! \n");
		
		
		do {	
		System.out.println("Enter an integer: ");
		userInput = scan.nextInt();
		
		//if(userIntput != )
		//System.out.println(userInput);
		
		System.out.println(number + "\t" + squared + "\t" + cubed);
		
		//System.out.println("====== \t ======= \t ======");
		System.out.println(sixE + "\t" + sixE + "\t" + sixE);
		
		for(i = 1; i <= userInput; ++i) {
			sqrt = i * i;
			cube = i * i * i;
			
			System.out.println(i + "\t" + sqrt + "\t" + cube );
		}		
				
		
			
		System.out.println("If you wish to continue type Yes, if not type no");
		y = scan.next();
		
		}while(y.equalsIgnoreCase("Yes"));
		
			
		
			
		
		
	
	
	
	}

}
