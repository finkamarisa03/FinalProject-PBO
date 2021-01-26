package Kicenampoll;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Alert;

public class connection {
    Connection connect = null;
    public static Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host   = "jdbc:mysql://localhost/DB_kicenampoll";
        String user   = "root";
        String pass   = "";
        try {
            Class.forName(driver);
            Connection connect = DriverManager.getConnection (host, user, pass);
            Alert peringatan   = new Alert(Alert.AlertType.INFORMATION);
            peringatan.setTitle("Peringatan SQL Connection");
            peringatan.setHeaderText(null);
            peringatan.setContentText("Berhasil mengkoneksikan ke host" + host);
            peringatan.showAndWait();
            return connect;
        }
        catch (ClassNotFoundException | SQLException e){
        Alert peringatan = new Alert(Alert.AlertType.ERROR);
        peringatan.setTitle("Peringatan SQL COnnection");
        peringatan.setHeaderText(null);
        peringatan.setContentText(""+e);
        peringatan.showAndWait();
    }
    return null;
}}
