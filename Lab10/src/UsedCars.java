
public class UsedCars extends Cars {
	
	private double miles = 0.0;
	private String used = "used";
	
	
	public UsedCars () {
		
	}

	
	
	

	public UsedCars(String make, String model, int year, double price, String used,double miles) {
		super(make, model,year,price);
		this.miles = miles;
		this.used = used;
	}





	public double getMiles() {
		return miles;
	}


	public void setMiles(double miles) {
		this.miles = miles;
	}


	public String getUsed() {
		return used;
	}


	public void setUsed(String used) {
		this.used = used;
	}
	
	

}
