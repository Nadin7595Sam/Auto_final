package final_1;

import java.util.List;

public class LibraryService {
    private LibraryRegistry registry;

    public LibraryService(LibraryRegistry registry) {
        this.registry = registry;
    }

    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        return registry.searchByInventoryNumber(inventoryNumber);
    }

    public List<LibraryItem> searchByAuthor(String author) {
        return registry.searchByAuthor(author);
    }
}
