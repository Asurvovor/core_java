package day02;

public class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void shout(int shoutNum) {
		System.out.println("叫" + shoutNum + "声:");
		for (int i = 0; i < shoutNum; i++) {
			System.out.print("汪 ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
}
