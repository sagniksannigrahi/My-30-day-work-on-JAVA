public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 20, 40};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
