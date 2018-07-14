package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        StackPane root = new StackPane() {{
            getChildren().add(new Label("Hello, JavaFX!"));
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}