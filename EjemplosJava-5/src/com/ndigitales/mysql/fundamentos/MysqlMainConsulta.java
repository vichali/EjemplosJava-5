package com.ndigitales.mysql.fundamentos;

public class MysqlMainConsulta {

	public static void main(String[] args) {

		MysqlConsulta myConsulta = new MysqlConsulta();
		myConsulta.conectarDB();
		myConsulta.leerDB();
		
		
	}

}
