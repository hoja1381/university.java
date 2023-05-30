import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Book {

    Scanner input = new Scanner(System.in);

    //An array of books
    ArrayList<HashMap> BookList = new ArrayList<HashMap>();
    ArrayList<HashMap> Reserved = new ArrayList<HashMap>();


    public boolean AgeOK(User user, HashMap book){
        if (user.Age >= Integer.valueOf((String) book.get("Age Group"))){
            return true;
        } else {
            return false;
        }
    }


    //Number of reserved books
    int ResCount = 0;


    //To add books with a setter method to put books information in BookList
    public void Register(){

        try {

            HashMap<String, String> regbook = new HashMap<String, String>();
            System.out.println("Enter book's ISBN: ");
            int isbn = Integer.valueOf(input.nextLine());
            System.out.println("Enter book's name: ");
            String name = input.nextLine();
            System.out.println("Enter book's author: ");
            String author = input.nextLine();
            System.out.println("Enter book's abstract: ");
            String abstract1 = input.nextLine();
            System.out.println("Enter book's age group: ");
            int ageGroup = Integer.valueOf(input.nextLine());
            System.out.println("Enter book's status: ");
            boolean status = Boolean.valueOf(input.nextLine());

            regbook.put("ISBN", Integer.toString(isbn));
            regbook.put("Name", name);
            regbook.put("Author", author);
            regbook.put("Abstract", abstract1);
            regbook.put("Age Group", Integer.toString(ageGroup));
            regbook.put("Status", Boolean.toString(status));

            BookList.add(regbook);

            System.out.println("Your book registered!");
        }catch (Exception err){
            System.out.println(err);
        }


    }

    //To show the list of books
    public void List(){
        for ( HashMap i:  BookList) {
            System.out.println(i);
        }

    }

    //To write the information of the last reserved or returned book in LastBook.txt file
    public void WriteStatus(HashMap book) {
        if (book != null) {
            try {
                FileWriter writer = new FileWriter("LastBook.txt");
                writer.write("ISBN: " + book.get("ISBN") + "\n");
                writer.write("Name: " + book.get("Name") + "\n");
                writer.write("Author: " + book.get("Author") + "\n");
                writer.write("Abstract: " + book.get("Abstract") + "\n");
                writer.write("Age Group: " + book.get("Age Group") + "\n");
                writer.write("Status: " + book.get("Status") + "\n");
                writer.close();
                System.out.println("Last reserved or returned book saved in LastBook.txt!");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        } else {
            System.out.println("No books are registered yet.");
        }
    }

    //To show the LastBook.txt file which the information of the last reserved or returned book is saved in it
    public void LastStatus() {
        try {
            FileReader reader = new FileReader("LastBook.txt");
            Scanner fileScanner = new Scanner(reader);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            reader.close();
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
