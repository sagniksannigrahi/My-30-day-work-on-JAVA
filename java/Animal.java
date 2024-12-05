public class Animal {
    String type;

    void sound() {
        System.out.println(type + " makes a sound.");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.type = "Dog";
        a2.type = "Cat";

        a1.sound();
        a2.sound();
    }
}
