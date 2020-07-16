package oops.abstraction;

public class RepairShop {
   public static void repaircar( Car car) {
			System.out.println(car+" is completed");
		}

	public static void main(String[] args) {
		Farari farari = new Farari();
		Audi audi = new Audi();
		repaircar(farari);
		repaircar(audi);

	}

}
