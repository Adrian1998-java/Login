package dad.iniciosesion;

import dad.login.*;
import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class InicioController {

	private InicioModel model = new InicioModel();
	private InicioView view = new InicioView();

	public InicioController() {

		view.getUsuarioText().textProperty().bindBidirectional(model.usuarioPropertyProperty());

		view.getPasswrdText().textProperty().bindBidirectional(model.passwordPropertyProperty());

		view.getAccederButton().setOnAction(e -> onAccederAction(e));

		view.getCancelarButton().setOnAction(e -> onCancelarAction(e));

	}

	public InicioView getView() {
		return view;
	}

	public InicioModel getModel() {
		return model;
	}

	// listeners

	private void onCancelarAction(ActionEvent e) {
		System.exit(0);
	}

	private void onAccederAction(ActionEvent e) {
		boolean useLdap = true;

		AuthService ldap = useLdap ? new LdapAuthService() : new FileAuthService();

		try {
			if (ldap.login(model.getUsuarioProperty(), model.getPasswordProperty()) == true) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son válidas");

				alert.showAndWait();

			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o contraseña no son válidos\n");

				alert.showAndWait();
			}
		} catch (Exception e1) {
			e1.getMessage();
		}
	}

}
