public class IssueBook extends LibrarianAction {
    public void issueBook() {
        System.out.println("What's the title of the book you wanna issue? ");
        String input = sca.nextLine();
        for (int i=0; i<=arr.size();i++) {
            if (input.equals(lib.title)) {
                System.out.println(arr.get(i));
            }
        }
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPassWord(String passWord) {
        super.setPassWord(passWord);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setAddressNo(int addressNo) {
        super.setAddressNo(addressNo);
    }
}
