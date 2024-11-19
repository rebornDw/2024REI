
public class Goods {
	//声明变量。商品名，价格，颜色
	private String name;
	private double price;
	private String color;
	//构造方法及set,get
	public Goods(String name, double price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public Goods() {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
