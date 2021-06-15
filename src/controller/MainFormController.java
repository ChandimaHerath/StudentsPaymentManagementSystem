package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public Button btnAddNewStudent;
    public Button btnSearchStudent;
    public Button btnSettings;
    public Button btnPrintReceipt;

    public void initialize(){

    }


    public void onClickAddNewStudent(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) btnAddNewStudent.getScene().getWindow();
    //stage.close();
    Stage primaryStage = new Stage();
    Parent root = FXMLLoader.load(getClass().getResource("/view/AddNewStudentForm.fxml"));
    primaryStage.setTitle("Add New Student");
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();



    }


    public void onClickSearchStudent(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnSearchStudent.getScene().getWindow();
        //stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/SearchStudentForm.fxml"));
        primaryStage.setTitle("Search Student");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public void onClickPrintReceipt(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnSettings.getScene().getWindow();
        //stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/PrintRecieptForm.fxml"));
        primaryStage.setTitle("Payments");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void onClickSettings(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnSettings.getScene().getWindow();
        //stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/SettingsForm.fxml"));
        primaryStage.setTitle("Settings");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
