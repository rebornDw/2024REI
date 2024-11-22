
public class TestAnimal {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setName("狮子");
		animal1.setWhere("草原");
		animal1.setWeight(100);
		
		Animal animal2 = new Animal();
		animal2.setName("猴子");
		animal2.setWhere("森林");
		animal2.setWeight(15);
		
		System.out.println(animal1.getName() + "是" + animal1.tixing());
		System.out.println(animal2.getName() + "是" + animal2.tixing());
		
	}

}
