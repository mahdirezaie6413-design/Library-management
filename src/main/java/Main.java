import model.*;
import service.BookService;
import repository.BookRepository;
import repository.AuthorRepository; 

public class Main {

    public static void main(String[] args) {

    
        Author author = new Author(1, "Robert C. Martin");

             AuthorRepository authorRepo = new AuthorRepository();
        authorRepo.create(author.getId(), author.getName());

        LibraryItem book = new Book(0, "Clean Code", author, 464);

        book.displayInfo();
        System.out.println(((Book) book).isAvailable());

       
        BookService service = new BookService();
        service.addBook((Book) book);          

     
        BookRepository repo = new BookRepository();
        repo.getAll();

        
        // service.removeBook(1);
    }
}
