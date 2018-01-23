import java.util.Scanner;

public class SquareFootage {

	public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	
	double roomWidth;
	double roomLength;
	double roomHeight;
	double roomPerimeter;
	double roomArea;
	double roomVolume;
	String answer;

	System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	
	do {
	
	System.out.print("Enter Length: ");
	roomLength = scnr.nextDouble();
	System.out.println(roomLength);
	
	System.out.print("Enter Width: ");
	roomWidth = scnr.nextDouble();
	System.out.println(roomWidth);
	
	System.out.print("Enter Height: ");
	roomHeight = scnr.nextDouble();
	System.out.println(roomHeight);
	
	roomArea = roomLength * roomWidth;
	
	System.out.println("Area: " + roomArea);
	
	roomPerimeter = (roomWidth * 2) + (roomLength * 2);
	
	System.out.println("Perimeter: " + roomPerimeter);
	
	roomVolume = roomHeight * roomWidth * roomLength;
	
	System.out.println("Volume: " + roomVolume);
	
	System.out.println("Continue? (y/n): ");
	answer = scnr.next();
	

	}while(answer.equals("y"));
	

	}

}
