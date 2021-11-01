public class LibrarianComp {
    private AddLA addLA;
    private IssueBook isb;
    private CheckBook chb;
    private RemoveBook rmb;

    public LibrarianComp(AddLA addLA, IssueBook isb, CheckBook chb, RemoveBook rmb) {
        this.addLA = addLA;
        this.isb = isb;
        this.chb = chb;
        this.rmb = rmb;
    }

    public AddLA getAddLA() {
        return addLA;
    }

    public void setAddLA(AddLA addLA) {
        this.addLA = addLA;
    }

    public IssueBook getIsb() {
        return isb;
    }

    public void setIsb(IssueBook isb) {
        this.isb = isb;
    }

    public CheckBook getChb() {
        return chb;
    }

    public void setChb(CheckBook chb) {
        this.chb = chb;
    }

    public RemoveBook getRmb() {
        return rmb;
    }

    public void setRmb(RemoveBook rmb) {
        this.rmb = rmb;
    }
}
