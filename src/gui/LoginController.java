package gui;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.mysql.jdbc.Connection;

import db.Db;
import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	@FXML
    private Label setlblErrors;
	@FXML
	private Button buttonLogin;
	@FXML
	private TextField labelName;
	@FXML
	private PasswordField labelSenha;

		Db conn = new Db();
	 	Connection con = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	
	public LoginController() {
	
		conn.getConnection();
	}

	@FXML
    public void handleButtonAction(MouseEvent event) {

        if (event.getSource() == buttonLogin) {
            //login here
            if (logIn().equals("Success")) {
                try {

                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/ViewMenu.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException e) {
                    Alerts.showAlert("Error","Check",e.getMessage(),AlertType.INFORMATION);
                }
            	}
        		}
        }
	// we gonna use string to check for status
                
	private String logIn() {
	
									String status = "Success";
									String nickName = labelName.getText();
									String senha = labelSenha.getText();
							
							if (nickName.isEmpty() || senha.isEmpty()) {
			
						
									Alerts.showAlert("Error", null, "Empty credentials", null);
									status = "Error";
							}else {
								String sql ="SELECT * FROM admins Where usuario ='?' and senha = '?'";
							try {
									
								 preparedStatement = con.prepareStatement(sql);
					                preparedStatement.setString(1, nickName);
					                preparedStatement.setString(2, senha);
					                resultSet = preparedStatement.executeQuery();
					                if (!resultSet.next()) {
			                		setLblError(Color.TOMATO, "Enter Correct Email/Password");
			                    	status = "Error";
			                } else {
			                	setLblError(Color.GREEN, "Login Successful..Redirecting..");
			                }
							} catch (SQLException ex) {
			                System.err.println(ex.getMessage());
			                status = "Exception";
			            }
						
					}  
		return status;
	
	}

        

	 @Override
	    public void initialize(URL url, ResourceBundle rb) {
	        // TODO
	        if (conn == null) {
	            setlblErrors.setTextFill(Color.TOMATO);
	            setlblErrors.setText("Server Error : Check");
	        } else {
	            setlblErrors.setTextFill(Color.GREEN);
	            setlblErrors.setText("Server is up : Good to go");
	        }
	    }
	
	
	 private void setLblError(Color color, String text) {
	        setlblErrors.setTextFill(color);
	        setlblErrors.setText(text);
	        System.out.println(text);
	    }
}
	