package dao;

import model.Book;
import model.User;

import java.util.List;

public interface BookDao {

    List<Book> getAllBooks();

    void saveBook(Book book);

    Book findById(int id);

    void removeBook(int id);

    void updateBook(Book book);

    void assignToUser(Book book, User user);
}
