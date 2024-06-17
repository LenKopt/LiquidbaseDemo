package pl.akademiaspecjalistowit.liquidbasedemo.statistics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BorrowBooks extends JpaRepository<BorrowsBooksStatistics, BorrowBooksCompositeId> {
    List<BorrowsBooksStatistics> getAllBy();
}
