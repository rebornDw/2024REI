class Shape{
	void draw() {
		System.out.println("図形を描く");
	}
}

class Circle extends Shape{
	@Override
	//drawメソッドをオーバライドする
	void draw() {
		System.out.println("円を描く");
	}
}

class Square extends Shape{
	@Override
	void draw() {
		System.out.println("正方形を描く");
	}
}