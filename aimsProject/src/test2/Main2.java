package test2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main2 extends Application {
 
    @Override
    public void start(Stage primaryStage) {
        // Tạo một nút bấm
        Button btn = new Button("Click Me!");
        btn.setOnAction(event -> System.out.println("Hello, JavaFX!"));
 
        // Sắp xếp nút trong StackPane
        StackPane root = new StackPane();
        root.getChildren().add(btn);
 
        // Tạo Scene và gắn nó vào Stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
