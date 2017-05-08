package tp3_2017_c1;

import java.util.ArrayList;
import java.util.List;

public class Elemento {

	String name;
	List<Elemento> parecido = new ArrayList<Elemento>();
	
	

	public List<Elemento> getParecidos() {
		return parecido;
	}

	public void addParecido(Elemento parecido) {
		this.parecido.add(parecido);
	}

	public Elemento(String elemento) {
		name = elemento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Elemento agregarParecido(String nombre) {
		Elemento elemento = new Elemento(nombre);
		addParecido(elemento);
		return elemento;
	}
}
