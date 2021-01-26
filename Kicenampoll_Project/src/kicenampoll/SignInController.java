package Kicenampoll;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class SignInController implements Initializable {
    @FXML private VBox vbox;    
    @FXML private Parent fxml;
    @FXML private TextField usernameLogin;
    @FXML private PasswordField passwordLogin;
    @FXML private Label err;
    
    private final KicenampollProject apk;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1), vbox);
        t.setToX(vbox.getLayoutX() * 20);
        t.play();
        t.setOnFinished((e) ->{
            try{
                fxml = FXMLLoader.load(getClass().getResource("/View/SignIn.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            }catch(IOException ex){
                
            }
        });
        err.setText("");
    }   
    public SignInController(KicenampollProject apk) {
        this.apk = apk;
    }
    
    @FXML
    public void ButtonLogin(ActionEvent event) throws IOException {
        if(apk == null){
            fxml = FXMLLoader.load(getClass().getResource("/View/Pemesanan.fxml"));
            vbox.getChildren().setAll(fxml);
        }
        else {
            err.setText("Username & Password SALAH!");
        }
    }
}
