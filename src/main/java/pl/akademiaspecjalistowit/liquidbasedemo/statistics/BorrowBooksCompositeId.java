package pl.akademiaspecjalistowit.liquidbasedemo.statistics;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class BorrowBooksCompositeId {
    private String nameAuthor;
    private String lastNameAuthor;
}
