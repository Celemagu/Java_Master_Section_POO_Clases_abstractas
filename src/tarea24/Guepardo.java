package tarea24;

public class Guepardo  extends Felinos{
	
	

	public Guepardo(double tamanioGarras, int velocidad, String habitat, double altura, double largo, double peso) {
		super(tamanioGarras, velocidad, habitat, altura, largo, peso);
	}

	@Override
	public String comer() {
		return "El guepardo puede consumir entre 150 y 300 presas al año";
		
	}

	@Override
	public String dormir() {
		return"El guepardo duerme hasta 16 horas al día";		
	}

	@Override
	public String correr() {
		return"El Guepardo puede correr levantando velocidades de hasta "+velocidad+" km/h ";
		
	}

	@Override
	public String comunicarse() {
		return	"el Guepardo puede comunicarse a través de un repertorio de vocalizaciones basadas en gruñidos y ronroneos"	;
	}

}
