package kjh;


import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		DBClass db = new DBClass();
		Scanner input = new Scanner(System.in);
		int num;
		Board b = new Board();
		while(true) {
			System.out.println("1.게시판 2.글쓰기 3.선택 4.삭제");
			num = input.nextInt();
			switch(num) {
			case 1:db.getBoard(); break;
			case 2:
				System.out.print("글번호 입력 : ");
				b.setBoard_id(input.nextInt());
				System.out.print("작성자 입력 : ");
				b.setWriter(input.next());
				System.out.print("제목 입력 : ");
				b.setTitle(input.next());
				System.out.print("내용 입력 : ");
				b.setContent(input.next());
				
				db.insert(b); break;
			case 3:
				System.out.print("보고싶은 글번호 입력 : ");
				int board_id = input.nextInt();

				db.select(board_id);
				
				break;
			case 4:
				System.out.print("삭제하고싶은 글번호 입력 : ");
				int board_id2 = input.nextInt();
				db.delete(board_id2);
				
				break;
			}
		}
		
		
	}
}