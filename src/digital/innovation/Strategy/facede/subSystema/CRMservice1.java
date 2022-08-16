package digital.innovation.Strategy.facede.subSystema;

public class CRMservice1 {
	
	private CRMservice1() {
		super();
	}
	
	public static void  gravarCliente(String nome, String cep, String cidade, String estado) {
	System.out.println("Cliente salvo no sistema CRM com sucesso !!");
	
	System.out.println(nome);
	System.out.println(cidade);
	System.out.println(estado);
	System.out.println(cep);
	
	}
	
	

}
