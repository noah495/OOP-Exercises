package ex5;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {

    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
    @FXML
    private TextField logheight;
    @FXML
    private TextField logwidth;
    @FXML
    private TextField peakhight;
    @FXML
    private TextField tree;


}