
public class Users {
	// 声明变量用户名，密码，邮箱
	private String name;
	private String password;
	private String email;

	public Users() {
	}

	public Users(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 输出对象信息
	public void usersImform() {
		System.out.println(getName());
		System.out.println(getPassword());
		System.out.println(getEmail());
	}

	// 确认用户输入信息是否错误
	public void usersComfirm(String name, String password) {
		if (this.name.equals(name)) {
			if (this.password.equals(password)) {
				System.out.println("输入正确，您已经登陆成功！");
			} else {
				System.out.println("您的密码有误！!");
			}
		} else {
			System.out.println("您用户名输入有误！");
		}
	}
}
