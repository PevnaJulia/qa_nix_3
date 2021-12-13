package src.main.java.hw_3.dao;

import src.main.java.hw_3.entity.Book;

import java.util.List;

public interface BookDao {
    void create(Book book);
    void update(Book book);
    void delete(String isbn);
    Book findByIsbn(String isbn);
    List<Book> findAll();
    boolean existByName(String name);
}
