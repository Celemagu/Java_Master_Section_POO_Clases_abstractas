package tarea24;

public class Lobo extends Caninos{

	protected int numeroCamada;
	protected String especie;
	
	
	
	public Lobo(int numeroCamada, String especie, String color, double tamanioColmillos, String habitat, double altura, double largo, double peso) {
		super(color, tamanioColmillos, habitat, altura, largo, peso);
		this.numeroCamada = numeroCamada;
		this.especie = especie;
	}
	
	

	public int getNumeroCamada() {
		return numeroCamada;
	}



	public String getEspecie() {
		return especie;
	}



	@Override
	public String comer( ) {
		return "El Lobo " + color + " es carnivoro y se alimentan principalmente de ciervos, alces, ovejas, cabras, caribúes, bisontes, y muskox ";
		
	}

	@Override
	public String dormir() {
		return "El Lobo " + color + " duerme en las cavernas de " + habitat;
		
	}

	@Override
	public String correr( ) {
		return"El Lobo puede correr levantando velocidades de hasta 60 km/h ";
	}

	@Override
	public String comunicarse( ) {
		return "El lobo se comunica con una gran variedad de sonidos, desde ladridos y gruñidos, hasta el famoso aullido";
	}
	

}
