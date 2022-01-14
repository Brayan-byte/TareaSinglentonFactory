package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection{

	private static connection instancia; 
	private String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "system";
	private String password = "032296";
	private String GUID = ""; 
	private connection() {

	}
	
	public static connection getInstancia() {
		if(instancia == null) {

			instancia = new connection();
		}
		return instancia;
	}


public void conectar() {

	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection myConn = DriverManager.getConnection(URL,user,password); 
	Statement stmt=myConn.createStatement();  
	System.out.println("Conexion Realizada");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}


}