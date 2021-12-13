package src.main.java.hw_3.dao;

import src.main.java.hw_3.entity.Book;
import src.main.java.hw_3.db.Db;

import java.util.List;

public class BookDaoImpl implements BookDao {
    private final Db db = Db.getInstance();

    @Override
    public void create(Book book) {
        db.insert(book);
    }

    @Override
    public void update(Book book) {
        db.update(book);
    }

    @Override
    public void delete(String isbn) {
        db.delete(isbn);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return db.selectByIsbn(isbn);
    }

    @Override
    public List<Book> findAll() {
        return db.selectAll();
    }

    @Override
    public boolean existByName(String name) {
        return db.existByName(name);
    }
}
