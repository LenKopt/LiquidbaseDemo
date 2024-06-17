package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.akademiaspecjalistowit.liquidbasedemo.book.BookEntity;
import pl.akademiaspecjalistowit.liquidbasedemo.reader.ReaderEntity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "borrows")

public class BorrowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID technicalId;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private ReaderEntity readerId;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity bookId;
    private LocalDate borrowDate;
    private LocalDate returnDate;


    public BorrowEntity(ReaderEntity readerId, BookEntity bookId) {
        this.technicalId = UUID.randomUUID();
        this.readerId = readerId;
        this.bookId = bookId;
        this.borrowDate = LocalDate.now();
        this.returnDate = null;
    }
}
