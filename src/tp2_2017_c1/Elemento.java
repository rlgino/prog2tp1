package tp2_2017_c1;

public class Elemento {

	String name;
	String leGanaA;

	public Elemento() {	}

	public Elemento(String elemento) {
		name = elemento;
	}

	//Getters y setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeGanaA() {
		return leGanaA;
	}

	public void setLeGanaA(String leGanaA) {
		this.leGanaA = leGanaA;
	}
}
