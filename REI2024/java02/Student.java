
public class Student {

	public String name;
	public int score;

	public Student() {

	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public void display() {
		System.out.print(name + "; " + score);
	}

}
