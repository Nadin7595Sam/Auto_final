package final_1;

abstract class LibraryItem {
    private String inventoryNumber;
    private String title;
    private String author;

    public LibraryItem(String inventoryNumber, String title, String author) {
        this.inventoryNumber = inventoryNumber;
        this.title = title;
        this.author = author;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}