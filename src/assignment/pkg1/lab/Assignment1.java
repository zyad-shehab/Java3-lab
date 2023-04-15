/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.lab;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import view.ViewManager;
import static view.ViewManager.loginPage;
import view.loginPage;

/**
 *
 * @author zyad shehab
 */
public class Assignment1 extends Application {
          loginPage loginPage;

    
    @Override
    public void start(Stage primaryStage) throws IOException  {
         
      ViewManager.openloginPage();
//        loginPage = new loginPage();
//            loginPage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
