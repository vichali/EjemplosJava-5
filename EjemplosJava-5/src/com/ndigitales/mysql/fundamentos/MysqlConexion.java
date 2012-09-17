package com.ndigitales.mysql.fundamentos;
/* se importan las clases necesarias para establecer 
 * conexi�n a la DB y gestionar el driver (servidor, usr, psw)
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConexion {
   
	protected Connection conexion = null;
	
	
/*
 * Programa de prueba para conexi�n a una base de datos de MySQL.
 * Presupone que el servidor de base de datos est� iniciado, disponible,
 * en el puerto por defecto.
 * El usuario y password de conexi�n con la base de datos debe setearse de 
 * acuerdo a el usuario y clave de cada conexi�n en particular.
 */
  
  public void conectarDB() {
/* 
 * Para controlar posibles errores, se incluye el c�digo de conexi�n 
 * dentro de una sentencia try catch 	  
 */
	  
	  try {
/*
 * El uso de Class.forName() es opcional a partir de java 6 (JDBC 4.0) 
 * si el driver est� empaquetado como un servicio, la clase DriverManager
 * buscar� la implementaci�n correspondiente de la clase java.sql.Driver
 * en el CLASSPATH y realizar� la llamada al m�todo forName() de forma
 * implicita.
 * 
 */
	  Class.forName("com.mysql.jdbc.Driver");
	  
/*
 * Para conectar, es necesario asignar los par�metros 
 * correspondientes a:
 * "jdbc:motor://servidor/basededatos","usuario","clave"
 */
	  
	  conexion = 
		  DriverManager.
		  getConnection ("jdbc:mysql://localhost/stock","root", "");          
	            
	           System.out.println("Conexi�n Exitosa");
	            
	  }
      catch (Exception e)
      {
      	System.err.println("Error en la Base de Datos");
          e.printStackTrace();
      } // end Try
      
  } // end conectarDB
  
  
} // end class
