package final_1;

class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String inventoryNumber, String title, String author, int issueNumber) {
        super(inventoryNumber, title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
