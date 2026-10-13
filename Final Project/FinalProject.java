package application;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class FinalProject extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Derek Holbrook's Final Project");

			//CALCULATOR (ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION)
			String[] var1 = {""};
			String[] var2 = {""};
			String[] operator = {""};
			
			GridPane calculatorGridPane = new GridPane();
			
			Label labelWork = new Label("Entered: ");
			labelWork.setFont(Font.font("Arial", 32));
			Label labelResult = new Label("Calculation: 0"); //13th position
			labelResult.setFont(Font.font("Arial", 32));
			
			
			Button num0btn = new Button("0");
			num0btn.setOnAction(event -> { 
				String input = "0";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
				
			});
			num0btn.setFont(Font.font(32));
			num0btn.setPrefSize(150, 50);

			
			Button num1btn = new Button("1");
			num1btn.setOnAction(event -> { 
				String input = "1";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num1btn.setFont(Font.font(32));
			num1btn.setPrefSize(150, 50);
			
			
			Button num2btn = new Button("2");
			num2btn.setOnAction(event -> { 
				String input = "2";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num2btn.setFont(Font.font(32));
			num2btn.setPrefSize(150, 50);
			
			
			Button num3btn = new Button("3");
			num3btn.setOnAction(event -> { 
				String input = "3";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num3btn.setFont(Font.font(32));
			num3btn.setPrefSize(150, 50);
			
			
			Button num4btn = new Button("4");
			num4btn.setOnAction(event -> { 
				String input = "4";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num4btn.setFont(Font.font(32));
			num4btn.setPrefSize(150, 50);
			
			
			Button num5btn = new Button("5");
			num5btn.setOnAction(event -> { 
				String input = "5";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num5btn.setFont(Font.font(32));
			num5btn.setPrefSize(150, 50);
			
			
			Button num6btn = new Button("6");
			num6btn.setOnAction(event -> { 
				String input = "6";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num6btn.setFont(Font.font(32));
			num6btn.setPrefSize(150, 50);
			
			
			Button num7btn = new Button("7");
			num7btn.setOnAction(event -> { 
				String input = "7";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num7btn.setFont(Font.font(32));
			num7btn.setPrefSize(150, 50);
			
			
			Button num8btn = new Button("8");
			num8btn.setOnAction(event -> { 
				String input = "8";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num8btn.setFont(Font.font(32));
			num8btn.setPrefSize(150, 50);
			
			
			Button num9btn = new Button("9");
			num9btn.setOnAction(event -> { 
				String input = "9";
				String currentText = labelWork.getText();
				labelWork.setText(currentText + input);
			});
			num9btn.setFont(Font.font(32));
			num9btn.setPrefSize(150, 50);
			
			
			Button addbtn = new Button("+");
			addbtn.setOnAction(event -> {
				var1[0] = labelWork.getText().substring(9);
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

			
			Button mltbtn = new Button("*");
			mltbtn.setOnAction(event -> {
				var1[0] = labelWork.getText().substring(9);
				operator[0] = "*";
				labelWork.setText("Entered: ");
			});
			mltbtn.setFont(Font.font(32));
			mltbtn.setPrefSize(150, 50);
			
			
			Button divbtn = new Button("/");
			divbtn.setOnAction(event -> {
				var1[0] = labelWork.getText().substring(9);
				operator[0] = "/";
				labelWork.setText("Entered: ");
			});
			divbtn.setFont(Font.font(32));
			divbtn.setPrefSize(150, 50);
			
			
			Button clrbtn = new Button("CLEAR");
			clrbtn.setOnAction(event -> {
				labelWork.setText("Entered: ");
				labelResult.setText("Calculation: 0");
				
				var1[0] = "";
				var2[0] = "";
				operator[0] = "";
			});
			clrbtn.setFont(Font.font(32));
			clrbtn.setPrefSize(150, 50);
			
						
			Button eqlbtn = new Button("=");
			eqlbtn.setOnAction(event -> {
				var2[0] = labelWork.getText().substring(9);
				
				Integer num1 = Integer.parseInt(var1[0]);
				Integer num2 = Integer.parseInt(var2[0]);
				Integer result = 0;
				
				if (operator[0].equals("+")) {
					result = num1 + num2;
					labelResult.setText("Calculation: " + result);
				}
				
				else if (operator[0].equals("-")) {
					result = num1 - num2;
					labelResult.setText("Calculation: " + result);
				}
				
				else if (operator[0].equals("*")) {
					result = num1 * num2;
					labelResult.setText("Calculation: " + result);
				}
				
				else if (operator[0].equals("/")) {
					result = num1 / num2;
					labelResult.setText("Calculation: " + result);
				}
			});
			eqlbtn.setFont(Font.font(32));
			eqlbtn.setPrefSize(150, 50);

			
			calculatorGridPane.add(labelWork, 5, 0);
			calculatorGridPane.add(labelResult, 5, 1);
			
			calculatorGridPane.add(num0btn, 1, 3, 1, 1);
			
			calculatorGridPane.add(num1btn, 0, 2, 1, 1);
			calculatorGridPane.add(num2btn, 1, 2, 1, 1);
			calculatorGridPane.add(num3btn, 2, 2, 1, 1);
			
			calculatorGridPane.add(num4btn, 0, 1, 1, 1);
			calculatorGridPane.add(num5btn, 1, 1, 1, 1);
			calculatorGridPane.add(num6btn, 2, 1, 1, 1);
			
			calculatorGridPane.add(num7btn, 0, 0, 1, 1);
			calculatorGridPane.add(num8btn, 1, 0, 1, 1);
			calculatorGridPane.add(num9btn, 2, 0, 1, 1);
			
			calculatorGridPane.add(divbtn, 4, 0, 1, 1);
			calculatorGridPane.add(mltbtn, 3, 0, 1, 1);
			calculatorGridPane.add(subbtn, 4, 1, 1, 1);
			calculatorGridPane.add(addbtn, 3, 1, 1, 1);
			calculatorGridPane.add(clrbtn, 4, 2, 1, 1);
			calculatorGridPane.add(eqlbtn, 3, 2, 1, 1);
			
			//TO-DO LIST (Adding tasks with checkboxes)
			VBox toDoListVBox = new VBox();
			
			TextField checkBoxNameField = new TextField();
			checkBoxNameField.setPromptText("Enter a task...");
						
			Button addCheckBoxButton = new Button("Add Checkbox");
			
			HBox buttonAndNameGroup = new HBox(10, checkBoxNameField, addCheckBoxButton);
			toDoListVBox.getChildren().add(buttonAndNameGroup);
			
			addCheckBoxButton.setOnAction(event -> {
				CheckBox newCheckBox = new CheckBox(checkBoxNameField.getText());
				toDoListVBox.getChildren().add(newCheckBox);
			});
			
			//WEIGHT CONVERSION TOOL (POUNDS, KILOGRAMS, STONE)			
			VBox weightConversionVBox = new VBox();
			
			TextField poundsTextField = new TextField();
			poundsTextField.setPromptText("Enter a weight in lbs...");
			Button poundsConvertButton = new Button("Convert");
			HBox poundsHBox = new HBox(25, poundsTextField, poundsConvertButton);
			
			TextField kilogramsTextField = new TextField();
			kilogramsTextField.setPromptText("Enter a weight in kgs...");
			Button kilogramsConvertButton = new Button("Convert");
			HBox kilogramsHBox = new HBox(25, kilogramsTextField, kilogramsConvertButton);
			
			TextField stoneTextField = new TextField();
			stoneTextField.setPromptText("Enter a weight in stone...");
			Button stoneConvertButton = new Button("Convert");
			HBox stoneHBox = new HBox(25, stoneTextField, stoneConvertButton);
			
			Label poundsConversion = new Label("Weight in lbs: ");
			Label kilogramsConversion = new Label("Weight in kgs: ");
			Label stoneConversion = new Label("Weight in stone: ");
			VBox conversionResultsVBox = new VBox(25, poundsConversion, kilogramsConversion, stoneConversion);
			
			
			poundsConvertButton.setOnAction(event -> {
				String lbsInput = poundsTextField.getText();
				poundsConversion.setText("Weight in lbs: " + poundsTextField.getText());
				Double lbsNum = Double.parseDouble(lbsInput);
				Double kgsResult = lbsNum / 2.205;
				Double stnResult = lbsNum / 14;
				kilogramsConversion.setText("Weight in kgs: " + kgsResult);
				stoneConversion.setText("Weight in stone: " + stnResult);
			});
			
			kilogramsConvertButton.setOnAction(event -> {
				String kgsInput = kilogramsTextField.getText();
				kilogramsConversion.setText("Weight in kgs: " + kilogramsTextField.getText());
				Double kgsNum = Double.parseDouble(kgsInput);
				Double lbsResult = kgsNum * 2.205;
				Double stnResult = kgsNum / 6.35;
				poundsConversion.setText("Weight in lbs: " + lbsResult);
				stoneConversion.setText("Weight in stone: " + stnResult);
			});
			
			stoneConvertButton.setOnAction(event -> {
				String stnInput = stoneTextField.getText();
				stoneConversion.setText("Weight in stone: " + stoneTextField.getText());
				Double stnNum = Double.parseDouble(stnInput);
				Double lbsResult = stnNum * 14;
				Double kgsResult = stnNum * 6.35;
				poundsConversion.setText("Weight in lbs: " + lbsResult);
				kilogramsConversion.setText("Weight in kgs: " + kgsResult);
			});

			weightConversionVBox.getChildren().addAll(poundsHBox, kilogramsHBox, stoneHBox, conversionResultsVBox);
			
			
			//SIMPLE INTEREST CALCULATOR
			VBox interestRateVBox = new VBox();
			
			Label formulaLabel = new Label("The simple interest formula is 'Amount = Principle * Rate * Time (in years)'");
			
			TextField principleTextField = new TextField();
			principleTextField.setPromptText("Please enter the principal amount...");
			
			TextField rateTextField = new TextField();
			rateTextField.setPromptText("Please enter the interest rate...");
			
			TextField timeTextField = new TextField();
			timeTextField.setPromptText("Please enter the time in years...");
			
			Button calculateButton = new Button("Calculate");
			
			Label calculationLabel = new Label("The amount is: ");
			
			calculateButton.setOnAction(event -> {
				String principleVar = principleTextField.getText();
				Double principleNum = Double.parseDouble(principleVar);
				String rateVar = rateTextField.getText();
				Double rateNum = Double.parseDouble(rateVar);
				String timeVar = timeTextField.getText();
				Double timeNum = Double.parseDouble(timeVar);
				
				Double amount = principleNum * rateNum * timeNum;
				
				calculationLabel.setText("The amount is: " + amount);
			});
			
			VBox textVBox = new VBox (10, formulaLabel, principleTextField, rateTextField, timeTextField);
			HBox calculationHBox = new HBox (10, calculateButton, calculationLabel);
			
			interestRateVBox.getChildren().addAll(textVBox, calculationHBox);
			

			//TAB INFO
			Tab tab1 = new Tab ("CALCULATOR");
			tab1.setContent(calculatorGridPane);
			
			Tab tab2 = new Tab ("TO-DO LIST");
			tab2.setContent(toDoListVBox);
			
			Tab tab3 = new Tab ("WEIGHT CONVERTER");
			tab3.setContent(weightConversionVBox);
			
			Tab tab4 = new Tab ("SIMPLE INTEREST CALCULATOR");
			tab4.setContent(interestRateVBox);
				
			TabPane tabPane = new TabPane();
			tabPane.setSide(Side.TOP);
			tabPane.setVisible(true);
			tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);
			
			//SCENE & PANE INFO
			StackPane stackPane = new StackPane(tabPane);
			Scene scene = new Scene(stackPane, 1200, 500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stackPane.setAlignment(Pos.BASELINE_CENTER);
			stackPane.setPadding(new Insets(10, 10, 10, 10));
			
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
