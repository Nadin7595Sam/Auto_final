package final_1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryRegistry registry = new LibraryRegistry();

        // Добавляем книги в реестр
        registry.addItem(new Book("B001", "Война и мир", "Лев Толстой", 300));
        registry.addItem(new Book("B002", "Преступление и наказание", "Федор Достоевский", 200));

        // Добавляем журналы в реестр
        registry.addItem(new Journal("J001", "Наука сегодня", "Science Journal", 1001));
        registry.addItem(new Journal("J002", "Природа", "Nature Publishing Group", 500));

        // Создаем сервис
        LibraryService service = new LibraryService(registry);

        // Инициализация сканера для чтения из консоли
        Scanner scanner = new Scanner(System.in);

        // Запрос инвентарного номера или автора у пользователя
        System.out.print("Введите инвентарный номер или автора для поиска: ");
        String input = scanner.nextLine();

        // Проверяем, является ли ввод инвентарным номером или автором
        List<LibraryItem> result;
        if (input.startsWith("B")) {
            // Поиск по инвентарному номеру
            result = service.searchByInventoryNumber(input);
        } else {
            // Поиск по автору
            result = service.searchByAuthor(input);
        }

        // Вывод результатов поиска
        if (result.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            System.out.println("Результаты поиска:");
            for (LibraryItem item : result) {
                System.out.println("Название: " + item.getTitle() + ", Автор: " + item.getAuthor() + ", Инвентарный номер: " + item.getInventoryNumber());
            }
        }

        // Закрываем сканер
        scanner.close();
    }
}