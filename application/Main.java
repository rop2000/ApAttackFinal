package application;
	
import javax.swing.SwingUtilities;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

//https://stackoverflow.com/questions/29271239/how-to-embed-jpanel-into-javafx-pane
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		  final SwingNode swingNode = new SwingNode();
		  
		  
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,1500,1100);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
