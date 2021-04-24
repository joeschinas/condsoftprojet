package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{

	@FXML
	private Button buttonLogin;
	@FXML
	private TextField labelName;
	@FXML
	private TextField labelSenha;
	@FXML
	public void onMyButtonClick() {
		Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.INFORMATION);
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldMaxLength(labelSenha, 10);
		
	}
	
}
