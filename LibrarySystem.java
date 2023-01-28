import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Librarian> librarians;
    private ArrayList<Books> books;
    private ArrayList<Customer>customers;
    private int booksnumber;
    private int employeesNumber;
    private int borrowedBooks;

    public LibrarySystem(ArrayList<Librarian>librarians){
        this.librarians =librarians;

    }
    public LibrarySystem(Librarian librarian){
        this.librarians.add(librarian);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





