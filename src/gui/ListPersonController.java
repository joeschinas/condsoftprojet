package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import model.entities.Person;

public class ListPersonController implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson;	
	@FXML
	private MenuItem menuItemInicio;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void onItemInicio(ActionEvent event) {
	   	 
   		try {
   		
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
}
