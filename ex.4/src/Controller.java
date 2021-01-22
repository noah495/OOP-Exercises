import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


public class Controller {
    @FXML
    private void checkDays() {
        days.setSelected(days.isSelected());
        weeks.setSelected(false);
        months.setSelected(false);
        years.setSelected(false);
    }
    @FXML
    private void checkWeeks() {
        weeks.setSelected(weeks.isSelected());
        days.setSelected(false);
        months.setSelected(false);
        years.setSelected(false);
    }
    @FXML
    private void checkMonths() {
        months.setSelected(months.isSelected());
        weeks.setSelected(false);
        days.setSelected(false);
        years.setSelected(false);
    }
    @FXML
    private void CheckYears() {
        years.setSelected(years.isSelected());
        weeks.setSelected(false);
        days.setSelected(false);
        months.setSelected(false);
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }
    @FXML
    private RadioButton days;
    @FXML
    private RadioButton weeks;
    @FXML
    private RadioButton months;
    @FXML
    private RadioButton years;
    @FXML
    private DatePicker birthday;


    @FXML

    private void calculate() {
        try {
            //int date = Integer.parseInt(traveltime.getText());

            if(days.isSelected()){

            }
            else if(weeks.isSelected()){
                //int result = moon / speed / 24;
                // outputtravel.setText(String.valueOf(result));
            }
            else if(months.isSelected()){

            }
            else if(years.isSelected()){

            }

        } catch (Exception e) {
            Error();
        }
    }
    @FXML
    private void Error() {
        birthday.setPromptText("Field required");

    }

}
