package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Label lblMensagem;
	private Button btnClick;
	
	@FXML
	private void clicouBotao(ActionEvent event) {
		lblMensagem.setText("Ola mundo");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
}
