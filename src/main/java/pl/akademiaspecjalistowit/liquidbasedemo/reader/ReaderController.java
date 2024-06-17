package pl.akademiaspecjalistowit.liquidbasedemo.reader;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readers")
@AllArgsConstructor
public class ReaderController {

    private final ReaderRepository readerRepository;

    @GetMapping
    public List<ReaderEntity> getAllReaders() {
        return readerRepository.findAll();
    }

    @GetMapping("/ids")
    public List<ReaderCloseProjection> getReadersIds() {
        return readerRepository.findAllBy();
    }

    @GetMapping("/basic")
    public List<ReaderDto> getAllBasicInfo() {
        return readerRepository.findAllProjectedBy();
    }

    @PostMapping
    public void createBook() {
        readerRepository.saveAll(List.of(
            new ReaderEntity(UUID.randomUUID(), "Ania", "Adamowicz"),
            new ReaderEntity(UUID.randomUUID(), "Ola", "Adamczyk")));
    }

}
