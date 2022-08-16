package digital.innovation.Singleton;

/**
 * singleton "apressado".
 * 
 * @author estudos-t.i
 
 */


	
	public class SingletonLazyHolder {
		
		
		private static  class InstanceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
		}
		
		private SingletonLazyHolder() {
			
			super();
			
		}
		public static SingletonLazyHolder getInstancia() {
			return InstanceHolder.instancia;
			
			
		}
	}



