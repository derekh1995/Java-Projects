package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.text.Font;
//import javafx.scene.paint.Color;


public class Assignment18 extends Application {

    @Override
    public void start(Stage stage) throws Exception{
                
    	VBox root = new VBox(10);
    	Scene scene = new Scene(root, 600, 600);
    	
    	Label l = new Label("red");
    	l.setFont(new Font(32));
    	Button button = new Button ("Press to change colors");
    	button.setFont(new Font(24));
        l.setTextFill(Color.RED);
    	
        
      	Assignment18EventHandler handler = new Assignment18EventHandler(l);
      	button.setOnAction(handler);
    	
    	
    	root.getChildren().add(l);
        root.getChildren().add(button);
        root.setAlignment(Pos.BASELINE_CENTER);
        
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
         
    }
}

