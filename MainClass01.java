package team2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {

			System.out.println("1. �Խñ� ��ü ��ȸ");
			System.out.println("2. �Խñ� ���");
			System.out.println("3. �Խñ� �˻�");
			System.out.println("4. �Խñ� ����");
			System.out.println("5. ����");
			System.out.print(">> ");
			int select = input.nextInt();
			
			switch(select) {
			case 1: // �Խñ� ��ü ��ȸ
				DBClass db = new DBClass();
				List<Board> boardList = new ArrayList<>();
				
				boardList = db.getBoard();
				for(Board list : boardList) { 
					System.out.println("�۹�ȣ : " + list.getNum());
					System.out.println("���� : " + list.getTitle());
					System.out.println("�ۼ��� : " + list.getWriter());
					System.out.println("���� : " + list.getContent());
				}
				break;
			case 2: // �Խñ� ���
				break;
			case 3: // �Խñ� �˻�
				break;
			case 4: // �Խñ� ����
				break;
			case 5: // ����
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		
	}
}
