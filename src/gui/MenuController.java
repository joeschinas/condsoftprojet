package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.service.ApartmentService;

public class MenuController implements Initializable{
	//private static final String  = null;

	@FXML
	private AnchorPane root_AnchorPane;

	@FXML
	private Button Apartamento;
	@FXML
	private Button listTenant;
	@FXML
	private Button Register;
	@FXML
	private MenuBar Options;

	@FXML
	private MenuItem menuItemAbout;

	@FXML
	private void menuItemAbout() {
		menuItemAbout.setOnAction(action -> {
			Alerts.showAlert("1", "2", "escorpo do alerta ", AlertType.INFORMATION);
			return;
		});

	}

	@FXML
	private MenuItem menuItemExit;

	@FXML
	private void menuItemExit() {
	    
		menuItemExit.setOnAction(actionEvent -> System.exit(0));

	    return;
	}
		
	
	@FXML
    public void Apartment(ActionEvent event) {
   	 try {

   		Stage stage = null;
	     Parent myNewScene = null;
	     stage = (Stage) Register.getScene().getWindow();
	     myNewScene = FXMLLoader.load(getClass().getResource("/gui/ViewCheckOnApt.fxml"));
       
        Scene scene = new Scene(myNewScene);
        stage.setScene(scene);
        stage.setTitle("Lista de Apartamentos");
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
    @FXML
	public void ListPerson(ActionEvent event) {

		try {

			Stage stage = null;
			Parent myNewScene = null;
			stage = (Stage) listTenant.getScene().getWindow();
			myNewScene = FXMLLoader.load(getClass().getResource("/gui/ViewCheckOnTenant.fxml"));

			Scene scene = new Scene(myNewScene);
			stage.setScene(scene);
			stage.setTitle("Lista de inquilinos");
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
	
	
}
