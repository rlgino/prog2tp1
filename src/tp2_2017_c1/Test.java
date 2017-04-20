package tp2_2017_c1;

public class Test {
	public static void main(String [] args){
		PPT.agregarElemento("Piedra");
		PPT.agregarElemento("Papel");
		PPT.agregarElemento("Tijera");

		PPT.agregarRegla("Piedra le gana a Tijera");
		PPT.agregarRegla("Papel le gana a Piedra");
		PPT.agregarRegla("Tijera le gana a Papel");
		System.out.println(PPT.jugar("Jugador 1 elije Piedra","Jugador 2 elije Tijera" ));
		System.out.println(PPT.jugar("Jugador 1 elije Piedra","Jugador 2 elije Papel" ));
	}
}
