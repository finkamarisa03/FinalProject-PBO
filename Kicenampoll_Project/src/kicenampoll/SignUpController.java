package Kicenampoll;

import Entity.userQ;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class SignUpController implements Initializable {
    
    @FXML private VBox vbox;    
    @FXML private Parent fxml;
    @FXML private TextField usernameSignUp;
    @FXML private PasswordField passwordSignUp;
    @FXML private Label error;
    
    private userQ UQueries;
    private KicenampollProject apk;
    private AlertType t;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition T = new TranslateTransition(Duration.seconds(1), vbox);
        T.setToX(0);
        T.play();
        T.setOnFinished((e) ->{
            try{
                fxml = FXMLLoader.load(getClass().getResource("/View/SignUp.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            }catch(IOException ex){
                
            }
        });
    }
    
    public void setT(Alert.AlertType t) {
        this.t = t;
    }
    public void setApk(KicenampollProject apk) {
        this.apk = apk;
    }
    protected Alert informasi(){
        Alert peringatan   = new Alert(Alert.AlertType.INFORMATION);
            peringatan.setTitle("PEMBERITAHUAN");
            peringatan.setHeaderText(null);
            peringatan.setContentText(t + "Telah Berhasil Mendaftar. Klik OK.");
            peringatan.showAndWait();
            return peringatan;
    }
    
    public void buttonSignUp(ActionEvent event) throws IOException, SQLException{
        UQueries = new userQ();
        
        if(usernameSignUp.getText().trim().isEmpty() || passwordSignUp.getText().trim().isEmpty() ||
           usernameSignUp.getText().length() != 15 || passwordSignUp.getText().trim().length() != 8){
            error.setText("Username 15 karakter & Password 8 karakter. Buat dengan benar!.");
        }
        else{
            UQueries.addUser(usernameSignUp.getText(), passwordSignUp.getText());
            informasi();
            fxml = FXMLLoader.load(getClass().getResource("/View/SignUp.fxml"));
        }
    }
    
}
