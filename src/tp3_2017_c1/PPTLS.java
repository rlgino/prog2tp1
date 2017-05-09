package tp3_2017_c1;

import java.util.HashSet;

public class PPTLS {
	// si no se conoce HashSet, utilizar arraylisty compararanlaexistenciaa mano
	// todo atributo debe ser private, para no violar encapsulamiento
	private HashSet<Elemento> elementos;

	public PPTLS() {
		elementos = new HashSet<Elemento>();
	}

	public void agregarElemento(String obj) {
		elementos.add(new Elemento(obj));
	}

	// elemento1 leganaa elemento2
	// interfaz parausuario, que no sabe como crear un elemento
	
	public void agregarRegla(String elemento1, String elemento2) {
		Elemento elemTmp1 = getElemento(elemento1);
		Elemento elemTmp2 = getElemento(elemento2);
		elemTmp1.leGanaA(elemTmp2);
		//Agrego que los elementos hijos del primer elemento le ganen al elemento nro 2
		for(Elemento ele : elemTmp1.getParecidos()){
			getElemento(ele.nombre).leGanaA(elemTmp2);
			ele.leGanaA(elemTmp2);
		}
		//Agrego que el elemento 1 le gane a todos los hijos del segundo elemento
		for(Elemento ele2 : elemTmp2.getParecidos()){
			elemTmp1.leGanaA(ele2);
		}
		//Agrego que los hijos del primer elemento le ganen a los hijos del 2do elemento
		for(Elemento ele : elemTmp1.getParecidos()){
			for(Elemento ele2 : elemTmp2.getParecidos()){
				getElemento(ele.nombre).leGanaA(elemTmp2);
				ele.leGanaA(ele2);
			}
		}
	}

	// desicion dediseño, resuelvo la impedancia entre String y Elemento aca
	private Elemento getElemento(String obj) {
		Elemento tmp = null;
		for (Elemento elemTmp1 : elementos) {
			if (elemTmp1.nombre.equalsIgnoreCase(obj)) {
				tmp = elemTmp1;
			}
		}
		return tmp;
	}

	public String jugar(String elemento1, String elemento2) {
		Elemento elemTmp1 = getElemento(elemento1);
		Elemento elemTmp2 = getElemento(elemento2);

		/*
		 * Posibilidades: esto se decide en el invariante a) o1 > o2: gana o1 b)
		 * o1 < o2: gana o1 c) !(o1 > o2) and !(o1 < o2): tiro una exepcion d)
		 * (o1 > o2) and (o1 < o2): tiro una exepcion
		 */
		if (elemTmp1.existe(elemTmp2)) {// o1 > o2
			
			if (elemTmp2.existe(elemTmp1))// o2 > o1
										//error
				throw new RuntimeException("o1 > o2 and o2 > o1");
			else// ganao1
				return elemento1 + " > " + elemento2;
		} else {
			if (elemTmp2.existe(elemTmp1))// o2 > o1//ganao2
				return elemento1 + " < " + elemento2;
			else
				throw new RuntimeException("!(o1 > o2) and !(o2 > o1)");
		}
	}

	public void agregarElementoParecido(String padre, String hijo) {
		Elemento elemTemp = getElemento(padre);
		Elemento elemHijo = new Elemento(hijo);
		elemTemp.agregarParecido(elemHijo);
		elementos.add(elemHijo);
	}

}
