class Animal{
	void eat() {
		System.out.println("動物が食事中");
	}
}
//スーパークラスから継承する
class Dog extends Animal{
	void bark() {
		System.out.println("ワンちゃんがワンワンしてる");
	}
}
class Cat extends Animal{
	void meow(){
		System.out.println("にゃんこがニャーニャ―してる");
	}
}