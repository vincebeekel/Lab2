
public class DoWhileEx {

	public static void main(String[] args) {
		
		int i = 1;
		int month =36;
		double futureValue = 0;
		double monthlyPmt = 330.63;
		double intRate = 5.99/100;
		
		do {
			
			futureValue = (futureValue + monthlyPmt) * (1 + intRate);
			i++;
			System.out.println(futureValue);  // will print all of the loop.
			
		} while (i <= month);
			

		System.out.println("\n" + futureValue);  //will print the last future value
	}

}
