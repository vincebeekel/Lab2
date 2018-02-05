import java.util.ArrayList;

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
		for (int i = 0; i < usedCarsOnLot.size(); i++) {
			System.out.println("Car " + (i + 1 + carsOnLot.size()) + ": ");
			System.out.println("Make: " + usedCarsOnLot.get(i).getMake() + "\tModel: " + usedCarsOnLot.get(i).getModel()
					+ "\tYear: " + usedCarsOnLot.get(i).getYear() + "\tPrice: $" + usedCarsOnLot.get(i).getPrice()
					+ "\tUsed: " + usedCarsOnLot.get(i).getUsed() + "\tMiles: " + usedCarsOnLot.get(i).getMiles());
		}