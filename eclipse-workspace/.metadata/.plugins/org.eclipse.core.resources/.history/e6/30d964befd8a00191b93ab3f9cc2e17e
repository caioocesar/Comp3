import java.sql.*;

public class ConnectionFactory {
	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String URL = "jdbc:derby:C:\\Users\\caioc\\MyDB;create=true";
    private static final String USER = "admin";
    private static final String PASS = "2707";
    
    public Connection getConnection(){
        
        
        try {
        	DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            Class.forName(DRIVER);
            return java.sql.DriverManager.getConnection(URL);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conecção: ",ex);
        }}
	
}