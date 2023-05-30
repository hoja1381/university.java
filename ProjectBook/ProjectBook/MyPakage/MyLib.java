import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyLib implements Library {

    @Override
    public void MenuAdmin() {

        System.out.println("════════✿═══════╡°˖✧ ✿ ✧˖°╞═══════✿═══════");

        System.out.println("╭──╯ . . . . . ❁ Main Menu ❁ . . . . . ╰──╮");

        System.out.println("| ╰┈➤ 1.    ~ Register a User ~           |");

        System.out.println("| ╰┈➤ 2.    ~ Register a book ~           |");

        System.out.println("| ╰┈➤ 3.    ~  Search a book  ~           |");

        System.out.println("| ╰┈➤ 4.    ~  Borrow a book  ~           |");

        System.out.println("| ╰┈➤ 5.    ~  Return a book  ~           |");

        System.out.println("| ╰┈➤ 6.    ~      Exit       ~           |");

        System.out.println("═══════════════════ ⋆★⋆ ═══════════════════");


        int choice = Integer.valueOf(input.nextLine());

        switch (choice) {
            case 1:
                RegUser();
                break;
            case 2:
                book.Register();
                break;
            case 3:
                SearchBook();
                break;
            case 4:
                ReserveBook();
                break;
            case 5:
                ReturnBook();
                break;
            case 6:
                try {
                    loginSit = Exit();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Please choose a number from the menu.");
        }
        if (loginSit) {
            loginSit = false;
            MenuRun();
        }else {
            MenuAdmin();
        }
    }

    public void MenuUser() {

        System.out.println("════════✿═══════╡°˖✧ ✿ ✧˖°╞═══════✿═══════");

        System.out.println("╭──╯ . . . . . ❁ Main Menu ❁ . . . . . ╰──╮");

        System.out.println("| ╰┈➤ 1.    ~  Search a book  ~           |");

        System.out.println("| ╰┈➤ 2.    ~  Borrow a book  ~           |");

        System.out.println("| ╰┈➤ 3.    ~  Return a book  ~           |");

        System.out.println("| ╰┈➤ 4.    ~      Exit       ~           |");

        System.out.println("═══════════════════ ⋆★⋆ ═══════════════════");


        int choice = Integer.valueOf(input.nextLine());


        switch (choice) {
            case 1:
                SearchBook();
                break;
            case 2:
                ReserveBook();
                break;
            case 3:
                ReturnBook();
                break;
            case 4:
                try {
                    loginSit = Exit();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Please choose a number from the menu.");
        }
        if (loginSit) {
            loginSit = false;
            MenuRun();
        }else {
            MenuUser();
        }
    }

    @Override
    public void SearchBook() {

        System.out.println("═════════✿═══════╡°˖✧ ✿ ✧˖°╞═══════✿════════");

        System.out.println("       ** Choose your search option **      ");

        System.out.println("╭──╯ . . . . ❁Search Book Menu❁ . . . . ╰──╮");

        System.out.println("| ╰┈➤ 1.           ~  ISBN  ~              |");

        System.out.println("| ╰┈➤ 2.           ~  Name  ~              |");

        System.out.println("| ╰┈➤ 3.          ~  Author  ~             |");

        System.out.println("| ╰┈➤ 4.          ~ Abstract ~             |");

        System.out.println("════════════════════ ⋆★⋆ ════════════════════");

        int type = Integer.valueOf(input.nextLine());

        HashMap foundBook = searchBook(type);

        if(foundBook == null){
            System.out.println("Book not found.");
        }else {
            System.out.println(foundBook.values());
        }
    }

    private HashMap searchBook(int choice) {
        String _1 = "ISBN";
        String _2 = "Name";
        String _3 = "Author";
        String _4 = "Abstract";


        switch (choice) {
            case 1:
                System.out.println("Enter book's ISBN: ");
                String searchISBN = input.nextLine();
                for (HashMap i : book.BookList) {
                    if (i.get(_1).equals(searchISBN)) {
                        return i;
                    }
                }
                break;
            case 2:
                System.out.println("Enter book's Name: ");
                String searchName = input.nextLine();
                for (HashMap i : book.BookList) {
                    if (i.get(_2).equals(searchName)) {
                        return i;
                    }
                }
                break;
            case 3:
                System.out.println("Enter book's Author: ");
                String searchAuthor = input.nextLine();
                for (HashMap i : book.BookList) {
                    if (i.get(_3).equals(searchAuthor)) {
                        return i;
                    }
                }
                break;
            case 4:
                System.out.println("Enter book's abstract: ");
                String searchAbstract = input.nextLine();
                for (HashMap i : book.BookList) {
                    Pattern p = Pattern.compile(searchAbstract, Pattern.CASE_INSENSITIVE);
                    Matcher m = p.matcher((CharSequence) i.get(_4));
                    if (m.find()) {
                        return i;
                    }
                }
                break;
        }

        return null;
    }


    @Override
    public boolean Login() {

        users.add(userDefault);

        try {

            FileReader reader = new FileReader("Admin.txt");
            Scanner fileScanner = new Scanner(reader);
            ArrayList<String> result = new ArrayList<String>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                result.add(line.split(" ")[1]);
            }

            reader.close();
            fileScanner.close();

            Admin myAdmin = new Admin(
                    Integer.valueOf(result.get(0)),
                    result.get(1),
                    new Date(),
                    Boolean.valueOf(result.get(3))
            );
            myAdmin.setPassword(result.get(2));

            System.out.println("Enter your username: ");
            String username = input.nextLine();
            System.out.println("Enter your password: (if you are a user just press enter) ");
            String password = input.nextLine();

            if (password.equals("")){
                for (User i : users ){
                    if (i.getUsername().equals(username)){
                        MenuUser();
                    }
                }
            }else {
                return myAdmin.Login(username, password);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return false;
    }


    @Override
    public void ReserveBook() {
        System.out.println("Enter your user's ID: ");
        int id = Integer.valueOf(input.nextLine());
        
        HashMap checkBook = searchBook(1);
        User user = null;
        for (User i : users) {
            if (i.getID() == id){
                user = i;
            }
        }
        String res = checkBook.get("Status").toString();


        System.out.println(res);
        boolean status = Boolean.valueOf(res);

        if (book.AgeOK(user, checkBook) && status) {
            book.BookList.remove(checkBook);
            checkBook.replace("Status", false);
            book.BookList.add(checkBook);
            book.Reserved.add(checkBook);
            book.ResCount++;
            user.Reserved = Integer.valueOf((String) checkBook.get("ISBN"));
            System.out.println("Book reserved!");
            book.WriteStatus(checkBook);
        } else {
            System.out.println("Age group or status doesn't match.");
        }

         
    }
    
    @Override
    public void ReturnBook() {

        System.out.println("Enter your user's ID: ");
        int id = Integer.valueOf(input.nextLine());

        HashMap checkBook = searchBook(1);
        User user = null;
        for (User i : users) {
            if (i.getID() == id){
                user = i;
            }
        }

        if ( user.IsReserved(Integer.valueOf((String) checkBook.get("ISBN")))){
            book.Reserved.remove(checkBook);
            book.BookList.remove(checkBook);
            checkBook.replace("Status", true);
            book.BookList.add(checkBook);
            book.ResCount--;
            user.Reserved = 0;
            System.out.println("Book returned!");
            book.WriteStatus(checkBook);
        } else {
            System.out.println("You don't have the book.");
        }

    }

    public void MenuRun(){
        if (Login() == true){
            boolean loginSit = false;
            MenuAdmin();
        } else {
            boolean loginSit = false;
            MenuRun();
        }
    }
    public void RegUser() {

        try {
            System.out.println("Enter user's ID: ");
            int ID = Integer.valueOf(input.nextLine());
            System.out.println("Enter user's username: ");
            String username = input.nextLine();
            System.out.println("Enter user's age: ");
            int age = Integer.valueOf(input.nextLine());
            User myUser = new User(ID, age, username, new Date());
            users.add(myUser);
            System.out.println("New user registered successfully.");
        } catch (Exception exception){
            System.out.println(exception);
            MenuAdmin();
        }
    }

    public boolean Exit() throws Exception {
        System.out.println("1. Exit to login page.");
        System.out.println("2. Exit app.");
        int choice = Integer.valueOf(input.nextLine());
        switch (choice){
            case 1:
                Login();
                return true;
            case 2:
                throw new RuntimeException("Bye Bye!");
        }
        return false;
    }
    Scanner input = new Scanner(System.in);

    ArrayList<User> users = new ArrayList<User>();

    User userDefault = new User(2,18,"Ali", new Date());

    boolean loginSit = false;


    Book book = new Book();
}
