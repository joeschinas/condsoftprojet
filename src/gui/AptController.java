package gui;

import java.io.IOException;
import java.lang.System.Logger;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;

import gui.util.Alerts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.dao.JdbcDAO;
import model.entities.Apartment;
import model.service.ApartmentService;


public class AptController implements Initializable {
	
	@FXML
	private ApartmentService service;
	@FXML
	private MenuItem menuItemInicio;
	
	@FXML 
	private TableView<Apartment> tableViewApartment;
	
	@FXML
	private TableColumn<Apartment, Integer> tableColumnApt;
	@FXML
	private TableColumn<Apartment, Integer> tableColumnRoom;
	@FXML
	private TableColumn<Apartment, Integer> tableColumnBathRoom;
	@FXML
	private TableColumn<Apartment, Integer> tableColumnGarage;
	@FXML
	private TableColumn<Apartment, String> tableColumnForRent;
	@FXML
	private TableColumn<Apartment, String> tableColumnObs;
	@FXML
	private Button available;
	@FXML
	private Button forRent;
	
	ObservableList<Apartment> obsList = FXCollections.observableArrayList();;

	/*@FXML
	/*private void actionAvailable() {}	@FXML
	
	public void setApartmentService(ApartmentService service) {
		this.service = service;
	}*/
	/*@FXML
	public void updateTableView() {
		if(service ==null) {
		throw new IllegalStateException("Service was null");
		}
		List<Apartment>obsList = FXCollections.observableArrayList(list);
		tableViewApartment.setItems(obsList);
	}*/
	
	


	 
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
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		 ObservableList<Apartment> obsList = FXCollections.observableArrayList();;
		try  {
			
			
			Connection conn = (Connection) JdbcDAO.getConnection(); 
			
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM apartamentos");
			
			while(rs.next()) {
			obsList.add(new Apartment
					(rs.getInt("IdApartamento"), 
					rs.getInt("Quartos"),
					rs.getInt("banheiro"), 
					rs.getInt("VagaGaragem"),
					rs.getString("Alugado"), 
					rs.getString("OBS")));
			}
			
		}catch(SQLException ex) {
			
			Alerts.showAlert(null, "Erro", "Erros banco", null);
		}				
		
		tableColumnApt.setCellValueFactory(new PropertyValueFactory<>("Apt"));
		tableColumnRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
		tableColumnBathRoom.setCellValueFactory(new PropertyValueFactory<>("bathroom"));
		tableColumnGarage.setCellValueFactory(new PropertyValueFactory<>("garage"));
		tableColumnForRent.setCellValueFactory(new PropertyValueFactory<>("forRent"));
		tableColumnObs.setCellValueFactory(new PropertyValueFactory<>("obs"));
		tableViewApartment.setItems(obsList);
	}
	
}
