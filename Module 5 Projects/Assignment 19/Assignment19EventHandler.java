package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;


public class Assignment19EventHandler implements EventHandler<ActionEvent> {
	
	private Button button;
	
	public Assignment19EventHandler(Button button) {
		this.button = button;
		
	}
	  
  	public void handle(ActionEvent arg0) {
		if (button.getProperties().get("XORO").equals("O")) {
			button.getProperties().put("XORO", "X");
			Rectangle rectangle = new Rectangle(50, 50);
			rectangle.setFill(null);
			rectangle.setStroke(Color.BLACK);
			rectangle.setStrokeWidth(3.0);
			button.setGraphic(rectangle);
			
		}
  
  		else if (button.getProperties().get("XORO").equals("X")) {
  			button.getProperties().put("XORO", "O");
			Circle circle = new Circle(25);
			circle.setFill(null);
			circle.setStroke(Color.BLACK);
			circle.setStrokeWidth(3.0);
			button.setGraphic(circle);
			
        }
  	}
}
