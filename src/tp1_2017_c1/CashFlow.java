package tp1_2017_c1;

import java.util.ArrayList;
import java.util.List;

public class CashFlow {
	List<Registro> registros = new ArrayList<Registro>();
	int saldo;

	public CashFlow() {
		super();
		saldo = 0;
	}

	public void agregarRegistro(Registro registro) {
		registros.add(registro);
		saldo += registro.getSaldo();
	}

	public void forzarInvariante() {
		if(saldo < 0) throw new RuntimeException();
		
		int saldoR = 0;
		for(int x = 0; x < registros.size(); x++){
			
			if(saldoR + registros.get(x).getSaldo() < 0){
				int y;
				for(y = x+1 ; registros.get(y).getSaldo() < 0 ; y++){}
				
				final Registro registroN = registros.get(y);
				registroN.setDistancia(y-x);
				registros.get(x).setDistancia(y-x);
				registros.set(y, registros.get(x));
				registros.set(x, registroN);
			}
			saldoR += registros.get(x).getSaldo();
		}
	}
	
	@Override
	public String toString(){
		String cad = "";
		for(final Registro registro : registros)
			cad += registro.getSaldo() + " " + registro.getDistancia();
		return cad;
	}
}
