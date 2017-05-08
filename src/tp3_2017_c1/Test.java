package tp3_2017_c1;

public class Test {
	public static void main(String[] args) {

		Elemento piedra = new Elemento("piedra");
		Elemento papel = new Elemento("papel");
		Elemento tijera = new Elemento("tijera");
		
		Elemento piedraRoja = piedra.agregarParecido("Piedra Roja");

		PPTLS.agregarRegla(piedra, tijera);
		PPTLS.agregarRegla(papel, piedra);
		PPTLS.agregarRegla(tijera, papel);
		System.out.println(PPTLS.jugar(piedraRoja,tijera));
	}
}
