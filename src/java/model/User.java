
package model;


public class User {
    //Atributos
    private String userName;
    private String userPass;
    private String UserPass;
    
    //Construtor
    public User(String u, String p) {
        this.userName = u;
        this.userPass = p;
    }
    
    //Getter e Setter 
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String u) {
        this.userName = u;
    }
    
    public String getUserPass () {
        return this.userPass;
    }
    
    public void setUserPass(String p) {
        this.UserPass = p;
    }

    //Representação generica do objeto
    @Override
    public String toString() {
        return "<hr>nome: " + userName +
                "<br>senha:" + userPass;
    }
    
    public boolean isLogged() {
        return (userName.equals("email@email.com")
                && userPass.equals("senha1234"));
    }
    
}


 
