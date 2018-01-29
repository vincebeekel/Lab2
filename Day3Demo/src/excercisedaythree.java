
public class excercisedaythree {

	public static void main(String[] args) {

		int i;

		for (i = 1; i <= 100; ++i) {

			if (i % 15 == 0) {
				System.out.println(i + " Fizzbuzz");
			}
			else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
				}
		
			else if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
