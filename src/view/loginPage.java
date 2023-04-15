/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author zyad shehab
 */
public class loginPage extends Stage{
    
    public loginPage() throws IOException  {
//        Image img =new Image("/css/icon.png");
//        ImageView imgV = new ImageView(img);
//        Label userName = new Label("User Name");
//        TextField userNamefield = new TextField();
//        Label password = new Label("password");
//        PasswordField passwordfield=new PasswordField();
//        Button btn1 =new Button("Login");
//        VBox box =new VBox(50,imgV,userName,userNamefield,password,passwordfield,btn1);
        Parent root = FXMLLoader.load(getClass().getResource("/viewFXML/login.fxml"));
        Scene scene = new Scene(root);
//        scene.getStylesheets().add("css/css1.css");
        this.setScene(scene);
//        this.setTitle("Rigester Page");
        this.setResizable(false);
        //this.show();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/viewFXML/CurrencyConverstion.fxml"));
//        Parent root = loader.load();     
//        Scene scene = new Scene(root);
//        this.setScene(scene);
//        this.show();
        
    }
   
}
