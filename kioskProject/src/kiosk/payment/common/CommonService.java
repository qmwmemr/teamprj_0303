package kiosk.payment.common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;

public interface CommonService {
	public void exit(Parent root);
	public void alert(String message);

}
