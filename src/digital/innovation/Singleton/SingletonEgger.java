package digital.innovation.Singleton;

/**
 * singleton "apressado".
 * 
 * @author estudos-t.i
 
 */

public class SingletonEgger {
	
	private static SingletonEgger instancia = new SingletonEgger();
	
	private SingletonEgger() {
		
		super();
		
	}
	public static SingletonEgger getInstancia() {
				
		 return instancia;
	}
}
