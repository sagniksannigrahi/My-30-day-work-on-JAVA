import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
