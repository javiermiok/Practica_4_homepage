package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader =new FXMLLoader(getClass().getResource("Homepage.fxml"));
        AnchorPane pane=loader.load();
        Scene scene=new Scene(pane);
        primaryStage.setTitle("Home page");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    
    public static void main(String[] args) {
        launch(args);
    }
}
