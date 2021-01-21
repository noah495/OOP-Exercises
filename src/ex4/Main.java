package ex4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ex4.fxml"));
        primaryStage.setTitle("Exercise 4");
        primaryStage.setScene(new Scene(root, 500, 350));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}