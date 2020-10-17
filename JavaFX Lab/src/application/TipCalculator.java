package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class TipCalculator extends Application {
	
	private Button button;
	
	private TextField beforeConvert;
	private Label resultLabel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Label message1 = new Label("Resturant Charge:");
		Label message2 = new Label("Amount to Tip:");
		
		beforeConvert = new TextField();
		
		button = new Button("Calculate Tip");
		
		button.setOnAction(new ButtonClickHandler());
		
		resultLabel = new Label();
		
		VBox vbox = new VBox(10, message1, beforeConvert, button, message2, resultLabel);
		
		Scene scene = new Scene(vbox, 180, 180);
	    
		vbox.setAlignment(Pos.TOP_CENTER);
		
		vbox.setPadding(new Insets(10));
		
	    primaryStage.setScene(scene);
	    
	    //primaryStage.setTitle("Tip Calculator");
	    
	    primaryStage.show();
		
	}
	
	class ButtonClickHandler implements EventHandler<ActionEvent> {
		
		public void handle(ActionEvent event) {
			
			Double user = Double.parseDouble(beforeConvert.getText());
			
			double tip = user * 0.2;
			
			resultLabel.setText(String.format("$%,.2f", tip));
			
		}
	}
}
