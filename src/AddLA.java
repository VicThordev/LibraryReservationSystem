import java.util.ArrayList;
import java.util.Scanner;

public class AddLA extends LibrarianAction {
    Scanner sca = new Scanner(System.in);



    public void addLibn() {
        System.out.println("How many books do you wanna add?");
        var input= sca.nextByte();
        for (int i=1;i<=input;i++) {
            System.out.println("Enter the title: ");
            lib.title = sca.next();
            System.out.println("The Author: ");
            lib.author = sca.next();
            System.out.println("ISBN: ");
            lib.ISBN = sca.nextInt();
            arr.add(lib);
            System.out.println(lib.title);
        }
    }

    
}
