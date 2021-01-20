package Kicenampoll;
import java.sql.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    Connection connect = null;
    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/view/Interface_home.fxml"));
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
       connect = connection.koneksi();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
