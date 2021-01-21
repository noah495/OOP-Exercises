package ex3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class Controller {
    int moon = 384403;


    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
    @FXML
    private void checkDays() {
        days.setSelected(days.isSelected());
        hours.setSelected(false);
    }

    @FXML
    private void checkHours() {
        hours.setSelected(hours.isSelected());
        days.setSelected(false);
    }
    @FXML
    private TextField outputtravel;


    @FXML
    private TextField traveltime;
    @FXML
    private RadioButton hours;
    @FXML
    private RadioButton days;



    @FXML

    private void calculate() {
        try {
            int speed = Integer.parseInt(traveltime.getText());

            if(hours.isSelected()){
                days.setSelected(false);
                int result = moon / speed;
                outputtravel.setText(String.valueOf(result));
            }
            else if(days.isSelected()){
                hours.setSelected(false);
                int result = moon / speed / 24;
                outputtravel.setText(String.valueOf(result));
            }
        } catch (Exception e) {
            Error();
        }
    }
    @FXML
    private void Error() {
        traveltime.setPromptText("Field required");

    }


}


