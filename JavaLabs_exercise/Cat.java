package JavaLabs_exercise;

public class Cat extends Mammal {

	String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void smile() {
		System.out.println("Cat=>  " + name + ":) ");
	}

	@Override
	public void meao() {
		System.out.println("Cat=> " + name + " meaomeao");
	}
}
