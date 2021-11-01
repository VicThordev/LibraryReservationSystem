public class CheckBook extends LibrarianAction{
    public void checkBook() {
        System.out.println("What's the title of the book you wanna check? ");
        String input = sca.nextLine();
        for (int i=0; i<=arr.size(); i++) {
            if (input.equals(lib.title)) {
                System.out.println("Here is the book "+arr.get(i));
            } else {
                System.out.println("Sorry, Book does not exist here. ");
            }
        }
    }
}
