
public class Student {

	// 姓名，班级，成绩 参加考试 复习 吃饭
	// 属性
	private String name; // 姓名
	private String banji;// 班级
	private int chengji;// 成绩
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public int getChengji() {
		return chengji;
	}

	public void setChengji(int chengji) {
		this.chengji = chengji;
	}

	// 方法
	public void kaoShi() {
		System.out.println("考了100分");
	}

	public int zuoYe() {
		System.out.println("考了100分");
		return 100;
	}

}
