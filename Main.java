import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button,button02;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Title of Window");
        button = new Button();
        button02 = new Button();
        button.setText("Hey baby");
        button02.setText("This is my Grade");

        //This class will handle the button events
        button.setOnAction(this);
        button02.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button02);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //When button is clicked, handle() gets called
    //Button click is an ActionEvent (also MouseEvents, TouchEvents, etc...)
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button)
            JOptionPane.showMessageDialog(null, "Hey Charlie!");
        if (event.getSource() == button02)
            JOptionPane.showMessageDialog(null, "I'm a Senior");
    }

}
