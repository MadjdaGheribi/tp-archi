import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static Connection conn;

	   
	    private DBConnection() {
	        try {
	            Connection conn =DriverManager.getConnection(url, user,passwd);
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	    }
	    
	    
	    
	    public static Connection getInstance() {
	        if(conn == null) {
	            new DBConnection();
	        }
	        return conn;
	    }

	    
	    //public DBConnection() throws SQLException {
		//	conn=DriverManager.getConnection(url, user,passwd);
		//}

	    
	   // public Connection getConn() {
			//return conn;
		//}
	    
	    
	    
}
