
public class Car {
String make;
String model;
int year;
double price;

public Car(String make, String model, int year, double price) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
}
public String getMake() {
	return make;
}
public String getModel() {
	return model;
}
public int getYear() {
	return year;
}
public double getPrice() {
	return price;
}
public void setMake(String make) {
	this.make = make;
}
public void setModel(String model) {
	this.model = model;
}
public void setYear(int year) {
	this.year = year;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "New\t" + make + "\t" + model + "\t" + year + "\t" + price;
}

}
