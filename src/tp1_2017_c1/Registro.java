package tp1_2017_c1;

public class Registro {
	int saldo;
	int distancia = 0;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia += distancia;
	}

	public Registro(int saldo) {
		super();
		this.saldo = saldo;
	}
}
