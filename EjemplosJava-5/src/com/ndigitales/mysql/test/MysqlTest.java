package com.ndigitales.mysql.test;

/*
 * Esta clase, invoca al método que se encuentra en otro paquete
 * Para ello, hacemos un import de la clase
 */

import com.ndigitales.mysql.fundamentos.MysqlConexion;


public class MysqlTest {

	public static void main(String[] args) {

		 MysqlConexion msc = new MysqlConexion();
		 msc.conectarDB();
	}

}
