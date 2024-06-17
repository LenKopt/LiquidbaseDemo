package pl.akademiaspecjalistowit.liquidbasedemo.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String isbn;

    private String title;
    private String nameAuthor;
    private String lastNameAuthor;

    public BookEntity(String isbn, String title, String nameAuthor, String lastNameAuthor) {
        this.isbn = isbn;
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
}
