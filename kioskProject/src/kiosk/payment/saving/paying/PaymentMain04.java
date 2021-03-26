package kiosk.payment.saving.paying;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kiosk.payment.saving.PaymentController02;

public class PaymentMain04 {
	public void setPaymentCard() {
		System.out.println("paymentCard 호출");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventPaymentCard.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PaymentController04 controller = loader.getController();
		controller.setRoot(root);
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	
	public void setPaymentGifticon() {
		System.out.println("paymentGifticon 호출");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventPaymentGifticon.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PaymentController04 controller = loader.getController();
		controller.setRoot(root);
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	
	public void setPaymentKakaopay() {
		System.out.println("paymentGifticon 호출");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventPaymentKakaopay.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PaymentController04 controller = loader.getController();
		controller.setRoot(root);
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}

}
