public class Person {
    String name;
    int age;

    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sagnik", 20);
        p1.display();
    }
}
