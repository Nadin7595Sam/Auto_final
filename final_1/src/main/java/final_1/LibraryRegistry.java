package final_1;

import java.util.ArrayList;
import java.util.List;

class LibraryRegistry implements Searchable {
    private List<LibraryItem> items;

    public LibraryRegistry() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    @Override
    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getInventoryNumber().equals(inventoryNumber)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public List<LibraryItem> searchByAuthor(String author) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }
}