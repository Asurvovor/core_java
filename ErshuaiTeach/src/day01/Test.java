package day01;

public class Test {
	public static void main(String[] args) {
		Cat lisa = new Cat("莉莎");
		System.out.println(lisa);
		lisa.setName("小lisa");
		System.out.println("小猫的新名字是"+lisa.getName());
		lisa.shout(5);
	}
}
