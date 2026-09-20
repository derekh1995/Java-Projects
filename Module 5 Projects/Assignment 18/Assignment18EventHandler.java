package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class Assignment18EventHandler implements EventHandler<ActionEvent> {
	
	private Label label;
	
	public Assignment18EventHandler(Label l) {
		label = l;
		
	}
	  
  	public void handle(ActionEvent arg0) {
		if (label.getText() == "red") {
          label.setText("blue");
          label.setTextFill(Color.BLUE);
		}
  
  		else if (label.getText() == "blue") {
             label.setText("yellow");
             label.setTextFill(Color.YELLOW);
        }
                 
  		else if (label.getText() == "yellow") {
             label.setText("red");
             label.setTextFill(Color.RED);
        }
  	}
}
