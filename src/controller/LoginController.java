/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author zyad shehab
 */
public class LoginController implements Initializable {

    @FXML
    private Button login;
    @FXML
    private TextField passField;
    @FXML
    private TextField userField;
    @FXML
    private Label Incorrect;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginHandel(ActionEvent event) throws IOException {
        String user="zyad";
        String pass="123";
        if(userField.getText().equalsIgnoreCase(user)&&passField.getText().equalsIgnoreCase(pass)){
            ViewManager.openconverPage();
            ViewManager.closeloginPage();
        } else 
            Incorrect.setText("Incorrect username or password");
    }

    @FXML
    private void userFieldHandel(ActionEvent event) {
    }
    
}
