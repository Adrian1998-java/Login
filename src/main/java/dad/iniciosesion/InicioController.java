package dad.iniciosesion;

import javafx.event.ActionEvent;

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
	
	//listeners
			
	private void onCancelarAction(ActionEvent e) {
		System.exit(0);
	}

	private void onAccederAction(ActionEvent e) {
		

	}
}
