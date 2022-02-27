package com.diogocapela.playgroundjavafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class FMXLController implements Initializable{

    @FXML
    private TextField campo_de_texto;

    @FXML
    protected void handleMerdaButtonClick(ActionEvent event) {
        campo_de_texto.setText("COCO");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
