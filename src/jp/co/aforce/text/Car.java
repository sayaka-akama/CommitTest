package jp.co.aforce.text;

public class Car {

	int speed;

	int getSpeed() {
		return this.speed;
	}

	void speedUp(int value) {
		this.speed += value;
	}

	void speedDown(int value) {
		this.speed -= value;
	}

	// 車種を返す
	String getCarType() {
		return "自動車";
	}

}
