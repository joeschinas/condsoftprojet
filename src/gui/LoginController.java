package gui;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import db.Db;
import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController implements Initializable{

	@FXML
	private Button buttonLogin;
	@FXML
	private TextField labelName;
	@FXML
	private PasswordField labelSenha;
	
	@FXML 
	private Label lblErrors;
	
	   	Connection conn = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	
	    public void LoginControll() {
	        conn = Db.getConnection();
	    }
	 @Override
	    public void initialize(URL url, ResourceBundle rb) {
	        // TODO
	        if (conn == null) {
	        	
	        	Alerts.showAlert("Error", "Fail Connection", "Verificar inicialização com banco", AlertType.ERROR);
	           
	        } else {
	        	
	            lblErrors.setTextFill(Color.GREEN);
	            lblErrors.setText("Server is up : Good to go");
	        }
	    }

	  private void setLblError(Color color, String text) {
	        lblErrors.setTextFill(color);
	        lblErrors.setText(text);
	        System.out.println(text);
	    }
}


