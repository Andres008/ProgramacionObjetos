package pckRectangulo;

public class Rectangulo {

	public int base;
	public int altura;
	

	public int calcularPerimetro(int vBase, int vAltura) {
		return (2 * vBase) + (2 * vAltura);
	}

	public int calcularArea(int vBase, int vAltura) {
		return vBase * vAltura;
	}

	public void imprimirPerimetro() {
		System.out.println("Perimetro: "+ (  (2 * base) + (2 * altura) ));
	}

	public void imprimirArea() {
		System.out.println("Area: "+base * altura);
	}

}
