package com.diogocapela.pl15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    private int contador = 0;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        contador++;
        System.out.println("You clicked me!");
        label.setText("" + contador);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
