package factory;

public class ERS implements IEmpleados{

	@Override
	public void empleado(String name, int e_id, String email) {
		String e_name = name;
		int id = e_id;
		String e_email = email;
		
		System.out.println(e_name + "Es un ERS, con el id: + "+id + "Contacto: "+email);
	}

	@Override
	public void trabajar() {
		System.out.println("El ERS esta trabajando");
		
	}

}
