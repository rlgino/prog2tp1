package tp3_2017_c1;

import java.util.ArrayList;

public class Elemento {
	String nombre;
	private ArrayList<Elemento> leGanaA;
	private ArrayList<Elemento> parecidos;

	public Elemento(String nombre){
		this.nombre= nombre;
		leGanaA= new ArrayList<Elemento>();
		parecidos = new ArrayList<Elemento>();
	}

	public void leGanaA(Elemento elem) {// se hace la comparacion a mano
		if (!existe(elem))
			leGanaA.add(elem);
	}

	public boolean existe(Elemento elem) {
		boolean ret = false;
		for (Elemento elem2 : leGanaA) {
			if (elem2.nombre.equals(elem.nombre))
				ret = true;
		}
		return ret;
	}
	
	public void agregarParecido(Elemento elemento){
		parecidos.add(elemento);
	}

}