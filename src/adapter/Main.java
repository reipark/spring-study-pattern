package adapter;

public class Main {

	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		
		float _a = (float) 3.0;
		System.out.println(adapter.twiceOf(_a));
		System.out.println(adapter.halfOf(50f));
	}

}
