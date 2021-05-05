package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) { 
		try { 
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); 
		 Parent  parent = loader.load(); 
		 
		// scrollPane.setFitToHeight(true);
		// scrollPane.setFitToWidth(true);
		 Scene mainScene = new Scene(parent); 
		 primaryStage.setScene(mainScene); 
		 primaryStage.setTitle("CONDSOFT"); 
		 primaryStage.show(); 
		 } catch (IOException e) { 
		 e.printStackTrace(); 
		 }
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
