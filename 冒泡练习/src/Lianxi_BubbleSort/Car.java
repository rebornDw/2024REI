package Lianxi_BubbleSort;

public class Car extends Vehicle {
	private String brand; //子类属性 品牌
	
	//构造函数
	public Car(String color,double price,String brand) {
		super(color,price);
		this.brand = brand;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "品牌：" + brand + " 颜色：" + getColor() + " 价格：" + getPrice() + "万";
	}

}
