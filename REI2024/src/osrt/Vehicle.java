package osrt;

public class Vehicle {
	private String color; //颜色
	private double price; //价格
	
	//构造函数
	public Vehicle(String color,double price) {
		this.color = color;
		this.price = price;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
