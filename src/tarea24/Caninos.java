package tarea24;

abstract public class Caninos extends Mamifero {
	
	protected String color;
	protected double tamanioColmillos;
	
	

	public Caninos(String color, double tamanioColmillos, String habitat, double altura, double largo, double peso) {
		super(habitat,altura,largo, peso);
		this.color = color;
		this.tamanioColmillos = tamanioColmillos;
	}

	public String getColor() {
		return color;
	}

	public double getTamanioColmillos() {
		return tamanioColmillos;
	}
	
	
	
	
}
