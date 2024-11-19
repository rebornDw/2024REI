
public class Cloths {
	// 声明变量.衣服名字，原价，折扣，购买数量
	private String name;
	private double price;
	private double discount;
	private int amount;

	public Cloths() {
	}

	public Cloths(String name, double price, double discount, int amount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// 输入购买衣服名字和数量，更改数组里剩余数量，并且返回剩余库存
	public int count(String name, int num, Cloths[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName().equals(name)) {
				if (num > 0 && num <= arr[i].getAmount()) {
					arr[i].setAmount(getAmount() - num);
					result =  arr[i].getAmount();
				} else {
					System.out.println("您输入的数量错误！");
				}
			}
		}
		return result;
	}
}
