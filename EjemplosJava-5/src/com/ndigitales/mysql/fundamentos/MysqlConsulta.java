package com.ndigitales.mysql.fundamentos;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MysqlConsulta extends MysqlConexion {
	
  private Statement qry = null;
  private ResultSet rs = null;
  private String linea = "---------------------------------------------------------------";

	public void leerDB() {
	 try {
		 conectarDB();
// Se crea un Statement, para realizar la consulta
	 qry = conexion.createStatement();
// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
     rs = qry.executeQuery("SELECT codigo,detalle,marca FROM maestrostk;");
     ejecutarConsulta(rs);

	 } catch (Exception e) {
	 		System.err.println("Error en consulta");
	 		e.printStackTrace();
	} // end catch
   } // end leerDB
	
	
   public void ejecutarConsulta(ResultSet rs) throws SQLException {
	 System.out.printf("%-10s%-35s%-12s%n","CODIGO","DETALLE","MARCA");
	 System.out.printf("%"+(linea.length())+"s%n",linea);
	  
	while (rs.next())
     { System.out.printf ("%-10s%-35s%-12s%n", rs.getString("codigo"),
    		 rs.getString("detalle"),rs.getString("marca")) ;
     }
     conexion.close();
	}
	
	
} // end Class
