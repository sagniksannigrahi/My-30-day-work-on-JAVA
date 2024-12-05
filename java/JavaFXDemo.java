import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> System.out.println("Button clicked!"));

        Scene scene = new Scene(btn, 200, 100);
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
