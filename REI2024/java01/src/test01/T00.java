package test01;

public class T00 {
	public static void main(String[] args) {
		Vote vote = new Vote("张三");
		Vote vote1 = new Vote("李四");

		Vote.show();
		vote.voter();
		Vote.show();
		vote1.voter();
		Vote.show();

	}

}
