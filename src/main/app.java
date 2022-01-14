package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import connection.connection;
import factory.IEmpleados;
import factory.fabricaEmpleados;

public class app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id;
		String Name;
		String email;
		
		System.out.println("Para seleccionar que programa usar ingrese:\n"
				+ "1- Singleton\n"
				+ "2- Factory");
		int option = sc.nextInt();
		if(option == 1) {
			connection c = connection.getInstancia();
			connection c1 = connection.getInstancia();
			c1.conectar();
		}
		if(option == 2) {
			System.out.println("Que tipo de empleado quieres crear:"
					+ "1- Project Leader\n"
					+ "2- Functional Analyst\n"
					+ "3- Developer\n"
					+ "4- QA\n"
					+ "5- ERS");
			int optionEmpleado = sc.nextInt();
			fabricaEmpleados fabrica = new fabricaEmpleados();
			IEmpleados empleado = null;
			if(optionEmpleado == 1) {
				empleado = fabrica.getEmpleados("projectLeader");
				System.out.println("Ingresa los siguientes campos:");
				System.out.println("1- Nombre");
				Name = sc.next();
				System.out.println("2- Id");
				id = sc.nextInt();
				System.out.println("3- Email");
				email = sc.next();
				
				empleado.empleado(Name,id,email);
			}
			
		}
		else {
			System.out.println("Opcion invalida");
		}
		
	}

}
