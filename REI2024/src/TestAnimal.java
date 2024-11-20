public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("大黄");
        animal.setType("狗");
        animal.setAge(3);
        
        System.out.println("动物名字：" + animal.getName());
        System.out.println("动物种类：" + animal.getType());
        System.out.println("动物年龄：" + animal.getAge());
        
        animal.makeSound(); // 动物发出声音
    }
}
