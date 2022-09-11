package patika.tech.service.implementations;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import patika.tech.model.Product;
import patika.tech.repository.CommentRepository;
import patika.tech.repository.ProductRepository;
import patika.tech.service.ProductService;
@Service
public class ProductManager implements ProductService{
	
	private ProductRepository productRepository;
	
	 @Autowired
	    public ProductManager(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	@Override
	public List<Product> findByExpirationDateBefore(LocalDate date) {
		return this.productRepository.findByExpirationDateBefore(date);
	}

	@Override
	public List<Product> findByExpirationDateAfterOrExpirationDateIsNull(LocalDate date) {
		return this.productRepository.findByExpirationDateAfterOrExpirationDateIsNull(date);
	}

	
	    

}
