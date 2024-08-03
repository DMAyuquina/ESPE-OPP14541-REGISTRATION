package ec.edu.espe.registersystemmaven.model;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public class TutorAccount {
    
    private String id;
    private String user;
    private String password;
    private String names;
    private String lastNames;
    private String email;

    public TutorAccount(String id, String user, String password, String names, String lastNames, String email) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.names = names;
        this.lastNames = lastNames;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
