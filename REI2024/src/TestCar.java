
public class TestCar {
	public static void main(String[] args) {
		//创建实例
		Car car1 = new Car();
		car1.setYanse("红色");
		car1.setPinpai("丰田");
		car1.setJiage(95000);
		
        Car car2 = new Car();
        car2.setYanse("白色");
        car2.setPinpai("宝马");
        car2.setJiage(250000);

        Car car3 = new Car();
        car3.setYanse("黑色");
        car3.setPinpai("奔驰");
        car3.setJiage(400000);
        
        //输出每辆车的等级和属性
        System.out.println(car1.getYanse() + car1.getPinpai() + "的等级是：" + car1.dengji());
        System.out.println(car2.getYanse() + car2.getPinpai() + "的等级是：" + car2.dengji());
        System.out.println(car3.getYanse() + car3.getPinpai() + "的等级是：" + car3.dengji());
	}

}

