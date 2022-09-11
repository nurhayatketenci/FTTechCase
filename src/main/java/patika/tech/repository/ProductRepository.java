package patika.tech.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import patika.tech.model.Comment;
import patika.tech.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByExpirationDateBefore(LocalDate date);
	List<Product> findByExpirationDateAfterOrExpirationDateIsNull(LocalDate date);

}
