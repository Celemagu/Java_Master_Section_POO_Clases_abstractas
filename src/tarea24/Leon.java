package tarea24;

public class Leon extends Felinos{
	
	
	protected int numeroManada;
	protected double potenciaRugido;
	
	
	
	public Leon(int numeroManada, double potenciaRugido,  double tamanioGarras, int velocidad,String habitat, double altura, double largo, double peso ) {
		super(tamanioGarras, velocidad, habitat, altura, largo, peso);
		this.numeroManada = numeroManada;
		this.potenciaRugido = potenciaRugido; 
	}
	
	
	
	public int getNumeroManada() {
		return numeroManada;
	}



	public double getPotenciaRugido() {
		return potenciaRugido;
	}



	@Override
	public String comer() {
		return"El león caza casi siempre en manada, en cantidades aproximadas de " + this.numeroManada+ " leones.";
		
	}

	@Override
	public String dormir() {
		return"El león duerme hasta 20 horas al día";
		
	}

	@Override
	public String correr() {
		return"El león puede correr a una velocidad de hasta "+velocidad+" km/h ";
		
	}

	@Override
	public String comunicarse() {
		return"El león se comunica a través de rugidos que alcanzan unos volumenes de mas de " + this.potenciaRugido + " db";
		
	}
	
	

}
