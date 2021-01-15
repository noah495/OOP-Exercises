package ex2;

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
    private TextField widthrect;
    @FXML
    private TextField heightrect;
    @FXML
    private TextField Resultbutton;

    @FXML
    private void calculate() {
        try {
            int width = Integer.parseInt(widthrect.getText());
            int height = Integer.parseInt(heightrect.getText());
            int result = width * height;

            Resultbutton.setText(String.valueOf(result));
        } catch (Exception e) {
            Error();
        }
    }
    @FXML
    private void Error() {
        widthrect.setPromptText("Field required");
        heightrect.setPromptText("Field required");

    }

}


