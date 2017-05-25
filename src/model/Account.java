package model;
// Generated 23-may-2017 12:37:57 by Hibernate Tools 4.3.1



/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {
    private String description;


     private AccountId id;
     private String password;
     private String platform;
     private String user;

    public Account() {
    }

	
    public Account(AccountId id, String user, String password, String platform) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.platform = platform;
    }
    public Account(AccountId id, String user, String password, String description, String platform) {
       this.id = id;
       this.user = user;
       this.password = password;
       this.description = description;
       this.platform = platform;
    }
    public String getDescription() {
        return this.description;
    }
   
    public AccountId getId() {
        return this.id;
    }
    
    public String getPassword() {
        return this.password;
    }
    public String getPlatform() {
        return this.platform;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public void setId(AccountId id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public void setUser(String user) {
        this.user = user;
    }




}


