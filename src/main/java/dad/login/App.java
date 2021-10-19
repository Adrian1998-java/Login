package dad.login;

import dad.iniciosesion.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		InicioController controlador = new InicioController();

		Scene scene = new Scene(controlador.getView(), 320, 120);
		
		primaryStage.setTitle("Inicio Sesión");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
