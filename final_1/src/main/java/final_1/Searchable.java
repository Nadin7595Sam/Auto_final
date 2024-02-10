package final_1;

import java.util.List;

interface Searchable {
    List<LibraryItem> searchByInventoryNumber(String inventoryNumber);
    List<LibraryItem> searchByAuthor(String author);
}