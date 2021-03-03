package exam0303;

public class B implements IB {

	@Override
	public void monthShow() {
		System.out.println("이달의 이벤트 보기");
	}

	@Override
	public void allShow() {
		System.out.println("전체 이벤트 보기");
	}

}
