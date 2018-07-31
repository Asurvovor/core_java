package day03;

public class Dog extends Animal {
	private int legs;

	public Dog(String name, int legs) {
		super(name);
		this.legs = legs;
	}
	public int getLegs() {
		return this.legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void eat() {
		System.out.println("狗啃骨头~");
	}

	@Override
	public void shout(int shoutNum, String voice) {
		System.out.println("狗一边啃骨头一边叫~");
		super.shout(shoutNum, voice);
	}
	@Override
	public String toString() {
		return "Dog [legs=" + getLegs() + ", name=" + getName() + "]";
	}

}
