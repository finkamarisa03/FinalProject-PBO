package Kicenampoll;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

public class Interface_LoginController implements Initializable {

    private AnchorPane pane_home;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changePane_DessertBox(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/View/Interface_DessertBox.fxml"));
        pane_home.getChildren().setAll(pane);
    }

    @FXML
    private void changePane_Home(ActionEvent event) {
        try{
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Interface_home_1.fxml"));
            pane_home.getChildren().setAll(pane);
        }
        catch (IOException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(""+e);
        }
    }

    @FXML
    private void changePane_About(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Interface_About.fxml"));
        pane_home.getChildren().setAll(pane);
    }

    @FXML
    private void changePane_SignUp(ActionEvent event) {
    }
    
}
