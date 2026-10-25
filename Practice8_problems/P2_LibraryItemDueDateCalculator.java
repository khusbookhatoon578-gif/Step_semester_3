package Practice8_problems;

import java.time.LocalDate;
import java.util.*;

abstract class LibraryItem {
    protected String title;
    protected static final LocalDate CURRENT_DATE = LocalDate.of(2023, 10, 26);

    public LibraryItem(String title) {
        this.title = title;
    }

    abstract LocalDate getDueDate();
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    public LocalDate getDueDate() {
        return CURRENT_DATE.plusDays(14);
    }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }

    public LocalDate getDueDate() {
        return CURRENT_DATE.plusDays(7);
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    public LocalDate getDueDate() {
        return CURRENT_DATE.plusDays(3);
    }
}

public class P2_LibraryItemDueDateCalculator {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("1984"));
        items.add(new DVD("The Matrix"));
        items.add(new Magazine("Forbes Issue 500"));

        for (LibraryItem item : items) {
            System.out.println(item.title + ": " + item.getDueDate());
        }
    }
}