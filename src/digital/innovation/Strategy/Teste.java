package digital.innovation.Strategy;

import digital.innovation.Singleton.SingletonEgger;
import digital.innovation.Singleton.SingletonLazy;
import digital.innovation.Singleton.SingletonLazyHolder;

public class Teste {

	
	public static void main(String[] args) {
		// teste relacionados ao Designner  pattern Singeton:
		// TODO Auto-generated method stub
		SingletonLazy Lazy = SingletonLazy.getInstancia();
		System.out.println(Lazy);
		Lazy = SingletonLazy.getInstancia();
		System.out.println(Lazy);
		
		
		SingletonEgger eager = SingletonEgger.getInstancia();
		System.out.println(eager);
		eager = SingletonEgger.getInstancia();
		System.out.println(eager);
		
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		
		//strategy:
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormalzao();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		robo Robo = new robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		
	}

}
