package strategy;

public class Main {

	public static void main(String[] args) {
		Ainterface ainterface = new Ainterfaceimpl();
		
		// 통로
		ainterface.funcA();
		
		AObj aObj = new AObj();
		aObj.funcAA();
	}

}
