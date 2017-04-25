package tp3_2017_c1;

import java.util.ArrayList;
import java.util.List;

public class PPTLS {

	private static List<Elemento> elementos = new ArrayList<Elemento>();

	public static void agregarElemento(String elemento) {
		Elemento nuevoElemento = new Elemento(elemento);
		elementos.add(nuevoElemento);
	}

	public static void agregarRegla(String leGanaA) {
		Elemento seleccionado = extraerPrimerElemento(leGanaA);
		leGanaA = leGanaA.replace(seleccionado.getName(), "");
		seleccionado.agregarLeGanaA(extraerSegundoElemento(leGanaA));
	}

	private static String extraerSegundoElemento(String leGanaA) {
		for (Elemento e : elementos)
			if (leGanaA.indexOf(e.getName()) > -1) {
				leGanaA.replace(e.getName(), "");
				return e.getName();
			}
		return "";
	}

	private static Elemento extraerPrimerElemento(String leGanaA) {
		for (Elemento e : elementos)
			if (leGanaA.indexOf(e.getName()) > -1 && leGanaA.indexOf(e.getName()) == 0) {
				return e;
			}
		return new Elemento();
	}

	public static Integer jugar(String jug1, String jug2) {
		for (Elemento e : elementos){
			if(jug1.indexOf(e.getName()) == jug2.indexOf(e.getName())) return 0;
			if (jug1.indexOf(e.getName()) > -1) {
				for (String e1 : e.getLeGanaA()) {
					if (jug2.indexOf(e1) > -1)
						return 1;
				}
				return 2;
			}
		}
		return 0;
	}
}
