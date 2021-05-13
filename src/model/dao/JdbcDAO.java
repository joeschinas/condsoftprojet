package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JdbcDAO {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8&useSSL=false";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "root";
    private static final String SELECT_QUERY = "SELECT * FROM usuario WHERE nickname = ? and senha = ?";
   
    private static Connection conn = null;
    
    public static Connection getConnection()  {
    	
			if (conn == null) {

			try {
				
					conn = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
				
			} catch (SQLException erro) {
				throw new DbException(erro.getMessage());

			}
				
		}
		return conn;
	}
    	
    
    public boolean validate(String nickname, String senha) throws SQLException {
    	/*System.out.println("NICK: " + nickname);
    	System.out.println("SENHA: " + senha);*/

        try (Connection connection = DriverManager
            .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setString(1, nickname);
            preparedStatement.setString(2, senha);

          //  System.out.println(preparedStatement);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }


        } catch (SQLException e) {
            // print SQL exception information
            printSQLException(e);
        }
        return false;
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
             /*  System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());**/
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
