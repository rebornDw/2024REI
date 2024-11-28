package JavaWork02;

public class MaoPao {
    String name;
    int chengJi;
    // 构造器
    public MaoPao(String name, int chengJi) {
        this.name = name;
        this.chengJi = chengJi;
    }
    // 冒泡排序
    public void paiXu(MaoPao[] array) {
        for (int o = array.length; o > 0; o--) {
            for (int j = 0; j < o - 1; j++) {
                if (array[j].chengJi < array[j + 1].chengJi) {
                    MaoPao temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public void print(MaoPao[] n) {
        for (int i = 0 ; i < n.length ; i++ ) {
            System.out.println("第"+(i+1)+"名"+"\t"+"\t"+"姓名: " + n[i].name +"\t"+"\t"+"成绩: " + n[i].chengJi);
        }
    }
}
