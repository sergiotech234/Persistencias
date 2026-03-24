import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521/xe";
        String usuario = "RIBERA";
        String contraseña = "ribera";


        try (Connection conn = DriverManager.getConnection(url,usuario,contraseña);
             Statement statement = conn.createStatement()){
            String sql="CREATE TABLE empleado2 ("+
                    "id NUMBER PRIMARY KEY, "+
                    "nombre VARCHAR2(100), "+
                    "salario NUMBER(10,2))";
            statement.executeUpdate(sql);
            System.out.println("Table empleado creada");

        }catch (SQLException e){
            System.out.println("Error al conectar"+ e.getMessage());
        }
    }
}