package ex2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ex2.fxml"));
        primaryStage.setTitle("Exercise 2");
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
