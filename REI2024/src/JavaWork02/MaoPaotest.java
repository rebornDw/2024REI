package JavaWork02;

public class MaoPaotest {
    public static void main(String[] args) {
        // 数组初始化
        MaoPao[] students = new MaoPao[]{
            new MaoPao("白展堂", 85),
            new MaoPao("佟湘玉", 92),
            new MaoPao("李大嘴", 78),
            new MaoPao("吕轻侯", 90),
            new MaoPao("郭芙蓉", 86),
            new MaoPao("莫小贝", 48),
            new MaoPao("燕小六", 78),
            new MaoPao("邢育森", 30),
            new MaoPao("小米", 42),
            new MaoPao("钱掌柜", 64),
            new MaoPao("钱夫人", 62),
            new MaoPao("平谷一点红", 51),
            new MaoPao("包大仁", 87),
            new MaoPao("展堂", 52),
            new MaoPao("黄豆豆", 94),
            new MaoPao("展红菱", 45)
        };

        // 冒泡测试
        students[0].paiXu(students);

        // 排序
        System.out.println("----------------武林外传学校排名----------------：");
        students[1].print(students);
    }
}
