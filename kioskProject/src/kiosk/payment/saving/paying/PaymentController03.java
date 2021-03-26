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

	public void btnCard() { // ī�� ����
		pm04.setPaymentCard();
		System.out.println("ī�� ���� â ����");

	}

	public void btnKakaopay() { // īī������ ����
		pm04.setPaymentKakaopay();
	}

	public void btnGifticon() { // ����Ƽ�� ����
		pm04.setPaymentGifticon();
		System.out.println("����Ƽ�� ���� â ����");
	}

	public void btnFormer() {
		cs.exit(root);
		System.out.println("���� ȭ�� ���̱�");
		pm02.setSavingStage();
	}

	public void btnNext() {
		// ������ ȭ�� �̵�
		// ��ư�� ������ �ʾ����� ���â, �� ���̶� ��ư�� �������� ������ â���� �̵�
		
		//btnNext = (Button) root.lookup("btnNext");
		//btnNext.setDisable(false);
		System.out.println("������ �Ѿ��");

		/*
		 * if (btnCard.isPressed() == true) { bill.setBillgStage(); cs.exit(root); }
		 * else if (btnKakaopay.isPressed() == true) { bill.setBillgStage();
		 * cs.exit(root); } else if (btnGifticon.isPressed() == true) {
		 * bill.setBillgStage(); cs.exit(root); } else { cs.alert("������ ���ּ���"); }
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
