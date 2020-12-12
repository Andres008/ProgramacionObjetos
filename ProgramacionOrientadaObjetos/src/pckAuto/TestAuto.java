package pckAuto;
public class TestAuto {

	public static void main(String[] args) {
		Auto objAuto = new Auto();
		objAuto.setAnio(2010);
		objAuto.setMarca("KIA");
		objAuto.setPrecio(1500);
		System.out.println(objAuto.toString());
		
		
		Auto objAuto2 = new Auto("Kia", 7000, 2003);
		System.out.println(objAuto2.toString());
		
		Auto objAuto3 = new Auto("FOTON");
		System.out.println(objAuto3.toString());
	}

}
