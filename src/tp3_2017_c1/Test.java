package tp3_2017_c1;

public class Test {
	public static void main(String [] args){
		PPTLS.agregarElemento("Piedra");
		PPTLS.agregarElemento("Papel");
		PPTLS.agregarElemento("Tijera");

		PPTLS.agregarRegla("Piedra le gana a Tijera");
		PPTLS.agregarRegla("Papel le gana a Piedra");
		PPTLS.agregarRegla("Tijera le gana a Papel");
		System.out.println(PPTLS.jugar("Jugador 1 elije Piedra","Jugador 2 elije Tijera" ));
		System.out.println(PPTLS.jugar("Jugador 1 elije Piedra","Jugador 2 elije Piedra" ));
	}
}
