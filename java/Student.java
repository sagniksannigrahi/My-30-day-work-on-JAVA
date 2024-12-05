public class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sagnik";
        s1.age = 20;
        s1.introduce();
    }
}
