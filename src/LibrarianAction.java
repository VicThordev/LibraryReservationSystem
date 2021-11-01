import java.util.ArrayList;
import java.util.Scanner;

public class LibrarianAction extends Librarian {
    String title;
    String author;
    int ISBN;
    int callNo;
    Scanner sca = new Scanner(System.in);



    ArrayList<LibrarianAction> arr = new ArrayList<>();
    String userName;
    LibrarianAction lib =new LibrarianAction();

    public void logIn() {
        System.out.println("Enter your Log In Details: ");
        System.out.print("Username: ");
        userName=sca.nextLine();
        System.out.print("Password: ");
        String passWord=sca.nextLine();
        if (userName.equals("Vic Thor")&&passWord.equals("Taepryung")) {
            details();
        } else System.out.println("Invalid Username or Password. ");
    }

    public void details() {
        System.out.println("Welcome on board, Dear "+userName);
        System.out.println("What would you like to do?");
        System.out.println("The available services are: ");
        System.out.println("1. Add Book");
        System.out.println("2. Issue Book");
        System.out.println("3. Check Book");
        System.out.println("4. Remove Book");
        System.out.print("Enter an input: ");
        byte input=sca.nextByte();
        switch (input) {
            case 1 -> addBook();
            case 2 -> issueBook();
            case 3 -> checkBook();
            case 4 -> removeBook();
            default -> System.out.println("Invalid Input.");
        }

    }

    public String getTitle() {
        System.out.println("Title: "+title);
        return title;
    }

    public String getAuthor() {
        System.out.println("Author: "+author);
        return author;
    }

    public int getISBN() {
        System.out.println("ISBN: "+ISBN);
        return ISBN;
    }

    public int getCallNo() {
        System.out.println("Call No: "+callNo);
        return callNo;
    }

    public void addBook() {

    }

    public void checkBook() {

    }



    public void issueBook() {

    }

    public void removeBook() {

    }


}
