package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	//private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) { 
		try { 
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); 
<<<<<<< HEAD
		 Parent  parent = loader.load(); 
		 
		// scrollPane.setFitToHeight(true);
		// scrollPane.setFitToWidth(true);
		 Scene mainScene = new Scene(parent); 
=======
		 Parent Parent = loader.load(); 
		 
	//	 scrollPane.setFitToHeight(true);
		// scrollPane.setFitToWidth(true);
		 
		 Scene mainScene = new Scene(Parent); 
>>>>>>> db1f7cb09bb8fd9052e64226d6900b9cfad4d048
		 primaryStage.setScene(mainScene); 
		 primaryStage.setTitle("CONDSOFT"); 
		 primaryStage.show(); 
		 } catch (IOException e) { 
		 e.printStackTrace(); 
		 }
		
	}
	
		/*public static Scene mainScene() {
			return mainScene;
		}**/
	public static void main(String[] args) {
		launch(args);
	}
}
