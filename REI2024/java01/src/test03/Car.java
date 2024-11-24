package test03;

public class Car {

	public String brand;// 品牌
	public String model;// 型号
	public int year;// 年限
	private int mile;// 里程

	public Car() {

	}

	public Car(String brand, String model, int year) {

		this.brand = brand;
		this.model = model;
		this.year = year;

	}

	public int getMile() {
		return mile;
	}

//里程不能是负数
	public void setMile(int mile) {
		if (mile < 0) {
			mile = 0;
		} else {
			this.mile = mile;
		}
	}

	public void show() {
		System.out.println("汽车的品牌为" + brand + "汽车的型号为" + model + "汽车的生产年份" + year + "汽车的里程数" + mile);

	}

}
