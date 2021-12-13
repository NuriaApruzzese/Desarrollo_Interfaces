package Controlador;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	

	@Override
	public void start(Stage primaryStage) {
		
		try{
		
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("/Vista/view.fxml"));
		Pane ventana=(Pane) loader.load();
		primaryStage.setTitle("Calcular Factura");		
		primaryStage.setScene(new Scene(ventana, 640,480));		
		primaryStage.show();
		
	}catch(IOException e) {
		
		System.out.println(e.getMessage());
	}
}

	public static void main(String[] args) {
		launch(args);

	}

}
