package team2;

import java.util.Scanner;
import team2.DBClass;

public class MainClass {
	public static void main(String[] args) {
		DBClass db = new DBClass();
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		Board bo = new Board();
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
				break;
			case 2: // �Խñ� ���
				System.out.println("�Խñ� ��ȣ �Է� : ");
				bo.setNum(input.nextInt());
				System.out.println("�ۼ��� �Է� : ");
				bo.setWriter(input.next());
				System.out.println("���� �Է� : ");
				bo.setTitle(input.next());
				System.out.println("���� �Է� : ");
				bo.setContent(input.next());
				
				db.saveBoard(bo);
				
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
