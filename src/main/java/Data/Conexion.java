package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conn;
    String url = "jdbc:oracle:thin:@//localhost:49673/orclXDB";
    String user = "ADMIN_TIENDA";
    String pwd = "admin1";
    
    public Conexion(){
    }
    
    public Connection getConnection(){
        try {
         //   DriverManager.deregisterDriver(new oracle.jdbc.OracleDriver());
            System.out.print("Conectando a la base de datos...");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.print("¡La conexión fue exitosa!");
        } catch(Exception e) {
            System.out.print("No se pudo conectar a la base de datos\n" + e.getMessage());
        }
        
        return conn;
    }
    
}
