package pckPersona;
public class Principal {

	public static void main(String[] args) {
		Persona objPersona;
		objPersona = new Persona();
		
		Persona objPersona2;
		objPersona2= new Persona();
		
		objPersona2.cedula="123456";
		objPersona.cedula="1003191044";
		System.out.println("Cédula: "+objPersona.cedula+"\t"+"Cédula2 : "+objPersona2.cedula);
		
	}

}
