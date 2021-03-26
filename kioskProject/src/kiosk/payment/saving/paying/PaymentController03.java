package kiosk.payment.saving.paying;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import kiosk.payment.bill.BillMainClass;
import kiosk.payment.common.CommonClass;
import kiosk.payment.common.CommonService;
import kiosk.payment.saving.PaymentMain02;
import kiosk.payment.saving.paying.btnNext.BtnNext;
import kiosk.payment.saving.paying.btnNext.BtnNextImpl;

public class PaymentController03 implements Initializable {

	Parent root;
	CommonService cs;
	PaymentMain02 pm02;
	PaymentMain04 pm04;
	BillMainClass bill;
	Button btnNext;

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void btnCard() { // 카드 결제
		pm04.setPaymentCard();
		System.out.println("카드 결제 창 띄우기");

	}

	public void btnKakaopay() { // 카카오페이 결제
		pm04.setPaymentKakaopay();
	}

	public void btnGifticon() { // 기프티콘 결제
		pm04.setPaymentGifticon();
		System.out.println("기프티콘 결제 창 띄우기");
	}

	public void btnFormer() {
		cs.exit(root);
		System.out.println("이전 화면 보이기");
		pm02.setSavingStage();
	}

	public void btnNext() {
		// 영수증 화면 이동
		// 버튼이 눌리지 않았으면 경고창, 한 번이라도 버튼이 눌렸으면 영수증 창으로 이동
		
		//btnNext = (Button) root.lookup("btnNext");
		//btnNext.setDisable(false);
		System.out.println("영수증 넘어가기");

		/*
		 * if (btnCard.isPressed() == true) { bill.setBillgStage(); cs.exit(root); }
		 * else if (btnKakaopay.isPressed() == true) { bill.setBillgStage();
		 * cs.exit(root); } else if (btnGifticon.isPressed() == true) {
		 * bill.setBillgStage(); cs.exit(root); } else { cs.alert("결제를 해주세요"); }
		 */
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cs = new CommonClass();
		pm02 = new PaymentMain02();
		pm04 = new PaymentMain04();
		bill = new BillMainClass();
		
	}

}
