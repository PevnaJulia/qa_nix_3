package src.main.java.hw_3;

import src.main.java.hw_3.controller.BookController;

import java.io.IOException;

public class OopMain {
    public static void main(String[] args) throws IOException {
        BookController controller = new BookController();
        controller.run();
    }
}
