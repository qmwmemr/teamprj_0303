package kiosk.payment;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import kiosk.payment.common.CommonClass;
import kiosk.payment.common.CommonService;
import kiosk.payment.saving.PaymentMain02;

public class PaymentController01 implements Initializable{
	
	Parent root;
	CommonService cs;
	PaymentMain02 pm02;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void btnFormer() {
		cs.exit(root);
		System.out.println("창 닫기");
	}
	
	public void btnLatter() {
		pm02.setSavingStage();
		System.out.println("적립 창 뜨우기");
		// cs.exit(root); // paymentcontroller02에서 이전 창으로 돌아가는 btnFormer을 구현 후 코드 살리기
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cs = new CommonClass();
		pm02 = new PaymentMain02();
	}

}
