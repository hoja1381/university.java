import java.util.Date;
import java.util.Scanner;

public class Admin extends USERS {

    Scanner input = new Scanner(System.in);
    String password;


    boolean Active;

    enum Type {
        Administrator,
        Moderator
    }
    public Admin(int ID, String username, Date regTime, boolean Active) {
        super(ID, username, regTime);
        this.Active = Active;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPassword(){
        System.out.println("Enter the new password: ");
        String newPassword = input.nextLine();
        System.out.println("Confirm your password:" );
        String check = input.nextLine();
        if (check.equals(newPassword)){
            password = newPassword;
            System.out.println("Password set!");
        } else {
            System.out.println("Password not match, try again.");
            setPassword();
        }

    }
    public boolean Login(String username, String password){

        if (super.getUsername().equals(username)) {
            if (this.password.equals(password)) {
                System.out.println("Login successful.");
                return true;
            } else {
                System.out.println("Username or Password is not correct.");
                return false;
            }
        } else {
            System.out.println("Username or Password is not correct.");
            return false;
        }
    }
}
