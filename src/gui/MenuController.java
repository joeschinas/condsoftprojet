package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



import application.Main;
import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuController implements Initializable{
	@FXML
	private AnchorPane root_AnchorPane;
	@FXML
	private Button Apartamento;
	
	@FXML
	private Button Register;
	
	@FXML
	private MenuItem menuItemInicio;
	
	@FXML	
	private MenuItem menuItemAbout;
	
	@FXML
	private MenuItem menuItemLogout;
	@FXML
	private static Scene mainScene;
	@FXML
	public static Scene getMainScene() {
		return mainScene;
		
	}
	@FXML
	 public void onMenuItemLogout(ActionEvent event) {
	   	 try {

	            //add you loading or delays - ;-)
	            Node node = (Node) event.getSource();
	            Stage stage = (Stage) node.getScene().getWindow();
	            //stage.setMaximized(true);
	            stage.close();
	            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/gui/MainView.fxml")));
	            stage.setScene(scene);
	            stage.show();

	        } catch (IOException ex) {
	            System.err.println(ex.getMessage());
	        }
	   	return;
	    }
	@FXML
    public void CheckApt(ActionEvent event) {
   	 try {

            //add you loading or delays - ;-)
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            //stage.setMaximized(true);
            stage.close();
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/gui/ViewCheckOnApt.fxml")));
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
   	return;
    }
    @FXML
    public void User(ActionEvent event ) {
    		
    	try {
    			    
    		 Stage stage = null;
    	     Parent myNewScene = null;
    	     stage = (Stage) Register.getScene().getWindow();
             myNewScene = FXMLLoader.load(getClass().getResource("/gui/ViewUserRegistrer.fxml"));
            
             Scene scene = new Scene(myNewScene);
             stage.setScene(scene);
             stage.setTitle("Register");
             stage.show();     
             
            
           } catch (IOException ex) {
               System.err.println(ex.getMessage());
           }
      	return;
       }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	/*@FXML
	private void onMenuItemAbout() {
		loadView("/gui/About.fxml");
		
	}
	
	/*private void loadView(String absoluteName) {
		
		
		try {
			/*FXMLLoader loader = new  FXMLLoader(getClass().getResource(absoluteName));
			
			VBox newVBox = loader.load();
			
			Scene mainScene = getMainScene();
			
			VBox mainVBox = (VBox) ((Parent) mainScene.getRoot().getParent());
			
			Node mainMenu = mainVBox.getChildren().get(0);
			
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view",e.getMessage(), AlertType.ERROR);
		}
		
	}*/
	 
}
