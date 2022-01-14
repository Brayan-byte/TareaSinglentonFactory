package factory;

public class fabricaEmpleados{

	public IEmpleados getEmpleados(String TipoEmpleado) {

		if(TipoEmpleado.equalsIgnoreCase("projectLeader")) {
			return new projectLeader();
		}
		if(TipoEmpleado.equalsIgnoreCase("functionalAnalyst")){
			return new functionalAnalyst();
		}
		if(TipoEmpleado.equalsIgnoreCase("developer")){
			return new developer();
		}
		if(TipoEmpleado.equalsIgnoreCase("QA")){
			return new QA();
		}
		if(TipoEmpleado.equalsIgnoreCase("ERS")){
			return new ERS();
		}
		return new noEmpleado();
	}

}
