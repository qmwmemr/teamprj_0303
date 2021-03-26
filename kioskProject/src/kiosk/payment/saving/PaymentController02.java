package kiosk.payment.saving;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import kiosk.payment.PaymentMain01;
import kiosk.payment.common.CommonClass;
import kiosk.payment.common.CommonService;
import kiosk.payment.saving.paying.PaymentMain03;

public class PaymentController02 implements Initializable {
	@FXML TextField textPhone;
	Parent root;
	CommonService cs;
	MyDB db;
	PaymentMain01 pm01;
	PaymentMain03 pm03;
	Stage primaryStage;

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void btn1() {textPhone.appendText("1");}

	public void btn2() {textPhone.appendText("2");}

	public void btn3() {textPhone.appendText("3");}

	public void btn4() {textPhone.appendText("4");}

	public void btn5() {textPhone.appendText("5");}

	public void btn6() {textPhone.appendText("6");}

	public void btn7() {textPhone.appendText("7");}

	public void btn8() {textPhone.appendText("8");}

	public void btn9() {textPhone.appendText("9");}
	
	public void btn0() {textPhone.appendText("0");}

	public void btnIdentify() { 
		System.out.println("�ڵ�����ȣ : " + textPhone.getText());
		
		if (textPhone.getText() == null || textPhone.getText().isEmpty() == true) {
			textPhone.requestFocus();
			cs.alert("�ڵ��� ��ȣ�� �Է����ּ���");			
		} else {
			if(db.phoneNumber.contains(textPhone.getText())) {
				cs.alert("�����Ǿ����ϴ�");
				System.out.println("�����Ǿ����ϴ�");
			}
			else {
				cs.alert("�������� �ʴ� ��ȣ�Դϴ�");
				System.out.println("�������� ���� ��ȣ�Դϴ�");
			}
		}
	}

	public void btnModify() { 
		String str = textPhone.getText();
		str = str.substring(0, str.length()-1);
		textPhone.setText(str);
		//System.out.println(str);
	}
	
	public void btnFormer(){ 
		cs.exit(root);
		System.out.println("�������� ���ư���");
		// pm01.start(primaryStage); // ���� â���� ���ư��� �ڵ� �����ϱ�
		}
	
	public void btnNext() {
		pm03.setPayingStage();
		System.out.println("���� ���� â ����");
		cs.exit(root);
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cs = new CommonClass();
		db = new MyDB();
		pm01 = new PaymentMain01();
		pm03 = new PaymentMain03();
		
	}

}
