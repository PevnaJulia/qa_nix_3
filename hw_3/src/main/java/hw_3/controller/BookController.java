package src.main.java.hw_3.controller;

import src.main.java.hw_3.entity.Book;
import src.main.java.hw_3.service.BookService;
import src.main.java.hw_3.service.BookServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BookController {
    private final BookService service = new BookServiceImpl();

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your options:");
        menu();
        String option;
        while ((option = reader.readLine()) != null) {
            switchToCrudOperations(option, reader);
            menu();
        }
    }

    private void menu() {
        System.out.println();
        System.out.println("If you want create book, please enter 1");
        System.out.println("If you want update book, please enter 2");
        System.out.println("If you want delete book, please enter 3");
        System.out.println("If you want select book, please enter 4");
        System.out.println("If you want select all books, please enter 5");
        System.out.println("If you want exit, please enter 0");
        System.out.println();
    }

    private void switchToCrudOperations(String option, BufferedReader reader) throws IOException {
        switch (option) {
            case "1": {create(reader);} break;
            case "2": {update(reader);} break;
            case "3": {delete(reader);} break;
            case "4": {findByIsbn(reader);} break;
            case "5": {findAll();} break;
            case "0": {System.exit(0);} break;
            default: System.out.println("Incorrect input value");
        }
    }

    private void create(BufferedReader reader) throws IOException {
        System.out.println("BookController.create");
        System.out.println("Please, enter book name:");
        String name = reader.readLine();
        System.out.println("Please, enter book description:");
        String description = reader.readLine();
        System.out.println("Please, enter book's count of pages:");
        String countString = reader.readLine();
        int count = Integer.parseInt(countString);
        System.out.println("Please, enter rate:");
        String rateString = reader.readLine();
        int rate = Integer.parseInt(rateString);
        Book book = new Book(name);
        book.setDescription(description);
        book.setCountOfPages(count);
        book.setRate(rate);

        service.create(book);
    }

    private void update(BufferedReader reader) throws IOException {
        System.out.println("BookController.update");
        System.out.println("Please, enter ISBN:");
        String isbn = reader.readLine();
        Book book = service.findByIsbn(isbn);
        System.out.println("Please, enter book rate:");
        String rateString = reader.readLine();
        int rate = Integer.parseInt(rateString);
        System.out.println("Please, enter book description:");
        String description = reader.readLine();
        System.out.println("Please, enter book's count of pages:");
        String countString = reader.readLine();
        int count = Integer.parseInt(countString);
        book.setRate(rate);
        book.setDescription(description);
        book.setCountOfPages(count);
        service.update(book);
    }

    private void delete(BufferedReader reader) throws IOException {
        System.out.println("BookController.delete");
        System.out.println("Please, enter ISBN:");
        String isbn = reader.readLine();
        service.delete(isbn);
    }

    private void findByIsbn(BufferedReader reader) throws IOException {
        System.out.println("BookController.findByIsbn");
        System.out.println("Please, enter ISBN:");
        String isbn = reader.readLine();
        Book book = service.findByIsbn(isbn);
        System.out.println("book = " + book);
    }

    private void findAll() {
        System.out.println("BookController.findAll");
        List<Book> books = service.findAll();
        for (Book book : books) {
            System.out.println("book = " + book);
        }
    }
}
