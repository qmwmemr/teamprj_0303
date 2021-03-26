package kiosk.payment.saving;

import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentMain02{
	public void setSavingStage() {
		Stage stage = new Stage();
		Parent root = null;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventPayment02.fxml"));
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		PaymentController02 controller = loader.getController();
		controller.setRoot(root);

		stage.setScene(scene);
		stage.show();
	}


}
