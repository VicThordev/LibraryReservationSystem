public class RemoveBook extends LibrarianAction {
    public void removeBook() {
        System.out.println("Pls enter the title of the book you wanna delete");
        String input=sca.nextLine();
        for (int i=0;i<=arr.size();i++) {
            if (input.equals(lib.title)) {
                arr.remove(i);
                System.out.println("Book Deleted!");
            } else {
                System.out.println("Such book does not exist here.");
            }
        }
    }
}
