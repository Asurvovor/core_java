package day02;

public class Test {

	public static void main(String[] args) {
		Dog lisa = new Dog("莉莎");
		System.out.println(lisa);
		lisa.setName("欧迪");
		System.out.println("小狗的新名字是"+lisa.getName());
        System.out.println(lisa);
		lisa.shout(5);
	}

}
