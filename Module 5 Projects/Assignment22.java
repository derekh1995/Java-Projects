package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Assignment22 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Canvas canvas = new Canvas(800, 800);
			GraphicsContext gc;
			ColorPicker clrPicker = new ColorPicker();
			gc = canvas.getGraphicsContext2D();
			gc.setStroke(Color.BLACK);
			gc.setLineWidth(3);

			Pane pane = new Pane();
			Scene scene = new Scene(pane,800, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			pane.getChildren().addAll(canvas, clrPicker);
			
			clrPicker.setValue(Color.BLACK);
			clrPicker.setOnAction(event -> {
				gc.setStroke(clrPicker.getValue());
			});
			
			scene.setOnMousePressed(event -> {
				gc.beginPath();
				gc.lineTo(event.getSceneX(), event.getSceneY());
				gc.stroke();
			});
			
			scene.setOnMouseDragged(event -> {
				gc.lineTo(event.getSceneX(), event.getSceneY());
				gc.stroke();
			});
			
			//Doesn't change functionality when I already have scene.setOnMouseDragged, but drastically changes functionality when I comment out .setOnMouseDragged
			scene.setOnMouseReleased(event -> {
				gc.lineTo(event.getSceneX(), event.getSceneY());
				gc.stroke();
			});
			
			
			primaryStage.setTitle("Derek Holbrook's Assignment22");
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
