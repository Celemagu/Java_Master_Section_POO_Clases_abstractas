package tarea24;

public class EjemploMamiferos {

	public static void main(String[] args) {
		
		Mamifero [] mamiferos = new Mamifero [5];
		
		Mamifero leon = new Leon (20, 120d, 2.5d, 160, "Selva", 1.5d, 2d, 500);
		Mamifero tigre = new Tigre ("Siberiano", 2.6d, 60, "Asia", 1.2d, 1.8d, 250);
		Mamifero guepardo = new Guepardo (2d, 130, "Africa", 1.4d, 2.1d, 400);
		Mamifero lobo = new Lobo(6, "Iberico", "Gris con negro", 3d, "Rusia", 1d, 0.8d, 150);
		Mamifero perro = new Perro (120, "Blanco y negro", 2d, "París", 1d,0.7d,50);
		
		mamiferos [0]= leon;
		mamiferos [1]= tigre;
		mamiferos [2]= guepardo;
		mamiferos [3]= lobo;
		mamiferos [4]= perro;
		
		
		for (Mamifero mam: mamiferos) {
			System.out.println("-----------------"+ mam.getClass().getSimpleName()+"-----------------" );
			System.out.println("Habitat: "+mam.getHabitat());
			System.out.println("Altura: "+ mam.getAltura());
			System.out.println("Largo: "+ mam.getLargo());
			System.out.println("Peso: "+ mam.getPeso());
			
			if (mam instanceof Felinos) {
				System.out.println("Garras: " + ((Felinos)mam).getTamanioGarras());
				System.out.println("Velocidad: " + ((Felinos)mam).getVelocidad());
				
				if (mam instanceof Leon) {
					System.out.println("Numero Manada: " + ((Leon)mam).getNumeroManada());
					System.out.println("Potencia Rugido: " + ((Leon)mam).getPotenciaRugido());
				}
				if (mam instanceof Tigre) {
					System.out.println("Especie: " + ((Tigre)mam).getEspecie());
				}
				
			}
			
			if (mam instanceof Caninos) {
				System.out.println("Colmillos: " + ((Caninos)mam).getTamanioColmillos());
				System.out.println("Color: " + ((Caninos)mam).getColor());
				
				if (mam instanceof Lobo) {
					System.out.println("Numero Camada: " + ((Lobo)mam).getNumeroCamada());
					System.out.println("Especie: " + ((Lobo)mam).getEspecie());
				}
				if (mam instanceof Tigre) {
					System.out.println("Fuerza mordida: " + ((Perro)mam).getFuerzaMordida());
				}
			}
			System.out.println(mam.comer());
			System.out.println(mam.correr());
			System.out.println(mam.dormir());
			System.out.println(mam.comunicarse());
		}
		
		
		

	}

}
