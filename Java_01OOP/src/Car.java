public class Car {
    String color;
    String model;
    int speed;
    //加速度メソッド
    void accelerate() {
        speed += 10;
        System.out.println("スピードが" + speed + "に上がった");
    }
    //ストップメソッド
    void stop() {
        speed = 0;
        System.out.println("車が停止した");
    }
    
    void setColor(String color) {
        this.color = color; //カラーをインスタンス化
        System.out.println("車のカラーは：" + color);
    }
    
    void setModel(String model){
    	this.model = model;//モデルをインスタンス化
    	System.out.println("車のブランドは:" + model);
    }
    
}