package kiosk.payment.bill;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BillMainClass {

	public void setBillgStage() {
		Stage stage = new Stage();
		Parent root = null;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventBill.fxml"));
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);

		BillController controller = loader.getController();
		controller.setRoot(root);

		stage.setScene(scene);
		stage.show();

	}

}
