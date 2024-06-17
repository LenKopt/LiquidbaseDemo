package pl.akademiaspecjalistowit.liquidbasedemo.reader;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "readers")
public class ReaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID readerTechnicalId;

    private String name;

    private String surname;

    public ReaderEntity(UUID readerTechnicalId, String name, String surname) {
        this.readerTechnicalId = readerTechnicalId;
        this.name = name;
        this.surname = surname;
    }
}
