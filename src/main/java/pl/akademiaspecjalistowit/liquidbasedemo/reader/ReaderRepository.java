package pl.akademiaspecjalistowit.liquidbasedemo.reader;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, Long> {

    List<ReaderCloseProjection> findAllBy();

    List<ReaderDto> findAllProjectedBy();
}
