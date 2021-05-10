package jp.co.aforce.text;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();

		Truck truck = new Truck();

		truck.addPayload(10);
		truck.speedUp(60);
		System.out.println(truck.getPayload());
		System.out.println(truck.getSpeed());

	}

}
