package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DessertQ {
    private static final String URL = "jdbc:mysql://localhost/DB_kicenampoll";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private Connection connect; 
    private PreparedStatement variant;
    private PreparedStatement beli;
    
    //constructor
    public DessertQ(){
        try{
            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            variant = connect.prepareStatement("SELET * FROM DessertBox");
            beli = connect.prepareStatement("SELECT Kode_variant FROM Pesanan WHERE Id_customer = ?");
        }
        catch (SQLException sqlEx){
            System.exit(1);
        }
    }
    
    public ArrayList<DessertBox> getVariant() throws SQLException{
        ArrayList<DessertBox> results = null;
        ResultSet RS = null;
        
        try{
            RS = variant.executeQuery();
            results = new ArrayList<DessertBox>();
            
            while(RS.next()){
                results.add(new DessertBox(RS.getInt("Kode_variant"), RS.getString("Variant"), RS.getString("Ukuran"), RS.getDouble("Harga")));
            }
        }
        catch (SQLException sqlEx){
        }
        finally{
            try{
                RS.close();
            }
            catch (SQLException sqlEx){
                close();
            }
        }
        return results;
    }
    
    public ArrayList<Integer> getbeli(int Id_customer){
        ArrayList<Integer> results = null;
        ResultSet RS = null;
        
        try{
            beli.setInt(1, Id_customer);
            RS = beli.executeQuery();
            results = new ArrayList<Integer>();
            
            while(RS.next()){
                int Kode_variant = RS.getInt("Kode_variant");
                results.add(Id_customer);
            }
        }
        catch (SQLException sqlEx){
        }
        finally{
            try{
                RS.close();
            }
            catch (SQLException sqlEx){
                close();
            }
        }
        return results;
    }
    
    //Tutup database
    public void close(){
        try{
            connect.close();
        }
        catch (SQLException sqlEx){
        }
    }
}
