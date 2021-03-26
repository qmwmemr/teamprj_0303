package kiosk.payment.saving.paying;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;
import kiosk.payment.common.CommonClass;
import kiosk.payment.common.CommonService;

public class PaymentController04 implements Initializable {

	Parent root;
	CommonService cs;
	PaymentMain03 pm03;
	

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void btnPayCard() { // ������ ���̽��� �����ϱ�
		cs.exit(root);
		//â �� ���� ���ÿ� ������
	}
	
	public void btnPayGifticon() { // ������ ���̽��� �����ϱ�
		cs.exit(root);
		//â �� ���� ���ÿ� ������
	}

	public void btnPayKakaopay() { // ������ ���̽��� �����ϱ�
		cs.exit(root);
		//â �� ���� ���ÿ� ������
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cs = new CommonClass();
		pm03 = new PaymentMain03();
	}

}
