
public class BoyFriend {
	//声明男友姓名，年龄，身高，特长
	private String name;
	private int age;
	private double height;
	private String talent;
	public BoyFriend() {
	}
	public BoyFriend(String name, int age, double height, String talent) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.talent = talent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getTalent() {
		return talent;
	}
	public void setTalent(String talent) {
		this.talent = talent;
	}
	//比较男友身高
	public void compare(String name1,double height1,String name2,double height2) {
		if(height1 > height2) {
			System.out.println("男友" + name1 + "更高！");
		}else {
			System.out.println("男友" + name2 + "更高!");
		}
	}
}
