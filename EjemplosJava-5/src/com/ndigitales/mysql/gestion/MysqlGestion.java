package com.ndigitales.mysql.gestion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.ndigitales.mysql.fundamentos.MysqlConexionOtra;

/**
 * @author Victor
 * @see MysqlConexion
 * @throws SQLException
 * Detalle: Toma los datos que el usuario ingresa para almacenarlos en la DB
 */

public class MysqlGestion extends MysqlConexionOtra {

	Scanner ing = new Scanner(System.in);
	private String nombreEmpresa, telEmpresa, consulta;
	private PreparedStatement query = null;
	  
	public void tomaDatos() {
		System.out.println("Ingreso de Datos de la Empresa");
		System.out.println("------------------------------");
		System.out.print("Nombre : ");
		nombreEmpresa = ing.nextLine();
		System.out.print("Teléfono : ");
		telEmpresa = ing.nextLine();
		try {
			guardarDatos(nombreEmpresa,telEmpresa);
		} catch (SQLException y) {
			System.err.println("Error ingresando datos");
			y.printStackTrace();
		}
		
	} // end tomaDatos

	
// incluir documentacion
	
	public void guardarDatos(String empresa, String telefono) throws SQLException {
		conectar_a_la_DB();
		consulta = "INSERT INTO empresas VALUES (null, ? , ? );";
		 query = conectar.prepareStatement(consulta);
		 query.setString(1, empresa);
		 query.setString(2, telefono);
		 query.executeUpdate();
		 System.out.println();
		 System.out.println("Los datos fueron ingresados");
	} //end guardarDatos
	
} // end Class
