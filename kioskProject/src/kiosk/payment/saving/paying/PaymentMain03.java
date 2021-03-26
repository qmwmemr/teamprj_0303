package kiosk.payment.saving.paying;

import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kiosk.payment.saving.PaymentController02;


public class PaymentMain03{

	public void setPayingStage() {
		Stage stage = new Stage();
		Parent root = null;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventPayment03.fxml"));
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		PaymentController03 controller = loader.getController();
		controller.setRoot(root);

		stage.setScene(scene);
		stage.show();
		
	}

}
