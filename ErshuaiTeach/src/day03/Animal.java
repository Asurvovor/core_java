package day03;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void shout(int shoutNum, String voice) {
		System.out.println("叫" + shoutNum + "声:");
		for (int i = 0; i < shoutNum; i++) {
			System.out.print(voice + " ");
		}
		System.out.println();
	}
	
	public abstract void eat();
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
}
