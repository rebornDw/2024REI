package test01;

public class Vote {
	// 票数
	public static int count;
	// 最大投票数
	public static final int MAX_COUNT = 1000;
	// 投票人
	public String name;

	public Vote() {

	}

	public Vote(String name) {
		this.name = name;
	}

	public void voter() {
		if (count == MAX_COUNT) {
			System.out.println("活动结束");
		} else {
			count++;
			System.out.println("感谢" + name + "投票");
		}

	}

	public static void show() {
		System.out.println("目前" + count + "票");

	}

}
