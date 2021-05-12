package gui;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.Window;

import model.dao.impl.*;

public class LoginController implements Initializable {

	

	ObservableList<String> userList = FXCollections.observableArrayList();
	
    @FXML
    private TextField nicknameField;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Button submitButton;
    
    @FXML
    private Label lblErrors;
    
    @FXML 
    private ChoiceBox<String> combBoxlist;
  
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choiceStatus();

	}

	@FXML
	private void choiceStatus() {
		userList.removeAll(userList);
		String a = null;
		String b = "Admin";
		String c = "Usuario";
		userList.addAll(a, b,c);
		combBoxlist.getItems().addAll(userList);
		

	}
	
    
    
    @FXML
    public void login(ActionEvent event) throws SQLException {

      /* Window owner = submitButton.getScene().getWindow();

        System.out.println(nicknameField.getText());
        System.out.println(senhaField.getText());*/
    	
    	String nulo = combBoxlist.getValue();
    	
        if (nicknameField.getText().isEmpty()) {
        	setLblError(Color.TOMATO, "Por favor inserir Usuario.");
            return;
        }
         if  (senhaField.getText().isEmpty()) {
           setLblError(Color.TOMATO, "Por favor Inserir Senha.");
            return;
        }
         
         if  (nulo==null) {
        	setLblError(Color.TOMATO, "Selecione uma das Opções");
        	return;
        	
        	
        }
       
        	
        	
        String nickname = nicknameField.getText();
        String senha = senhaField.getText();

        JdbcDAO jdbcDao = new JdbcDAO();
        boolean flag = jdbcDao.validate(nickname, senha);

        if (!flag) {
        	
            setLblError(Color.TOMATO, "Digite Usuario e senha corretamente.");
        } 
        infoBox(event);
        
    }

    public void infoBox (ActionEvent event) {
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
    

    private void setLblError(Color color, String text) {
        lblErrors.setTextFill(color);
        lblErrors.setText(text);
       // System.out.println(text);
    }




	






	
}


