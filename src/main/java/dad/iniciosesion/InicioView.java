package dad.iniciosesion;


import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class InicioView extends GridPane {

	TextField usuarioText;
	PasswordField passwrdText;
	
	Button accederButton;
	Button cancelarButton;
	
	CheckBox LDAPCheck;
	
	public InicioView() {
		super();
		
		usuarioText = new TextField();
		usuarioText.setMaxWidth(150);
		usuarioText.setAlignment(Pos.BASELINE_LEFT);
		passwrdText = new PasswordField();
		passwrdText.setMaxWidth(150);
		passwrdText.setAlignment(Pos.BASELINE_LEFT);
		
		accederButton = new Button("Acceder");
		accederButton.setDefaultButton(true);
		cancelarButton = new Button("Cancelar");
		
		LDAPCheck = new CheckBox("Usar LDAP");
		
		HBox buttonBox = new HBox();
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(5);
		buttonBox.setPadding(new Insets(5));
		buttonBox.getChildren().addAll(accederButton, cancelarButton);
		
		setPadding(new Insets(5));
		setVgap(5);
		setAlignment(Pos.CENTER);
		addRow(0, new Label("Usuario : "), usuarioText);
		addRow(1, new Label("Contraseña : "), passwrdText);
		addRow(2, LDAPCheck);
		addRow(3, buttonBox);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		getColumnConstraints().setAll(cols);
		
		cols[0].setHalignment(HPos.RIGHT);
		cols[0].setHgrow(Priority.ALWAYS);
		cols[0].setFillWidth(false);
		
		cols[1].setHalignment(HPos.LEFT);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		
		setHalignment(LDAPCheck, HPos.CENTER);
		setHalignment(buttonBox, HPos.CENTER);
		setColumnSpan(LDAPCheck, REMAINING);
		setColumnSpan(buttonBox, REMAINING);
		
		
		
		
//		HBox boxUno = new HBox();
//		boxUno.setAlignment(Pos.CENTER);
//		boxUno.setSpacing(5);
//		boxUno.setPadding(new Insets(5));
//		boxUno.getChildren().addAll(new Label("Usuario : "), usuarioText);
//		
//		HBox boxDos = new HBox();
//		boxDos.setAlignment(Pos.CENTER);
//		boxDos.setSpacing(5);
//		boxDos.setPadding(new Insets(5));
//		boxDos.getChildren().addAll(new Label("Contraseña : "), passwrdText);
//		
		
//		
//		setAlignment(Pos.CENTER);
//		setFillWidth(false);
//		setPadding(new Insets(5));
//		getChildren().addAll(boxUno, boxDos, boxTres);
		
		
	}

	public CheckBox getLDAPCheck() {
		return LDAPCheck;
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
