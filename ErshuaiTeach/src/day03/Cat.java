package day03;

public class Cat extends Animal {
	private int claws;
	
	public Cat(String name, int claws) {
		super(name);
		this.claws = claws;
	}
	
	public int getClaws() {
		return this.claws;
	}
	
	public void setClows(int claws) {
	    this.claws = claws;
	}
	
	public void eat() {
	    System.out.println("猫猫吃鱼~");	
	}
	
	public void shout(int num, String voice, String eatWhat) {
		System.out.println("叫" + num + "声:");
		for (int i = 0; i < num; i++) {
			System.out.println("一边" + voice + "一边" + eatWhat);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Cat [claw=" + claws + ", name=" + getName() + "]";
	}
	
	
}
