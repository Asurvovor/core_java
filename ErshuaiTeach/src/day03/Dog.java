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

	public void shout(int num, String voice, String eatWhat) {
		System.out.println("叫" + num + "声:");
		for (int i = 0; i < num; i++) {
			System.out.println("一边" + voice + "一边" + eatWhat);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Dog [legs=" + getLegs() + ", name=" + getName() + "]";
	}

}
