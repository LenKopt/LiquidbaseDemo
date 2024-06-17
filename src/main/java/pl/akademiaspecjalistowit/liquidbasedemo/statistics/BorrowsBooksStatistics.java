package pl.akademiaspecjalistowit.liquidbasedemo.statistics;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "borrow_books")
public class BorrowsBooksStatistics {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride( name = "nameAuthor", column = @Column(name = "name_author")),
            @AttributeOverride( name = "lastNameAuthor", column = @Column(name = "last_name_author"))
    })
    private BorrowBooksCompositeId id;
    private Double percent;

}
