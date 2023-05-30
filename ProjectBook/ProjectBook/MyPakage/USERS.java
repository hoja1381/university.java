import java.util.Date;

abstract class USERS {

    //User's ID number
    private int ID;

    //Username
    private String Username;

    //To record the time of registering, which must be entered when registering, by the time function
    private Date RegTime;

    public void setID(int newID){
        this.ID = newID;
    }

    public int getID() {
        return ID;
    }

    public void setUsername(String newUsername){
        this.Username = newUsername;
    }

    public String getUsername() {
        return Username;
    }

    //I think it's for making admin and users method
    public USERS(int ID, String username, Date regTime) {
        this.ID = ID;
        Username = username;
        RegTime = regTime;
    }
}
