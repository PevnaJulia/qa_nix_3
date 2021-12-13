package src.main.java.hw_3.db;

import src.main.java.hw_3.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Db {

    private final List<Book> books = new ArrayList<>();
    private final static Db instance = new Db();

    private Db () { }

    public static Db getInstance() {
        return instance;
    }

    public void insert(Book book) {
        book.setIsbn(generateIsbn());
        books.add(book);
    }

    public Book selectByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> selectAll() {
        return books;
    }

    public void delete(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void update(Book book) {
        for (Book current : books) {
            if (current.getIsbn().equals(book.getIsbn())) {
                current = book;
            }
        }
    }

    public boolean existByName(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private String generateIsbn() {
        String isbn = UUID.randomUUID().toString();
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return generateIsbn();
            }
        }
        return isbn;
    }
}

