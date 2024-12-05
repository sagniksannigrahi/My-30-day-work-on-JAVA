class Box<T> {
    T item;

    Box(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Hello");
        System.out.println(box.getItem());
    }
}
