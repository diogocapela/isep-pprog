package com.diogocapela.pl17;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class FXMLController implements Initializable {

    private int qntLetras = 3;
    private String[] letras = {"A", "B", "C", "D", "E", "F", "G"};
    private List<String> currentLetters = new ArrayList<>();

    @FXML
    private HBox main_container;
    @FXML
    private TextField input_qnt_letras;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        changeCurrentLetters();
        drawLetters();
    }

    @FXML
    private void handleConfirm(ActionEvent event) {
        try {
            qntLetras = Integer.parseInt(input_qnt_letras.getText());
            if (qntLetras > 0 && qntLetras <= 7) {
                changeCurrentLetters();
                drawLetters();

            } else {
                createAlertBox("Número de letras inválido!");
            }
        } catch (Exception e) {
            createAlertBox(e.getLocalizedMessage());
        }
        input_qnt_letras.clear();
    }

    @FXML
    private void handlePrev(ActionEvent event) {
        System.out.println("handlePrev()");
        String oldLetter = currentLetters.get(0);
        currentLetters.remove(0);
        currentLetters.add(oldLetter);
        drawLetters();
        System.out.println(currentLetters);
    }

    @FXML
    private void handleNext(ActionEvent event) {
        System.out.println("handleNext()");
        String oldLetter = currentLetters.get(currentLetters.size() - 1);
        currentLetters.remove(currentLetters.size() - 1);
        currentLetters.add(0, oldLetter);
        drawLetters();
        System.out.println(currentLetters);
    }

    private void drawLetters() {
        main_container.getChildren().clear();
        for (int i = 0; i < qntLetras; i++) {
            Label label = new Label(currentLetters.get(i));
            label.setStyle("-fx-font: 48 arial; -fx-padding: 5px; -fx-font-weight: bold;");
            main_container.getChildren().add(label);
        }
    }

    private void changeCurrentLetters() {
        currentLetters.clear();
        for (int i = 0; i < qntLetras; i++) {
            currentLetters.add(letras[i]);
        }
    }

    private void createAlertBox(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning Dialog");
        alert.setHeaderText("Look, a Warning Dialog");
        alert.setContentText(message);

        alert.showAndWait();
    }

}
