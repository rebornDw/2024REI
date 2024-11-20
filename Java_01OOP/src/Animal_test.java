public class Animal_test{
	public static void main(String[]args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.eat();//スーパークラスのメソッドを呼び出し
		dog.bark();//サブクラスのメソッドを呼び出し
		cat.eat();//スーパークラスのメソッドを呼び出し
		cat.meow();//サブクラスのメソッドを呼び出し
	}
}