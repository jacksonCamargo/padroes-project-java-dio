package digital.innovation.Strategy.facede;

import digital.innovation.Strategy.facede.subSystema.CRMservice1;
import digital.innovation.Strategy.facede.subSystema2.apiCep;

public class Facede {
	
	public void MigrandoCliente(String nome, String cep) {
		
	String cidade =	apiCep.getInstancia().recuperarCidade(cep);
	String estado =	apiCep.getInstancia().recuperarEstado(cep);
	
		CRMservice1.gravarCliente(nome, cep , cidade , estado);
		
	}

}
