package tp3_2017_c1;

import java.util.ArrayList;
import java.util.List;

public class Elemento {

	public List<String> getLeGanaA() {
		return leGanaA;
	}

	String name;
	List<String> leGanaA = new ArrayList<String>();

	public Elemento(String elemento) {
		name = elemento;
	}

	public Elemento() {	}

	public void agregarLeGanaA(String elemento) {
		leGanaA.add(elemento);
	}

	//Getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
