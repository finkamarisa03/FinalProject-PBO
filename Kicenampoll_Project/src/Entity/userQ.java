package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userQ {
    private static final String URL = "jdbc:mysql://localhost/DB_kicenampoll";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private Connection connect; 
    private PreparedStatement User_Username;
    private PreparedStatement User_Password;
    private PreparedStatement insertUser;
    
    //constructor
    public userQ() {
        try{
            connect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            User_Username = connect.prepareStatement("SELECT * FROM user WHERE username = ?");
            User_Password = connect.prepareStatement("SELECT * FROM user WHERE password = ?");
            insertUser = connect.prepareStatement("INSERT INTO user" + "(username, password)" + "VALUES (?, ?)");
        }
        catch(SQLException e){
            System.exit(1);
        }
    }    
    
    //Login Form dg username
    public List<user> getUserByUsername(String username){
        List<user> results = null;
        ResultSet RS = null;
        
        try{
            User_Username.setString(1, username);
            RS = User_Username.executeQuery();
            results = new ArrayList<user>();
            
            while(RS.next()){
                results.add(new user(RS.getString("username"), RS.getString("password")));
                }
        }catch(SQLException e){
        }finally{
            try{
                RS.close();
            }
            catch (SQLException e){
                close();
            }
        }
        return results;
    }
    
    //Login Form dg password
    public List<user> getUserByPassword(String password){
        List<user> results = null;
        ResultSet RS = null;
        
        try{
            User_Password.setString(1, password);
            RS = User_Password.executeQuery();
            results = new ArrayList<user>();
            
            while(RS.next()){
                results.add(new user(RS.getString("username"), RS.getString("password")));
            }
        }
        catch(SQLException e){
        }
        finally {
            try{
                RS.close();
            }
            catch(SQLException sqlEx){
                close();
            }
        }
        return results;
    }
    
    //SignUp form
    public int addUser(String username, String password){
        int result = 0;
        
        try{
            insertUser.setString(1, username);
            insertUser.setString(2, password);
        }
        catch(SQLException e){
            close();
        }
        return result;
    }
    
    //Tutup database
    public void close(){
        try{
            connect.close();
        }
        catch (SQLException e){
        }
    }
}
