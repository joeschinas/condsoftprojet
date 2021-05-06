package gui;

import java.io.IOException;
import java.sql.SQLException;

import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

import model.dao.impl.*;

public class LoginController {

    @FXML
    private TextField nicknameField;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Button submitButton;

    @FXML
   public void login(ActionEvent event) throws SQLException {

    	
     //  Window owner = submitButton.getScene().getWindow();

     //   System.out.println(nicknameField.getText());
      //  System.out.println(senhaField.getText());

        if (nicknameField.getText().isEmpty()) {
        	Alerts.showAlert("errors", null, "Pfvr entre com seu nickname", AlertType.ERROR);
           
            
        }
        if (senhaField.getText().isEmpty()) {
        	Alerts.showAlert("errors", null, "Pfvr entre com sua senha", AlertType.ERROR);
  
            
        }

        String nickname = nicknameField.getText();
        String senha = senhaField.getText();

        JdbcDAO jdbcDao = new JdbcDAO();
        boolean flag = jdbcDao.validate(nickname, senha);

        if (!flag) {
            Alerts.showAlert("Digite seu nickname e senha corretamente", null, null, AlertType.ERROR);
        } else {
        	
            infoBox(event);
       	 
        }
    }

    public void infoBox(ActionEvent event) {
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

  
}
}