/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author zyad shehab
 */
public class converPage  extends Stage{
    
  
     public converPage() throws IOException  {
        Parent root = FXMLLoader.load(getClass().getResource("/viewFXML/conver.fxml"));
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.setResizable(false);
    }
    
    
}
