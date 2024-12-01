package BubbleSort;

class Student{
	
	private String name;
	private int score;
	//コンストラクタ
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	//名前を取得
	public String getName() {
		return name;
	}
	//成績を取得
	public int getScore() {
		return score;
	}
	//名前と成績をプリントする
	public String toString() {
		return "名前:"+name+",成績:"+score;
	}
}