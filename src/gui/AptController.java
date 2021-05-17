package gui;

import java.io.IOException;
import java.lang.System.Logger;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;

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
	private TableColumn<Apartment, String> tableColumnRoom;
	@FXML
	private TableColumn<Apartment, String> tableColumnBathRoom;
	@FXML
	private TableColumn<Apartment, String> tableColumnGarage;
	@FXML
	private TableColumn<Apartment, String> tableColumnForRent;
	@FXML
	private TableColumn<Apartment, String> tableColumnObs;
	@FXML
	private Button available;
	@FXML
	private Button forRent;
	@FXML
	private ObservableList<Apartment> obsList;
	@FXML
	private void actionAvailable() {}
	@FXML
	public void setApartmentService(ApartmentService service) {
		this.service = service;
	}
	@FXML
	public void updateTableView() {
		if(service ==null) {
		throw new IllegalStateException("Service was null");
		}
		List<Apartment> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewApartment.setItems(obsList);
	}
	@FXML
	private void actionForRent(
			) {}


	 
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
		
		
		try  {
			Connection conn = (Connection) JdbcDAO.getConnection(); 
			
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM apartamentos");
			
			while(rs.next()) {
			obsList.add(new Apartment(rs.getInt("IdApartamento"), 
					rs.getInt("Quartos"),
					rs.getInt("banheiro"), 
					rs.getInt("VagaGaragem"),
					rs.getString("Alugado"), 
					rs.getString("OBS")));
			}
			tableViewApartment.setItems(obsList);
		}catch(SQLException ex) {
			
			
		}
		
			
	}
	private void initializeNode() {
		tableColumnApt.setCellValueFactory(new PropertyValueFactory<>("apt"));
		tableColumnRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
		tableColumnBathRoom.setCellValueFactory(new PropertyValueFactory<>("bathroom"));
		tableColumnGarage.setCellValueFactory(new PropertyValueFactory<>("garage"));
		tableColumnForRent.setCellValueFactory(new PropertyValueFactory<>("garage"));
		tableColumnObs.setCellValueFactory(new PropertyValueFactory<>("obs"));
		
	}
}
