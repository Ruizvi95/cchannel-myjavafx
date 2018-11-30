package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;


public class Controlador {


	@FXML
	public void cerrar() {
		System.exit(0);
	}
	
	@FXML
	public void newVentana() {
        try {
        	FXMLLoader loader= new FXMLLoader(getClass().getResource("VentanaDos.fxml"));
            AnchorPane ventanaDos=(AnchorPane) loader.load();
            
        	Stage stage = new Stage();
            
            Scene scene=new Scene(ventanaDos);
            stage.setTitle("My New Stage Title");
            stage.setScene(scene);
            stage.show();
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}
