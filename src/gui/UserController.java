package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserController {
	@FXML
	private AnchorPane root_AnchorPane;

	@FXML
	private MenuItem menuItemInicio;
	
	@FXML	
	private MenuItem menuItemAbout;
	
	@FXML
	private MenuItem menuItemLogout;
	 
	


	 public void onItemInicio(ActionEvent event) {
	   	 
	   		try {
	   		 
	   		//add you loading or delays - ;-)
	             Node node = (Node) event.getSource();
	             Stage stage = (Stage) node.getScene().getWindow();
	             //stage.setMaximized(true);
	             stage.close();
	             Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/gui/ViewMenu.fxml")));
	             stage.setScene(scene);
	             stage.show();    
	             
	            
	           } catch (IOException ex) {
	               System.err.println(ex.getMessage());
	           }
	      	return;
	    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
}
