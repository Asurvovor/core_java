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
	
	@Override
	public void shout(int shoutNum, String voice) {
		System.out.println("猫一边吃鱼一边叫~");
		super.shout(shoutNum, voice);
	}

	@Override
	public String toString() {
		return "Cat [claw=" + claws + ", name=" + getName() + "]";
	}
}
