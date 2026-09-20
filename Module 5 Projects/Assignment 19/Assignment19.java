package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Assignment19 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			GridPane grid = new GridPane();
			Scene scene = new Scene(root, 500, 330);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.setCenter(grid);
			grid.setAlignment(Pos.BASELINE_CENTER);
			
			Circle circle1 = new Circle(25);
			Circle circle2 = new Circle(25);
			Circle circle3 = new Circle(25);
			Circle circle4 = new Circle(25);
			Circle circle5 = new Circle(25);
			Circle circle6 = new Circle(25);
			Circle circle7 = new Circle(25);
			Circle circle8 = new Circle(25);
			Circle circle9 = new Circle(25);
			
			circle1.setFill(null);
			circle1.setStroke(Color.BLACK);
			circle1.setStrokeWidth(3.0);
			circle2.setFill(null);
			circle2.setStroke(Color.BLACK);
			circle2.setStrokeWidth(3.0);
			circle3.setFill(null);
			circle3.setStroke(Color.BLACK);
			circle3.setStrokeWidth(3.0);
			circle4.setFill(null);
			circle4.setStroke(Color.BLACK);
			circle4.setStrokeWidth(3.0);
			circle5.setFill(null);
			circle5.setStroke(Color.BLACK);
			circle5.setStrokeWidth(3.0);
			circle6.setFill(null);
			circle6.setStroke(Color.BLACK);
			circle6.setStrokeWidth(3.0);
			circle7.setFill(null);
			circle7.setStroke(Color.BLACK);
			circle7.setStrokeWidth(3.0);
			circle8.setFill(null);
			circle8.setStroke(Color.BLACK);
			circle8.setStrokeWidth(3.0);
			circle9.setFill(null);
			circle9.setStroke(Color.BLACK);
			circle9.setStrokeWidth(3.0);
			
			Button btnL1 = new Button("", circle1);
			Button btnM1 = new Button("", circle2);
			Button btnR1 = new Button("", circle3);
			Button btnL2 = new Button("", circle4);
			Button btnM2 = new Button("", circle5);
			Button btnR2 = new Button("", circle6);
			Button btnL3 = new Button("", circle7);
			Button btnM3 = new Button("", circle8);
			Button btnR3 = new Button("", circle9);
			
			btnL1.getProperties().put("XORO", "O");
			btnM1.getProperties().put("XORO", "O");
			btnR1.getProperties().put("XORO", "O");
			btnL2.getProperties().put("XORO", "O");
			btnM2.getProperties().put("XORO", "O");
			btnR2.getProperties().put("XORO", "O");
			btnL3.getProperties().put("XORO", "O");
			btnM3.getProperties().put("XORO", "O");
			btnR3.getProperties().put("XORO", "O");
			
			btnL1.setPrefSize(150, 50);
			btnM1.setPrefSize(150, 50);
			btnR1.setPrefSize(150, 50);
			btnL2.setPrefSize(150, 50);
			btnM2.setPrefSize(150, 50);
			btnR2.setPrefSize(150, 50);
			btnL3.setPrefSize(150, 50);
			btnM3.setPrefSize(150, 50);
			btnR3.setPrefSize(150, 50);
			
			btnL1.setPadding(new Insets(25, 30, 25, 30));
			btnM1.setPadding(new Insets(25, 30, 25, 30));
			btnR1.setPadding(new Insets(25, 30, 25, 30));
			btnL2.setPadding(new Insets(25, 30, 25, 30));
			btnM2.setPadding(new Insets(25, 30, 25, 30));
			btnR2.setPadding(new Insets(25, 30, 25, 30));
			btnL3.setPadding(new Insets(25, 30, 25, 30));
			btnM3.setPadding(new Insets(25, 30, 25, 30));
			btnR3.setPadding(new Insets(25, 30, 25, 30));

			grid.add(btnL1, 0, 0, 1, 1);
			grid.add(btnM1, 1, 0, 1, 1);
			grid.add(btnR1, 2, 0, 1, 1);
			grid.add(btnL2, 0, 1, 1, 1);
			grid.add(btnM2, 1, 1, 1, 1);
			grid.add(btnR2, 2, 1, 1, 1);
			grid.add(btnL3, 0, 2, 1, 1);
			grid.add(btnM3, 1, 2, 1, 1);
			grid.add(btnR3, 2, 2, 1, 1);
			
			
	      	Assignment19EventHandler handlerL1 = new Assignment19EventHandler(btnL1);
	      	btnL1.setOnAction(handlerL1);
	      	Assignment19EventHandler handlerM1 = new Assignment19EventHandler(btnM1);
	      	btnM1.setOnAction(handlerM1);
	      	Assignment19EventHandler handlerR1 = new Assignment19EventHandler(btnR1);
	      	btnR1.setOnAction(handlerR1);
	      	
	      	Assignment19EventHandler handlerL2 = new Assignment19EventHandler(btnL2);
	      	btnL2.setOnAction(handlerL2);
	      	Assignment19EventHandler handlerM2 = new Assignment19EventHandler(btnM2);
	      	btnM2.setOnAction(handlerM2);
	      	Assignment19EventHandler handlerR2 = new Assignment19EventHandler(btnR2);
	      	btnR2.setOnAction(handlerR2);
	      	
	      	Assignment19EventHandler handlerL3 = new Assignment19EventHandler(btnL3);
	      	btnL3.setOnAction(handlerL3);
	      	Assignment19EventHandler handlerM3 = new Assignment19EventHandler(btnM3);
	      	btnM3.setOnAction(handlerM3);
	      	Assignment19EventHandler handlerR3 = new Assignment19EventHandler(btnR3);
	      	btnR3.setOnAction(handlerR3);

	      	
	      	
	      	
			primaryStage.setScene(scene);
			primaryStage.setTitle("Derek Holbrook's Assignment19");
			primaryStage.show();
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
