package tarea24;

abstract public class Mamifero {
	protected String habitat;
	protected double altura;
	protected double largo;
	protected double peso;
	protected String nombreCientifico;
	
		
			
	 public Mamifero(String habitat, double altura, double largo, double peso) {
	        this.habitat = habitat;
	        this.altura = altura;
	        this.largo = largo;
	        this.peso = peso;
	    }



	public String getHabitat() {
		return habitat;
	}
	
	public Mamifero() {
    }
	public double getAltura() {
		return altura;
	}
	public double getLargo() {
		return largo;
	}
	public double getPeso() {
		return peso;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	
	abstract public String comer ();	
	abstract public String dormir ();	
	abstract public String correr ();	
	abstract public String comunicarse ();	
	
}
