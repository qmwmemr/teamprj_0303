package kiosk.payment.saving.paying;

import javafx.scene.Parent;
import javafx.scene.control.Button;

public class BtnNext {
	Button card, kakaopay, gifticon, btnNext;
	
	private void setController(Parent root) {
		card = (Button)root.lookup("#card");
		kakaopay = (Button)root.lookup("#kakaopay");
		gifticon = (Button)root.lookup("#gifticon");
		btnNext = (Button)root.lookup("#btnNext");
		
	}
	
	public void setBtnNext(Parent root) {
		setController(root);
		btnNext.setDisable(false);
	}

}
