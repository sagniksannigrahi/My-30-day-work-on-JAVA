public class DebugDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
