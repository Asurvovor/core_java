package day03;

public class Test {
	public static void main(String[] args) {
		Dog oudie = new Dog("欧迪", 4);
		System.out.println(oudie);
		oudie.setName("莉莎~");
		oudie.setLegs(8);
		System.out.println(oudie);
		oudie.shout(6, "汪~");
		
		Cat garfield = new Cat("加菲", 5);
		System.out.println(garfield);
		garfield.setName("布偶~");
		garfield.setClows(10);
		System.out.println(garfield);
		garfield.shout(5, "喵~");
	}
}
