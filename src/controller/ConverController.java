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
import javafx.scene.control.TextField;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author zyad shehab
 */
public class ConverController implements Initializable {

    @FXML
    private TextField nisField;
    @FXML
    private Button convertButton;
    @FXML
    private TextField usdField;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void convertButtonhandle(ActionEvent event) {
        if(nisField.getText().isEmpty()){
            Double usd=Double.parseDouble(usdField.getText());
            double con=usd*3.67;
            nisField.setText(con+"");
        }else if(usdField.getText().isEmpty()){
            Double nis=Double.parseDouble(nisField.getText());
            double con=nis*0.27;
            usdField.setText(con+"");
        }
    }

    @FXML
    private void logouthandle(ActionEvent event) throws IOException {
        ViewManager.openloginPage();
        ViewManager.closeconverPage();
    }
    
}
