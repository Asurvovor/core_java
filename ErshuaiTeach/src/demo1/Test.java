package demo1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setColor("red");
		myCar.setWheelAmount(4);
		System.out.println("车的颜色是" + myCar.getColor() + ", 有" + myCar.getWheelAmount() + "个轮子");
		myCar.run();
		System.out.println(myCar);
	}

}
