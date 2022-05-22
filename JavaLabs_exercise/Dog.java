package JavaLabs_exercise;

public class Dog extends Mammal {

	String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void smile() {
		System.out.println("Dog=> " + name + "  :) ");
	}

	public void bark() {
		System.out.println("Dog=> " + name + " wannwann ");
	}
}
