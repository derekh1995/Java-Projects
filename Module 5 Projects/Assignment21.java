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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Assignment21 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Derek Holbrook's Assignment21");

			
			//RADIO BUTTON SECTION FOR QUESTION 1
			Label question1 = new Label("Do you like Java?");			
			
			ToggleGroup rbGroup = new ToggleGroup();
			
			RadioButton yesRB = new RadioButton("Yes");
			yesRB.setToggleGroup(rbGroup);
			yesRB.setSelected(true);
			RadioButton noRB = new RadioButton("No");
			noRB.setToggleGroup(rbGroup);
			
			VBox rbVBox = new VBox(10, question1, yesRB, noRB);
			rbVBox.setPadding(new Insets(25));
			
			//CHECKBOX SECTION FOR QUESTION 2
			Label question2 = new Label("Which of these video games do you enjoy playing");
			
			CheckBox wowBox = new CheckBox("World of Warcraft");
			CheckBox lolBox = new CheckBox("League of Legends");
			CheckBox skyrimBox = new CheckBox("The Elder Scrolls V: Skyrim");
			CheckBox aoeBox = new CheckBox("Age of Empires");
			

			
			
			VBox cbVBox = new VBox(10, question2, wowBox, lolBox, skyrimBox, aoeBox);
			cbVBox.setPadding(new Insets(25));
			
			//TEXTFIELD SECTION FOR QUESTION 3
			Label question3 = new Label("What is your name?");

			TextField textField = new TextField("Enter your name here...");
			Button tfbtn = new Button("Enter");
			tfbtn.setOnAction(event -> {
				String userInput = textField.getText();
				//System.out.println("Your name is " + userInput);
				textField.setText(userInput);
			});


			
			VBox tfVBox = new VBox(10, question3, textField, tfbtn);
			
			//SUMMARY (TAB4)
			Label summaryLabel = new Label();
			VBox summaryVBox = new VBox(10, summaryLabel);


			//TAB INFO
			Tab tab1 = new Tab ("First Question");
			tab1.setContent(rbVBox);
			
			Tab tab2 = new Tab ("Second Question");
			tab2.setContent(cbVBox);
			
			Tab tab3 = new Tab ("Third Question");
			tab3.setContent(tfVBox);
			
			Tab tab4 = new Tab ("Summary");
			tab4.setContent(summaryVBox);
			tab4.setOnSelectionChanged(event -> {
				String rbAnswers = ((RadioButton) rbGroup.getSelectedToggle()).getText();
				String name = textField.getText();
				ArrayList<String> games = new ArrayList<>();
				
				
				if (wowBox.isSelected() == true) {
					games.add("World of Warcraft");
				}
				if (lolBox.isSelected() == true) {
					games.add("League of Legends");
				}
				if (skyrimBox.isSelected() == true) {
					games.add("The Elder Scrolls V: Skyrim");
				}
				if (aoeBox.isSelected() == true) {
					games.add("Age of Empires");
				}

				
				summaryLabel.setText(
						"Here are your responses to this survey: \n\n" + 
						"1. Do you like Java? \n" + rbAnswers + "\n" + 
						"2. Which games do you enjoy playing? \n" + games + "\n" + 
						"3. Your name is " + name);
			});

			
			TabPane tabPane = new TabPane();
			tabPane.setSide(Side.TOP);
			tabPane.setVisible(true);
			tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);
			
			//SCENE & PANE INFO
			StackPane stackPane = new StackPane(tabPane);
			Scene scene = new Scene(stackPane, 500, 330);
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
