public class Car {
    String color;
    String model;
    int speed;

    void accelerate() {
        speed += 10;
        System.out.println("スピードが" + speed + "に上がった");
    }

    void stop() {
        speed = 0;
        System.out.println("車が停止した");
    }
    
}