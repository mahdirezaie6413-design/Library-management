import model.*;
import service.BookService;
import repository.BookRepository;
import repository.AuthorRepository; // این را اضافه کنید

public class Main {

    public static void main(String[] args) {

        // 1. ایجاد شیء نویسنده
        Author author = new Author(1, "Robert C. Martin");

        // 2. ذخیره نویسنده در دیتابیس (بسیار مهم)
        // بدون این خط، دیتابیس اجازه ذخیره کتاب را نمی‌دهد
        AuthorRepository authorRepo = new AuthorRepository();
        authorRepo.create(author.getId(), author.getName());

        // 3. ایجاد شیء کتاب
        LibraryItem book = new Book(0, "Clean Code", author, 464);

        book.displayInfo();
        System.out.println(((Book) book).isAvailable());

        // 4. ذخیره کتاب در دیتابیس
        BookService service = new BookService();
        service.addBook((Book) book);             // حالا این متد بدون خطا اجرا می‌شود

        // 5. نمایش همه کتاب‌ها
        BookRepository repo = new BookRepository();
        repo.getAll();

        // 6. حذف (در صورت نیاز)
        // service.removeBook(1);
    }
}