package actividadExtra01.ejercicio02.entity;

public class Figura {

	private String tipo;
	private double area;
	private double perimetro;


	public Figura() {
	}


	public Figura(String tipo) {
		this.tipo = tipo;
	}



	public String getTipo() {
		return tipo;
	}
	public
	void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Figura{" +
				 "tipo='" + tipo + '\'' +
				 ", area=" + area +
				 ", perimetro=" + perimetro +
				 '}';
	}

}
