
public class PrintFTest {
public static void main(String[] args) {
	
	double dblTotal =2.0;
	int intValue = 1;
	String stringVal = "y";
	
	
	System.out.printf("Total is: $%,.2f%n", dblTotal);
	System.out.printf("Total: %-10.2f: ", dblTotal);
	System.out.printf("% 4d", intValue);
	System.out.printf("%20.10s\n", stringVal);
	String s = "Hello World";
	System.out.printf("The String object %s is at hash code %h%n", s, s);

	
}

}
