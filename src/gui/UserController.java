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
import javafx.stage.Stage;

public class UserController {
	@FXML
	private Button Apartamento;
	

	@FXML
	private MenuItem menuItemInicio;
	
	@FXML	
	private MenuItem menuItemAbout;
	
	@FXML
	private MenuItem menuItemLogout;
	 
	


	 public void onItemInicio(ActionEvent event) {
	   	 try {

	   		Node node = (Node) event.getSource();
		 	Stage stage = (Stage) node.getScene().getWindow();    		 
		 
		 	Parent parent = FXMLLoader.load(getClass().getResource("/gui/ViewMenu.fxml"));
			Scene scene = new Scene(parent);
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
