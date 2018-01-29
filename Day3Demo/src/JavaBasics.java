
public class JavaBasics {

	public static void main(String[] args) {
		
		final String TEST = "hello";
	
		final int TESINT = 4;
		
		//primitive type declarations.
		
		byte b = 127;
		short s = 32767;
		int i = 1333333;
		//float fl = 6.7; doesn't recognize a float
		float fl2 = 6.7f;
		double d = 5.6667;
		char c = 'c';
		boolean bool = true;  // default is false
		long l = 1234566887554l; // can use lowercase or uppercase 
		
		//implicit conversion examples
		int numOfItems = 5;
		System.out.println(3.0/1.5);
		System.out.println( 3.0/2);
		System.out.println((numOfItems +10)/2);
		System.out.println((numOfItems + 10) / 2.0);
		
		//explicit casting (type casting)
		
		double x = (double)(3/5);  //<--error returns 0.0 because the division is done before the cast
		double x1 = (double) 3 / (double) 5;
		System.out.println(x);
		System.out.println(x1);
		
		// example 2 -- common error forgetting to cast
		
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		double avgKidsPerFamily = (kidsInFamily1 + kidsInFamily2) / numOfFamilies; // comes out as 3.0 when it is 3.5
		
		double avgKidsPerFamily1 = ((double) kidsInFamily1 + (double) kidsInFamily2) / numOfFamilies;
		
		System.out.println(avgKidsPerFamily);
		
		System.out.println(avgKidsPerFamily1);
		
		
		
		
	}
}
