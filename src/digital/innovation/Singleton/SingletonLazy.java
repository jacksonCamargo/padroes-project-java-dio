package digital.innovation.Singleton;

/**
 * singleton "pregui�oso".
 * 
 * @author estudos-t.i
 
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		
		super();
		
	}
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new  SingletonLazy();
		}
		 return instancia;
	}
}
