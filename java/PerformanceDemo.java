public class PerformanceDemo {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        long startTime = System.nanoTime();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }
}
