/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;


/**
 *
 * @author zyad shehab
 */
public class ViewManager {
    public static loginPage loginPage ;
    public static converPage converPage;
    
    
    private ViewManager(){   
    }
    
    public static void openloginPage() throws IOException {
        if (loginPage == null) {
            loginPage = new loginPage();
            loginPage.show();
        } else {
            loginPage.show();
        }
        
    }
    public static void closeloginPage(){
        if(loginPage != null)
            loginPage.close();
    }
    
    public static void openconverPage() throws IOException {
        if (converPage == null) {
            converPage = new converPage();
            converPage.show();
        } else {
            converPage.show();
        }
        
    }
    public static void closeconverPage(){
        if(converPage != null)
            converPage.close();
    }
}
    

