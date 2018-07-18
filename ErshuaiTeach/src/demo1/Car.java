package demo1;

public class Car {
	private int wheelAmount;
	private String color;

	public int getWheelAmount() {
		return wheelAmount;
	}

	public String getColor() {
		return color;
	}

	public void setWheelAmount(int wheelAmount) {
		this.wheelAmount = wheelAmount;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void run() {
		System.out.println("跑跑跑");
	}

	@Override
	public String toString() {
		return "Car [wheelAmount=" + wheelAmount + ", color=" + color + "]";
	}
}
