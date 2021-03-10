package team2;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {

			System.out.println("1. 게시글 전체 조회");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 검색");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 종료");
			System.out.print(">> ");
			int select = input.nextInt();
			
			switch(select) {
			case 1: // 게시글 전체 조회
				break;
			case 2: // 게시글 등록
				break;
			case 3: // 게시글 검색
				break;
			case 4: // 게시글 삭제
				break;
			case 5: // 종료
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}
}
