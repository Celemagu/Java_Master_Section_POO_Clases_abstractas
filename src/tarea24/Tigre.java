package tarea24;

public class Tigre extends Felinos{
	
	protected String especie;
	
	public Tigre(String especie, double tamanioGarras, int velocidad, String habitat, double altura, double largo, double peso) {
		super(tamanioGarras, velocidad, habitat, altura, largo, peso);
		this.especie = especie;
	}
	
	

	public String getEspecie() {
		return especie;
	}



	@Override
	public String comer() {
		return "El tigre "+especie+" puede consumir mas de 40 kg de carne de una vez";
		
	}

	@Override
	public String dormir() {
		return"El Tigre duerme hasta 16 horas al día";
	}

	@Override
	public String correr() {
		return "El tigre puede correr levantando velocidades de hasta "+velocidad+" km/h";
		
	}

	@Override
	public String comunicarse() {
		return "El tigre puede comunicarse a través de ronroneos y gruñido, tambien se comunica con señales olfativas y visuales";
		
	}
	
	

}
