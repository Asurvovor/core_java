package day01;

public class Cat {
	private String name;

	public Cat(String name) {
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
			System.out.print("喵 ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}
