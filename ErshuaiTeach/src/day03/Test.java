package day03;

public class Test {
	public static void main(String[] args) {
		Animal lisa = new Animal("莉莎");
		System.out.println(lisa);
		lisa.setName("泰迪");
		System.out.println("小动物的新名字是"+lisa.getName());
		lisa.shout(5, "嗷");
	}
}
