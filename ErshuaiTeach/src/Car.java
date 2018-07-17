public class Car {
	private int wheelAmount;
	private String color;

	private void run() {
		System.out.println("跑跑跑");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.wheelAmount = 4;
		System.out.println("车的颜色是" + myCar.color + ", 有" + myCar.wheelAmount + "个轮子");
		myCar.run();
	}
}
