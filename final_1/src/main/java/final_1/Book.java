package final_1;

class Book extends LibraryItem {
    private int pageCount;

    public Book(String inventoryNumber, String title, String author, int pageCount) {
        super(inventoryNumber, title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}