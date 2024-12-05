import com.google.gson.*;


public class JsonDemo {
    public static void main(String[] args) {
        Person person = new Person("Sagnik", 20);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
