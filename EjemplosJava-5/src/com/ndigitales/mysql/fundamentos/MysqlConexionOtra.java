package com.ndigitales.mysql.fundamentos;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConexionOtra {

	protected Connection conectar = null;
  
  public void conectar_a_la_DB() {
	  try {
	  Class.forName("com.mysql.jdbc.Driver");
	  conectar = DriverManager.getConnection ("jdbc:mysql://localhost/software","root", "");          
	  }	
      catch (Exception e)
      {
      	System.err.println("Error en la Base de Datos");
          e.printStackTrace();
      } // end Try
 }
  
} // end Class
