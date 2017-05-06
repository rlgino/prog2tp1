package tp1_2017_c1;



public class Registro {

	Integer importe;
	Integer fecha;
	Integer fechaReal;

public Registro( Integer importe){
		
		this.importe = importe;
		// es importante que fechaReal sea null para el invariante
}

@Override
public String toString(){

	return "Fecha " + fecha +"; real:" + fechaReal + " imp:" + importe  ;
}


}
