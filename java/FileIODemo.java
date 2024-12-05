import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, File!");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
