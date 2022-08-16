package digital.innovation.Strategy.facede.subSystema2;

public class apiCep {
	
private static apiCep instancia = new apiCep();
	
	private apiCep() {
		
		super();
		
	}
	public static apiCep getInstancia() {
				
		 return instancia;
	}
	public String recuperarCidade(String cep) {
		// TODO Auto-generated method stub
		return null;
	}
	public String recuperarEstado(String cep) {
		// TODO Auto-generated method stub
		return null;
	}

}
