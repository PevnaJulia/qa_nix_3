package src.main.java.hw_3.service;

import src.main.java.hw_3.entity.Book;
import src.main.java.hw_3.dao.BookDao;
import src.main.java.hw_3.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl implements BookService {
    private final BookDao bookDao = new BookDaoImpl();

    @Override
    public void create(Book book) {
        if (!bookDao.existByName(book.getName())) {
            bookDao.create(book);
        }
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(String id) {
        bookDao.delete(id);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
