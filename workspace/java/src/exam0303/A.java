package exam0303;

public class A implements IA {

	@Override
	public void memSave() {
		System.out.println("회원저장기능");
	}

	@Override
	public void memShow() {
		System.out.println("회원 수 출력");
	}

}
