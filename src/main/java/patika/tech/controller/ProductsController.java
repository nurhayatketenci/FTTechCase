package patika.tech.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patika.tech.model.Product;
import patika.tech.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	 @GetMapping("/findbyexpirationdatebefore")
	 public ResponseEntity<?> findByExpirationDateBefore(LocalDate date){
		 return ResponseEntity.ok(this.productService.findByExpirationDateBefore(date));
	 }
	 
	 @GetMapping("/findbyexpirationdateafter")
	 public ResponseEntity<?> findByExpirationDate(LocalDate date){
		 return ResponseEntity.ok(this.productService.findByExpirationDateAfterOrExpirationDateIsNull(date));
	 }
	 
}
