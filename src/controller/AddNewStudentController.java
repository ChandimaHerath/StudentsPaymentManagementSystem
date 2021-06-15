package controller;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddNewStudentController {
    public Button btnAdd;
    public Button btnCancel;


    public void onClickAdd(ActionEvent actionEvent) {
    }

    public void onClickCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) btnAdd.getScene().getWindow();
        stage.close();
    }
}
