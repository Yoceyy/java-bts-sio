package application;


import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlleur {
	
	@FXML
	private Button leBouton;
	@FXML
	private TextField mdp;
	@FXML
	private Label affiche;
	
	
	
	public void AffichageText() {
		affiche.setText(mdp.getText());
	}
	
}
