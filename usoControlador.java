package Controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class usoControlador implements Initializable {
	
	//creo las variables de base imponible, iva y la guardo en Total (q tb la creo)
	
	@FXML
	private Button botonCalcular;
	
	@FXML
	private TextField txtOpe1;
	
	@FXML
	private TextField txtBI;
		
	@FXML
	private TextField txtTotal;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	
	private void calcula(ActionEvent event) { //paso las variables de texto a números
		
		try {
		
		double op1=Integer.parseInt(this.txtOpe1.getText());
		
		double cuotaIVA=op1*.21;
		
		double resultado=op1+cuotaIVA;
		
		//txt BI y txtTotal son de tipo string, si no le pongo las "" da error ya que resultado es double
		
		this.txtBI.setText(cuotaIVA+"");
		
		this.txtTotal.setText(resultado+"");
		
		}catch (NumberFormatException e) {
			
			//si introducimos caracteres incorrectos creamos mensaje de error
			
			Alert alert=new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("Formato Incorrecto");
			alert.showAndWait();
			
		}
		
	}

}
