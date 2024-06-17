package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.akademiaspecjalistowit.liquidbasedemo.statistics.BorrowBooks;

import java.util.List;

@Repository
public interface BorrowRepository extends JpaRepository<BorrowEntity,Long> {

}
