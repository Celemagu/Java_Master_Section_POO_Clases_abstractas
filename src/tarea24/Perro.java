package tarea24;

public class Perro extends Caninos{
	
	protected  int fuerzaMordida;
	
	
	
	public Perro(int fuerzaMordida, String color, double tamanioColmillos, String habitat, double altura, double largo, double peso)	 {
		super(color, tamanioColmillos, habitat, altura, largo, peso);
		this.fuerzaMordida = fuerzaMordida;
	}
	
	

	public int getFuerzaMordida() {
		return fuerzaMordida;
	}



	@Override
	public String comer() {
		return "El perro se alimenta fundamentalmente de carne, es su mayor fuente de energía y de aportación de proteínas. Tiene una fuerte mordida de "+ fuerzaMordida +" psi";
		
	}

	@Override
	public String dormir() {
		return"El perro duerme hasta 14 horas al día";
		
	}

	@Override
	public String correr() {
		return"El perro puede correr levantando velocidades de hasta 50 km/h ";
		
	}

	@Override
	public String comunicarse() {
		return "Los perros usan hasta unas 30 señales diferentes. Las más comunes son realizar pequeños lamidos de trufa, mirar hacia otro lado, bostezar, olisquear el suelo, moverse lentamente, etc.";
		
	}

}
