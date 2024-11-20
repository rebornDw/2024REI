public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("奔驰");
        car.setModel("A180");
        car.setYearsUsed(12);

        System.out.println("车辆品牌：" + car.getBrand());
        System.out.println("车辆型号：" + car.getModel());
        System.out.println("车辆使用年限：" + car.getYearsUsed());

        if (car.isOldCar()) {
            System.out.println("这是一辆老旧车辆");
        } else {
            System.out.println("这是一辆新车");
        }
    }
}
