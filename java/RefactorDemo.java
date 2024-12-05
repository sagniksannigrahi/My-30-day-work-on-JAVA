public class RefactorDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sum(numbers));
    }

    static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}
