package patika.tech.service;

import java.time.LocalDate;
import java.util.List;
import patika.tech.model.Product;

public interface ProductService {
    List<Product> findByExpirationDateBefore(LocalDate date);
    List<Product> findByExpirationDateAfterOrExpirationDateIsNull(LocalDate date);

}
