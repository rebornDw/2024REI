public class TestOrder {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderId("1234567890");
        order.setProductName("MacBook");
        order.setQuantity(2);
        order.setPrice(5000.0);
        
        System.out.println("订单号：" + order.getOrderId());
        System.out.println("商品名称：" + order.getProductName());
        System.out.println("商品数量：" + order.getQuantity());
        System.out.println("单价：" + order.getPrice());
        System.out.println("总金额：" + order.calculateTotal());
    }
}
