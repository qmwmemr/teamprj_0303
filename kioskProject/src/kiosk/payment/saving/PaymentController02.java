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
		System.out.println("핸드폰번호 : " + textPhone.getText());
		
		if (textPhone.getText() == null || textPhone.getText().isEmpty() == true) {
			textPhone.requestFocus();
			cs.alert("핸드폰 번호를 입력해주세요");			
		} else {
			if(db.phoneNumber.contains(textPhone.getText())) {
				cs.alert("적립되었습니다");
				System.out.println("적립되었습니다");
			}
			else {
				cs.alert("존재하지 않는 번호입니다");
				System.out.println("존재하지 않은 번호입니다");
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
		System.out.println("이전으로 돌아가기");
		// pm01.start(primaryStage); // 이전 창으로 돌아가는 코드 구현하기
		}
	
	public void btnNext() {
		pm03.setPayingStage();
		System.out.println("결제 수단 창 띄우기");
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
