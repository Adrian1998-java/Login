package dad.iniciosesion;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InicioModel {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty password = new SimpleStringProperty();
	
	private BooleanProperty LDAPChecked = new SimpleBooleanProperty();
	
	//Usuario
	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public final String getUsuarioProperty() {
		return this.usuarioProperty().get();
	}
	
	public final void setUsuarioProperty(final String usuarioProperty) {
		this.usuarioProperty().set(usuarioProperty);
	}
	
	//Password
	public final StringProperty passwordProperty() {
		return this.password;
	}
	
	public final String getPasswordProperty() {
		return this.passwordProperty().get();
	}
	
	public final void setPasswordProperty(final String passwordProperty) {
		this.passwordProperty().set(passwordProperty);
	}
	
	//Boolean CheckBox
	public final BooleanProperty LDAPCheckedProperty() {
		return this.LDAPChecked;
	}
	

	public final boolean isLDAPChecked() {
		return this.LDAPCheckedProperty().get();
	}
	

	public final void setLDAPChecked(final boolean LDAPChecked) {
		this.LDAPCheckedProperty().set(LDAPChecked);
	}
	
	
	
	
	
}
