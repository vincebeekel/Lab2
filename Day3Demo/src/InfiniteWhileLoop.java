
public class InfiniteWhileLoop {
	public static void main(String[] args) {

		// code will continue endlessly unless I add a stop condition
		
		while (true) {
			int randomNum = (int)(Math.random() * 10);
			
			System.out.println(randomNum);
			
			if(randomNum == 7) {
				System.out.println("7 has been found -- exit loop");
				break;
			}
			
		}
		
		
		
	}

}
