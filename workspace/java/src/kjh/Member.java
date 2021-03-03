package kjh;

public class Member implements IMember {

	@Override
	public void create() {
		System.out.println("회원정보를 생성합니다");
	}

	@Override
	public void read() {
		System.out.println("회원정보를 읽습니다");

	}

	@Override
	public void update() {
		System.out.println("회원정보를 수정합니다");

	}

	@Override
	public void delete() {
		System.out.println("회원정보를 삭제합니다");

	}

}
