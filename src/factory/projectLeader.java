package factory; 

public class projectLeader implements IEmpleados {

	@Override
	public void empleado(String name, int e_id, String email) {
		
		String e_name = name;
		int id = e_id;
		String e_email = email;
		
		System.out.println(e_name + "Es un lider de proyectos, con el id: + "+id + "Contacto: "+email);
		
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("El lider de proyectos esta trabajando");
	}




}
