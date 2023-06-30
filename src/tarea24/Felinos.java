package tarea24;

abstract public class Felinos extends Mamifero{
	
	protected double tamanioGarras;
	protected int velocidad;
	

	public Felinos(double tamanioGarras, int velocidad, String habitat, double altura, double largo, double peso) {
		super(habitat,altura,largo, peso);
		this.tamanioGarras = tamanioGarras;
		this.velocidad = velocidad;
	}

	
	public double getTamanioGarras() {
		return tamanioGarras;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	
	
	

}
