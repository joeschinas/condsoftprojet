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



	 public void onItemInicio(ActionEvent event) {
	   	 
	   		try {
	   		
	   		//add you loading or delays - ;-)
	   				Stage stage = null;
	    	     Parent myNewScene = null;
	    	     stage = (Stage) menuItemInicio.getParentPopup().getOwnerWindow();
	    	     myNewScene = FXMLLoader.load(getClass().getResource("/gui/ViewMenu.fxml"));
	            
	             Scene scene = new Scene(myNewScene);
	             stage.setScene(scene);
	             stage.setTitle("Painel Gestor CondSoft");
	             stage.show();     
	               
	             
	            
	           } catch (IOException ex) {
	               System.err.println(ex.getMessage());
	           }
	      	return;
	    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
}
