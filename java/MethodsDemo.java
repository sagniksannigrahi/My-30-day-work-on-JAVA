public class MethodsDemo {
    public static void main(String[] args) {
        greet();
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);
    }

    static void greet() {
        System.out.println("Hello! Welcome to Java methods.");
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }
}
