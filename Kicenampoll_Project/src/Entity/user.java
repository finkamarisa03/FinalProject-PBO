package Entity;

public class user {
    private String username;
    private String password;
    
    //Default constuctor
    public user(){}
    
    //Contructor
    public user(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
