package dad.iniciosesion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InicioModel {

	private StringProperty usuarioProperty = new SimpleStringProperty();
	private StringProperty passwordProperty = new SimpleStringProperty();
	
	public final StringProperty usuarioPropertyProperty() {
		return this.usuarioProperty;
	}
	
	public final String getUsuarioProperty() {
		return this.usuarioPropertyProperty().get();
	}
	
	public final void setUsuarioProperty(final String usuarioProperty) {
		this.usuarioPropertyProperty().set(usuarioProperty);
	}
	
	public final StringProperty passwordPropertyProperty() {
		return this.passwordProperty;
	}
	
	public final String getPasswordProperty() {
		return this.passwordPropertyProperty().get();
	}
	
	public final void setPasswordProperty(final String passwordProperty) {
		this.passwordPropertyProperty().set(passwordProperty);
	}
	
	
	
	
}
