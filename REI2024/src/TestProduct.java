public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("手机");
        product1.setStock(50);
        product1.setPrice(3000);

        Product product2 = new Product();
        product2.setName("笔记本");
        product2.setStock(0);
        product2.setPrice(5000);

        System.out.println(product1.getName() + "当前状态：" + product1.stockStatus());
        System.out.println(product2.getName() + "当前状态：" + product2.stockStatus());
    }
}
