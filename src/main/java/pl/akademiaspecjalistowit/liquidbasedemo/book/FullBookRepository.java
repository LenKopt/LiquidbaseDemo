package pl.akademiaspecjalistowit.liquidbasedemo.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FullBookRepository extends JpaRepository<FullBookEntity, Long> {

}
