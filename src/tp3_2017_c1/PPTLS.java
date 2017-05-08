package tp3_2017_c1;

import java.util.ArrayList;
import java.util.List;

public class PPTLS {

	private static List<Elemento> elementos = new ArrayList<Elemento>();
	private static List<Regla> reglas = new ArrayList<Regla>();

	public static Elemento agregarElemento(String nombre) {
		Elemento elemento = new Elemento(nombre);
		return elemento;
	}

	public static void agregarRegla(Elemento elemento, Elemento leGanaA) {
		Regla r = new Regla(elemento, leGanaA);
		elementos.add(elemento);
		reglas.add(r);
	}

	public static Integer jugar(Elemento jug1, Elemento jug2) {
		
		if(jug1.equals(jug2)) return 0;
		
		for(Regla r : reglas){
			if(r.getElemento().equals(jug1) || r.getElemento().getParecidos().contains(jug1)){
				if(r.buscarElemento(jug2))
					return 1;
			}
		}
		return 2;
	}
}
