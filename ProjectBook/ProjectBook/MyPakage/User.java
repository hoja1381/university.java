import java.util.Date;

public class User extends USERS{

    //Contains the book number of the book that it reserved
    int Reserved;
    int Age;


    public User(int ID,int Age, String username, Date regTime) {
        super(ID, username, regTime);
        this.Age = Age;
    }

    public boolean IsReserved(int ISBN) {
        if (Reserved == ISBN){
            return true;
        } else {
            return false;
        }
    }
}
