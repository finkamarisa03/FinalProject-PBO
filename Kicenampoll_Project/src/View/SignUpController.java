package View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class SignUpController implements Initializable {
    
    @FXML 
    private AnchorPane pane_pemesanan;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void ButtonSignUp(ActionEvent event) throws IOException {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("Pemesanan.fxml"));
            pane_pemesanan.getChildren().setAll(pane);

}}
