package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        root.setPrefSize(500, 500);

        Canvas canvas = new Canvas(1000, 700);
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/img/twoofthem.jpg")));
        root.getChildren().add(canvas);
        canvas.getGraphicsContext2D().drawImage(image, -100, 0);
        canvas.getGraphicsContext2D().setFill(Color.MAGENTA);
        Font font = Font.font("Arial", FontWeight.BOLD, 20);
        canvas.getGraphicsContext2D().setFont(font);
        canvas.getGraphicsContext2D().fillText("Two of them :)", 100, 600);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
