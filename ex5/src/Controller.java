import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.Instant;


public class Controller {
String star = "*";

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
    private TextArea tree;

    @FXML
    private void calculate() {
        try {
            int height = Integer.parseInt(logheight.getText());
            int width = Integer.parseInt(logwidth.getText());
            int peak = Integer.parseInt(peakhight.getText());
        for(int i = 0; i > height; i++ ) {
            for(int ii = 0; ii > width; ii++) {
                System.out.println(star);
            }
        }
        } catch (Exception e) {
            Error();
        }
    }
    @FXML
    private void Error() {
        logwidth.setPromptText("Field required");
        logheight.setPromptText("Field required");
        peakhight.setPromptText("Field required");



    }


}