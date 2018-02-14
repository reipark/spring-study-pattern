package adapter;

public class AdapterImpl implements Adapter {
	
	// Math math;

	@Override
	public Float twiceOf(Float f) {
		return (float) Math.twoTime(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		
		// 로그 추가 시 Math 에 찍으면 Math 의 함수를 호출 하는 모든 경우에 찍힘
		// 그러므로 구현체인 이곳에서 찍는 것이 옳다
		System.out.println("절반 함수 호출");
		
		return (float) Math.half(f.doubleValue());
	}

}
