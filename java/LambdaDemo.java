interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operate(10, 20));
    }
}
