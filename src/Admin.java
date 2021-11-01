import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static Scanner scr;
    String name;
     String passWord;
     String email;
     int addressNo;
    Scanner sca = new Scanner(System.in);
    ArrayList<Librarian> arr = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }


    public String getName() {
        System.out.println("Name: "+name);
        return name;
    }

    public String getPassWord() {
        System.out.println("Password: "+passWord);
        return passWord;
    }

    public String getEmail() {
        System.out.println("Email: "+email);
        return email;
    }

    public int getAddressNo() {
        System.out.println("Address No: "+addressNo);
        return addressNo;
    }

    public Librarian viewLibrarian() {
        System.out.println("Do you wanna view the librarian added?");
        System.out.println("1. Yes" +
                " 2. No");
        byte view= sca.nextByte();
        if (view==1) {
            getName();
        getPassWord();
        getEmail();
        getAddressNo();
        }
        else System.out.println("Bye Bye. Thank You.");
        return null;
    }

    public static void  main(String[] args) {
        Librarian ad= new Librarian();
        Librarian ad1=new Librarian();
       LibrarianAction la=new LibrarianAction();
        la.details();

        LibrarianComp lbc= new LibrarianComp(new AddLA(), n);
        scr=new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("Welcome dear "+ad.getName());
            System.out.println("Choose an option: "+
                    "\n\t1. Add Book "+
                    "\n\t2. Check Book "+
                    "\n\t3. Issue Book"+
                    "\n\t4. Remove Book");
            
            int choice = scr.nextByte();
            switch (choice) {
                case 1 -> lbc.getAddLA().addBook();
            }
        }


       /*ad.addLibrarian();
        ad1.addLibrarian();
        ad.viewLibrarian();

        ad.deleteLibrarian();*/


    }
}
