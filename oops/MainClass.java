package oops;

class Car {
	int length, hight, wedth, wheels, headlight;
	String colur, name;

	Car() {
		wheels = 4;
		colur = "Blue";
		headlight = 2;
		hight = 1700;
		length = 34500;
		wedth = 1500;
		name = "Suzoki";
		System.out.println("This a " + name + "Car with " + wheels + " wheels");
	}

}

public class MainClass {

	public static void main(String[] args) {
		Car car_1 = new Car();// object is constructed
	}

}
