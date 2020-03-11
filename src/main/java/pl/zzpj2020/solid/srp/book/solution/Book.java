package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> pages = new HashMap<>();
    private String libraryRoomName;
    private String rowLocator;
    private String title;
    private String author;
    private int indexOnShelf;
    private int currentPage = 0;

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void setPages(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }

    public String getCurrentPage() {
        return pages.get(currentPage);
    }
    public void turnPage() {
        currentPage ++;
    }

}
