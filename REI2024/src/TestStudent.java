public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setScore(92);

        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(20);
        student2.setScore(76);

        Student student3 = new Student();
        student3.setName("王五");
        student3.setAge(17);
        student3.setScore(59);

        System.out.println(student1.getName() + "的成绩是：" + student1.grade());
        System.out.println(student2.getName() + "的成绩是：" + student2.grade());
        System.out.println(student3.getName() + "的成绩是：" + student3.grade());
    }
}
