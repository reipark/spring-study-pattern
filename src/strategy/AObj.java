package strategy;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new Ainterfaceimpl();
	}
	
	// delegate
	public void funcAA() {
		ainterface.funcA();
		ainterface.funcA();
	}
}
