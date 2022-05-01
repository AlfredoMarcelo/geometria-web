package modelo;

public class Circulo {

	private double diametro;
	
	
	public Circulo() {
	}

	
	
	public Circulo(double diametro) {
		this.diametro = diametro;
	}



	public double getDiametro() {
		return diametro;
	}



	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}


	
	public double calcularArea() {
		double pi = 3.14;
		double radio = diametro / 2;
		double resultadoArea = pi * Math.pow(radio, 2);
		return resultadoArea;
	}

	
	public double calcularPerimetro() {
		double pi = 3.14;
		double perimetro = pi * diametro; 
		return perimetro;
	}
}
