import java.util.Scanner;

public class lab7experiment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] classMates = { "T'varisuness King", "Tyroil Smoochie-Wallace", "Ibrahim Moizoos",
				"Javaris Jamar Javarison-Lamar", "Davoin Shower-Handel", "Hingle McCringleberry",
				"L'Carpetron Dookmarriot", "Xmus Jaxon Flaxon-Waxon", "Saggitariutt Jefferspin",
				"D'Glester Hardunkichud", "Beezer Twelve Washingbeard", "Quatro Quatro", "Ozamataz Buckshank",
				"Shakiraquan T.G.I.F. Carter", "Swirvithan L'Goodling-Splatt", "D'Squarius Green, Jr.",
				"Jackmerius Tacktheritrix", "D'Isiah T. Billings-Clyde", "Scoish Velociraptor Maloish",
				"J'Dinkalage Morgoone" };
		int[] studentInt1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		String[] homeTown = { "Detroit", "Flint", "Ann Arbor", "Grand Rapids", "Warren", "Oakland", "Portland",
				"Milwaukie", "Oregon City", "Hillsboro", "Bend", "Traverse City", "Seattle", "Miami", "New Oreleans",
				"Boston", "Nashville", "New York", "Harlem", "Brooklyn", };
		String[] favFoods = { "Pizza", "Ribs", "Veggies", "Subs", "Desert", "Burger", "Ice Cream", "Tacos", "Burritos",
				"Pasta", "Pizza", "Ribs", "Veggies", "Subs", "Desert", "Burger", "Ice Cream", "Tacos", "Burritos",
				"Pasta" };
		int studentScanner;
		int correction;
		String foodHome;

		System.out.println(
				"Wecome to our Java Class. Which Student would you like to learn more about? (Enter a Number 1-20): ");

		do {
			try {
				studentScanner = scan.nextInt();
				correction = studentScanner - 1;
				System.out.println("Student " + studentScanner + " is " + classMates[correction] + "");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Try Again, number between 1-20");
				studentScanner = scan.nextInt();
			}

		} while (studentScanner < 1 && studentScanner > 20);

//		System.out.println("Student " + studentScanner + " is " + classMates[correction] + "");
//
//		System.out.println("would you like to know more about " + classMates[correction]
//				+ ".  If so enter in hometown or food");
		
//		try {
//			foodHome = scan.nextLine();
//			 if (foodHome.toLowerCase() =="hometown" || foodHome.toLowerCase() == "food") {
//				 System.out.println(classMates[correction] + "is from " + homeTown[correction] );
//			 }
//			
//			
//		}catch ()
		
		
		
		
		
	}

	public static void nameArray(String[] classmates) {

	}

	// public static int userVal (Scanner scan, int userVal1) {
	// while(!scan.hasNextInt()) { //checking for int.
	// System.out.println("try again");
	// scan.nextLine();
	// }
	// scan.nextInt();
	// while (( userVal <= 1 || userVal >= 20)) { // check for int 1-20
	// System.out.println("try again");
	// scan.nextLine();
	// }

	public static String homeTown(Scanner scan, String k) {
		// System.out.println(homeTown [10]);

		return k;
	}

}
