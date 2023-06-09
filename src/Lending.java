import java.time.LocalDate;

public class Lending {

    // Variables
    private LocalDate dueDate;
    private Book book;
    private User user;

    // Constructor
    public Lending(Book book, User user) {
        this.dueDate = LocalDate.now().plusDays(30);
        this.book = book;
        this.user = user;
    }

    // Getters and setters

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
