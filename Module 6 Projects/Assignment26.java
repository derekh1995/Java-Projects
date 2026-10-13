ackage application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class Assignment26 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
	    	BorderPane root = new BorderPane();
	    	HBox box = new HBox();
	    	Scene scene = new Scene(root, 600, 600);
	    	
	    	root.setTop(box);
	    	
	    	Circle circle = new Circle(25);
	    	circle.setFill(Color.BLACK);
	    	circle.setStroke(Color.BLACK);
	    	
	    	circle.strokeWidthProperty().bind(root.widthProperty().multiply(0.25));
	    	
	    	StackPane stack = new StackPane(circle);
	    	root.setCenter(stack);

	    	
	    	Button button1 = new Button ("Red");
	    	button1.setFont(new Font(24));
			button1.setOnAction(event -> {
				circle.setFill(Color.RED);
				circle.setStroke(Color.RED);
			});
	    	
	    	Button button2 = new Button ("Blue");
	    	button2.setFont(new Font(24));
			button2.setOnAction(event -> {
				circle.setFill(Color.BLUE);
				circle.setStroke(Color.BLUE);
			});
	    	
	    	Button button3 = new Button ("Black");
	    	button3.setFont(new Font(24));
			button3.setOnAction(event -> {
				circle.setFill(Color.BLACK);
				circle.setStroke(Color.BLACK);
			});
	    	
	    	Button button4 = new Button ("Green");
	    	button4.setFont(new Font(24));
			button4.setOnAction(event -> {
				circle.setFill(Color.GREEN);
				circle.setStroke(Color.GREEN);
			});

	        box.getChildren().addAll(button1, button2, button3, button4);
	        box.setAlignment(Pos.BASELINE_CENTER);
	        
	        primaryStage.setTitle("Derek Holbrook's Assignment26");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
