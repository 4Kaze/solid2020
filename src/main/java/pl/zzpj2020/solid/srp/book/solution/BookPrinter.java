package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {

    private final Book book;
    public BookPrinter(Book book) {
        this.book = book;
    }

    public String printAllPages() {
        StringBuilder allPages = new StringBuilder();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages.append(page.getKey());
            allPages.append(" ");
            allPages.append(page.getValue());
        }
        return  allPages.toString();
    }

    public void printCurrentPage() {
        System.out.println(book.getCurrentPage());
    }
}
