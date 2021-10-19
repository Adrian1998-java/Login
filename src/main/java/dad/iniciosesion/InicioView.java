package dad.iniciosesion;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InicioView extends VBox {

	TextField usuarioText;
	PasswordField passwrdText;
	
	Button accederButton;
	Button cancelarButton;
	
	public InicioView() {
		super();
		
		usuarioText = new TextField();
		passwrdText = new PasswordField();
		
		accederButton = new Button("Acceder");
		
		cancelarButton = new Button("Cancelar");
		
		HBox boxUno = new HBox();
		boxUno.setAlignment(Pos.CENTER);
		boxUno.setPadding(new Insets(5));
		boxUno.getChildren().addAll(new Label("Usuario"), usuarioText);
		
		HBox boxDos = new HBox();
		boxDos.setAlignment(Pos.CENTER);
		boxDos.setPadding(new Insets(5));
		boxDos.getChildren().addAll(new Label("Contraseña"), passwrdText);
		
		HBox boxTres = new HBox();
		boxTres.setAlignment(Pos.CENTER);
		boxTres.setPadding(new Insets(5));
		boxTres.getChildren().addAll(accederButton, cancelarButton);
		
		setAlignment(Pos.CENTER);
		setFillWidth(false);
		setPadding(new Insets(5));
		getChildren().addAll(boxUno, boxDos, boxTres);
		
		
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getPasswrdText() {
		return passwrdText;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

}
