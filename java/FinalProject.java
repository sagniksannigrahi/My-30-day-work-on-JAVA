import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int count = scanner.nextInt();
        int[] items = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            items[i] = scanner.nextInt();
        }

        System.out.println("Items entered: ");
        for (int item : items) {
            System.out.println(item);
        }
    }
}
