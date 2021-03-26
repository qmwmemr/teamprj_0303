package kiosk.payment.bill;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import kiosk.payment.common.CommonClass;
import kiosk.payment.common.CommonService;

public class BillController implements Initializable {
	@FXML Label labelCallNumber;

	Parent root;
	CommonService cs;

	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void btnYes() {
		cs.alert("영수증이 출력되었습니다");
		cs.exit(root);
	}
	
	public void btnNo() {
		cs.exit(root);
	}

	@Override

	public void initialize(URL arg0, ResourceBundle arg1) {
		cs = new CommonClass();

	}

}
