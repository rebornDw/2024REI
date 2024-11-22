public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setBrand("小米");
        phone1.setPrice(1999);
        phone1.setMemory(8);

        Phone phone2 = new Phone();
        phone2.setBrand("华为");
        phone2.setPrice(4500);
        phone2.setMemory(16);

        Phone phone3 = new Phone();
        phone3.setBrand("苹果");
        phone3.setPrice(9000);
        phone3.setMemory(32);

        System.out.println(phone1.getBrand() + "属于：" + phone1.priceCategory());
        System.out.println(phone2.getBrand() + "属于：" + phone2.priceCategory());
        System.out.println(phone3.getBrand() + "属于：" + phone3.priceCategory());
    }
}

