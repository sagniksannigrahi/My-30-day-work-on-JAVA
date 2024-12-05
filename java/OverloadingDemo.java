public class OverloadingDemo {
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers: " + add(5, 10));
        System.out.println("Sum of 3 numbers: " + add(5, 10, 15));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
