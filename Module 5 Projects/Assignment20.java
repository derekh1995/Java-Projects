package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class Assignment20 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Derek Holbrook's Assignment20");
			
			String[] var1 = {""};
			String[] var2 = {""};
			String[] operator = {""};
			
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid, 500, 330);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			grid.setAlignment(Pos.BASELINE_CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(10, 10, 10, 10));

			Label labelWork = new Label("Entered: ");
			labelWork.setAlignment(Pos.BASELINE_CENTER);
			labelWork.setFont(Font.font("Arial", 32));
			
			Label labelResult = new Label("Calculation: 0"); //13th position
			labelResult.setAlignment(Pos.BASELINE_CENTER);
			labelResult.setFont(Font.font("Arial", 32));
			
			Button num0btn = new Button("0");
			num0btn.setOnAction(event -> { 
				String input = "0";
				//int numinput0 = Integer.parseInt(input);
				String currentText = labelWork.getText();
				//labelWork.setText(currentText + numinput0);
				labelWork.setText(currentText + input);
				
			});
			num0btn.setFont(Font.font(32));
			num0btn.setPrefSize(150, 50);

			Button num1btn = new Button("1");
			num1btn.setOnAction(event -> { 
				String input = "1";
				//int numinput1 = Integer.parseInt(input);
				String currentText = labelWork.getText();
				//labelWork.setText(currentText + numinput1);
				labelWork.setText(currentText + input);
			});
			num1btn.setFont(Font.font(32));
			num1btn.setPrefSize(150, 50);

			Button addbtn = new Button("+");
			addbtn.setOnAction(event -> {
				//String strvar1 = labelWork.getText().substring(9);
				var1[0] = labelWork.getText().substring(9);
				//int numvar1 = Integer.parseInt(strvar1);
				//String result = labelResult.getText().substring(13);
				//int numresult = Integer.parseInt(result);
				//int calc = numvar1 + numresult;
				//labelResult.setText("Calculation: " + calc);
				operator[0] = "+";
				labelWork.setText("Entered: ");
			});
			addbtn.setFont(Font.font(32));
			addbtn.setPrefSize(150, 50);

			Button subbtn = new Button("-");
			subbtn.setOnAction(event -> {
				var1[0] = labelWork.getText().substring(9);
				operator[0] = "-";
				labelWork.setText("Entered: ");
			});
			subbtn.setFont(Font.font(32));
			subbtn.setPrefSize(150, 50);

			Button eqlbtn = new Button("=");
			eqlbtn.setOnAction(event -> {
				var2[0] = labelWork.getText().substring(9);
				if (operator[0].equals("+")) {
					String result = var1[0] + var2[0];
					labelResult.setText("Calculation: " + result);
				}
				
				else if (operator[0].equals("-")) {
					String result = var1[0].replaceFirst(var2[0] + "$", "");
					labelResult.setText("Calculation: " + result);
				}
			});
			eqlbtn.setFont(Font.font(32));
			eqlbtn.setPrefSize(150, 50);

			
			grid.add(labelWork, 0, 3);
			grid.add(labelResult, 0, 4);
			grid.add(num0btn, 0, 0, 1, 1);
			grid.add(num1btn, 0, 1, 1, 1);
			grid.add(addbtn, 1, 0, 1, 1);
			grid.add(subbtn, 1, 1, 1, 1);
			grid.add(eqlbtn, 1, 2, 1, 1);
			
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
