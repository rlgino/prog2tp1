package tp3_2017_c1;

import java.util.ArrayList;
import java.util.List;

public class Regla {
	Elemento elemento;
	List<Elemento> leGanaA = new ArrayList<Elemento>();
	
	public Regla(Elemento elemento, Elemento leGanaA) {
		this.elemento = elemento;
		this.leGanaA.add(leGanaA);
	}
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	public List<Elemento> getLeGanaA() {
		return leGanaA;
	}
	public void setLeGanaA(List<Elemento> leGanaA) {
		this.leGanaA = leGanaA;
	}
	public Boolean buscarElemento(Elemento elemento) {
		for(Elemento e : getLeGanaA()){
			if(e.equals(elemento)) return true;
			if(e.getParecidos().contains(elemento)) return true;
		}
		return false;
	}
}
