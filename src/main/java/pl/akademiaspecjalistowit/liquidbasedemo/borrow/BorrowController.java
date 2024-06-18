package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.web.bind.annotation.*;
import pl.akademiaspecjalistowit.liquidbasedemo.book.BookRepository;
import pl.akademiaspecjalistowit.liquidbasedemo.reader.ReaderRepository;
import pl.akademiaspecjalistowit.liquidbasedemo.statistics.BorrowBooks;
import pl.akademiaspecjalistowit.liquidbasedemo.statistics.BorrowsBooksStatistics;

import java.util.List;

@RestController

@RequestMapping("/borrows")
public class BorrowController {
    private final BorrowRepository borrowRepository;
    private final BookRepository bookRepository;
    private final ReaderRepository readerRepository;
    private final BorrowBooks borrowBooks;

    public BorrowController(BorrowRepository borrowRepository, BookRepository bookRepository, ReaderRepository readerRepository, BorrowBooks borrowBooks) {
        this.borrowRepository = borrowRepository;
        this.bookRepository = bookRepository;
        this.readerRepository = readerRepository;
        this.borrowBooks = borrowBooks;
    }

    @PostMapping
    public void addBorrow(@RequestParam(name = "readerId") Long readerId, @RequestParam(name = "bookId") Long bookId) {
        borrowRepository.save(new BorrowEntity(readerRepository.findById(readerId).orElseThrow(() -> new RuntimeException("Not exists reader")),
                bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Not exists book"))));
    }

    @GetMapping
    public List<BorrowsBooksStatistics> getAllByMyQuery() {
        return borrowBooks.findAll();
    }
}
