package sample;

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
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Exercise 1");
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
        Text txt = new Text();
        txt.setText("Hello World");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
