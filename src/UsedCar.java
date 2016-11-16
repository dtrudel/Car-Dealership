
public class UsedCar extends Car {
int miles;

	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);
		this.miles = miles;
		
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	@Override
	public String toString() {
		return "Used\t" + make + "\t" + model + "\t" + year + "\t" + price + "\t" + miles;
	}
	

}
