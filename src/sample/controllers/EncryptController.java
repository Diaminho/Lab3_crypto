package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.managers.EncryptManager;

import java.io.IOException;

public class EncryptController {
    private static Parent root;

    private static EncryptManager encryptManager;

    private static Stage primaryStage;


    public EncryptController(Stage primaryStage) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../fxml/encrypt.fxml"));
        this.primaryStage=primaryStage;
        primaryStage.setTitle("Шифрование");
        encryptManager = new EncryptManager(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public EncryptController(){

    }

    @FXML
    public void onChooseFile(){
        encryptManager.onChooseFile();
    }

    @FXML
    public void onSaveEncrTextButton(){
        encryptManager.onSaveEncrTextButton();
        //System.out.println(fileName);
    }

    @FXML
    public void onMenuButton(){
        primaryStage.close();
        try {
            new MainController(primaryStage);
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
