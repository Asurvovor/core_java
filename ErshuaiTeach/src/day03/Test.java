package day03;

public class Test {
	public static void main(String[] args) {
		Dog oudie = new Dog("欧迪");
		System.out.println(oudie);
		oudie.setName("莉莎~");
		oudie.shout(6, "汪~");
		System.out.println(oudie);
		
		Cat garfield = new Cat("加菲");
		System.out.println(garfield);
		oudie.setName("布偶~");
		oudie.shout(5, "喵~");
		System.out.println(garfield);
	}
}
