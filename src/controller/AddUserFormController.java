package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class AddUserFormController {
    public Button btnAdd;
    public Button btnCancel;
    public RadioButton rdoRegularUser;
    public RadioButton rdoAdmin;


    public void onClickAdd(ActionEvent actionEvent) {

    }

    public void onClickCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();

    }
}
