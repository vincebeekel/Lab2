import java.util.ArrayList;
import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("These are our Cars in the CarLot");

		ArrayList<Cars> carsOnLot = new ArrayList<Cars>();
		ArrayList<UsedCars> usedCarsOnLot = new ArrayList<UsedCars>();

		carsOnLot.add(new Cars("Lincoln", "TownCar", 2018, 34586.50));
		carsOnLot.add(new Cars("Lincoln", "Continental", 2018, 48976.50));
		carsOnLot.add(new Cars("Lincoln", "MKZ", 2018, 327861.12));
		usedCarsOnLot.add(new UsedCars("Lincoln", "TownCar", 2005, 4405.05, "Used", 156874));
		usedCarsOnLot.add(new UsedCars("Lincoln", "Navigator", 2001, 32462.12, "Used", 184236));
		usedCarsOnLot.add(new UsedCars("Lincoln", "Continental", 1946, 22999, "Used", 325000));

		for (int i = 0; i < carsOnLot.size(); i++) {
			System.out.println("Car " + (i + 1) + ": ");
			System.out.println("Make: " + carsOnLot.get(i).getMake() + "\tModel: " + carsOnLot.get(i).getModel()
					+ "\tYear: " + carsOnLot.get(i).getYear() + "\tPrice: $" + carsOnLot.get(i).getPrice());
		}
		System.out.println();
		for (int i = 0; i < usedCarsOnLot.size(); i++) {
			System.out.println("Used Car " + (i + 1) + ": ");
			System.out.println("Make: " + usedCarsOnLot.get(i).getMake() + "\tModel: " + usedCarsOnLot.get(i).getModel()
					+ "\tYear: " + usedCarsOnLot.get(i).getYear() + "\tPrice: $" + usedCarsOnLot.get(i).getPrice()
					+ "\tUsed: " + usedCarsOnLot.get(i).getUsed() + "\tMiles: " + usedCarsOnLot.get(i).getMiles());
		}
		System.out.println();

		// System.out.println("Would you like to see a Used or New Car: type 1 for new
		// car, 2 for used");

		
		int usedNew = Validator.getIntCar(scan,
				"Would you like to see a Used or New Car: type 1 for new car, 2 for used", 1, 2);
		do {
		//new car
		if (usedNew == 1) {
			System.out.println("Nice, you want you to look at a new Car!");
			int newCar = Validator.getIntCar(scan, "Type the number of the car you want", 1, carsOnLot.size());
			System.out.println("Car " + (newCar) + ": ");
			System.out.println("Make: " + carsOnLot.get(newCar - 1).getMake() + "\tModel: "
					+ carsOnLot.get(newCar - 1).getModel() + "\tYear: " + carsOnLot.get(newCar - 1).getYear()
					+ "\tPrice: $" + carsOnLot.get(newCar - 1).getPrice());
			
			int buy = Validator.getIntCar(scan, "Would you like to Buy this Car: type 1 for yes 2 for no", 1, 2);
			
			if (buy == 1) {
				System.out.println("Nice, Our finance team will be with you soon");
				carsOnLot.remove(newCar - 1);
				
				for (int i = 0; i < carsOnLot.size(); i++) {
					System.out.println("Car " + (i + 1) + ": ");
					System.out.println("Make: " + carsOnLot.get(i).getMake() + "\tModel: " + carsOnLot.get(i).getModel()
							+ "\tYear: " + carsOnLot.get(i).getYear() + "\tPrice: $" + carsOnLot.get(i).getPrice());
				}	
			} else {
				System.out.println("Peace!");
			}
		}
		// used  Car
		if (usedNew == 2) {
			System.out.println("Nice, you want you to look at a used Car!");
			int newCar = Validator.getIntCar(scan, "Type the number of the car you want", 1, carsOnLot.size());
			System.out.println("Car " + (newCar) + ": ");
			System.out.println("Make: " + usedCarsOnLot.get(newCar - 1).getMake() + "\tModel: " + usedCarsOnLot.get(newCar - 1).getModel()
					+ "\tYear: " + usedCarsOnLot.get(newCar - 1).getYear() + "\tPrice: $" + usedCarsOnLot.get(newCar - 1).getPrice()
					+ "\tUsed: " + usedCarsOnLot.get(newCar - 1).getUsed() + "\tMiles: " + usedCarsOnLot.get(newCar - 1).getMiles());
			
			int buy = Validator.getIntCar(scan, "Would you like to Buy this Car: type 1 for yes 2 for no", 1, 2);
			
			if (buy == 1) {
				System.out.println("Nice, Our finance team will be with you soon");
				carsOnLot.remove(newCar - 1);
				
				for (int i = 0; i < carsOnLot.size(); i++) {
					System.out.println("Car " + (i + 1) + ": ");
					System.out.println("Make: " + usedCarsOnLot.get(i).getMake() + "\tModel: " + usedCarsOnLot.get(i).getModel()
							+ "\tYear: " + usedCarsOnLot.get(i).getYear() + "\tPrice: $" + usedCarsOnLot.get(i).getPrice()
							+ "\tUsed: " + usedCarsOnLot.get(i).getUsed() + "\tMiles: " + usedCarsOnLot.get(i).getMiles());
				}	
			} else {
				System.out.println("Peace!");
			}
		}
		}while(usedNew == 1 || usedNew ==2);
		
		
		
		
		
	}
}