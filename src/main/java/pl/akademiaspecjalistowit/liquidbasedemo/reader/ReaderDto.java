package pl.akademiaspecjalistowit.liquidbasedemo.reader;
import lombok.Getter;


@Getter
public class ReaderDto {
    private final String name;
    private final String surname;

    public ReaderDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
