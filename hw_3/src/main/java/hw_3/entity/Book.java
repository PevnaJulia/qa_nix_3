package src.main.java.hw_3.entity;

public class Book {

    private String isbn;
    private final String name;
    private String description;
    private int countOfPages;
    private int rate;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public Book (String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Count of pages=" + countOfPages +
                ", Rate=" + rate +
                '}';
    }
}




