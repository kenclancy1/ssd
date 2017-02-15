package Version1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RunFmx extends Application {

	public void start(Stage ps) 
	{
		// TODO Auto-generated method stub
		try {
			Pane pane = FXMLLoader.load(getClass().getResource("Mosaic.fxml"));
			Scene s = new Scene(pane, 300, 300);
			ps.setScene(s);
			ps.setTitle("MosaicFXML");
			ps.show();
		} catch (IOException e) { }
	}

	private static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);}
	}


