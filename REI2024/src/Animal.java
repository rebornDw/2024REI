public class Animal {
    private String name;   // 动物名字
    private String type;   // 动物种类
    private int age;       // 动物年龄

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println(name + "正在发出声音！");
    }
}
