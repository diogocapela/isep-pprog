package com.diogocapela.playgroundjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    // https://www.youtube.com/watch?v=7LxWQIDOzyE&index=4&list=PL6gx4Cwl9DGBzfXLWLSYVy8EbTdpGbUIG

    Stage window;

    Button nextButton;
    
    public static void main(String[] args) {
        //launch(args);

    }





    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("cenas.fxml"));

        Scene scene = new Scene(root, 300, 275);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }






    /**
    // Stage - window
    // Scene - stuff inside the window

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Title of the Window");






        nextButton = new Button("carregaDelícia");
        // ou nextButton.setText("Click me");
        nextButton.setOnAction(event -> {
            System.out.println("nextButton clicked!");
        });






        StackPane myLayout = new StackPane();

        myLayout.getChildren().add(nextButton);

        Scene myScene = new Scene(myLayout, 800, 600);

        primaryStage.setScene(myScene);

        primaryStage.show();

    }

    // when you're trying to handle clicks events, look in this class for the handle method
    //nextButton.setOnAction(this);
    /**
     *
     * implements EventHandler<ActionEvent>
     *
    // method that is called when the user clicks the button, how to handle the button click?
    @Override
    public void handle(ActionEvent event) {

        // check which button called the handle - event.getSource()

        if(event.getSource() == nextButton) {
            System.out.println("nextButton clicked");
        }
    }
    **/


}
