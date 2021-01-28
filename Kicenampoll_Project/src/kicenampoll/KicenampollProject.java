package Kicenampoll;
import Entity.User;
import Entity.userQ;
import java.sql.Connection;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class KicenampollProject extends Application {
    Connection connect = null;
       
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Home.fxml"));        
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        
        connect = connection.koneksi();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    private userQ UQueries;
    private ArrayList<User> usernameR;
    private ArrayList<User> passwordR;
   
        
}

