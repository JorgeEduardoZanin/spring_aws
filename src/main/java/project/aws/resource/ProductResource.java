package project.aws.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.aws.entity.Product;
import project.aws.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {

	private final ProductService productService;
	
	public ProductResource(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> listAll(){
		return ResponseEntity.ok(productService.listAll());
	}

	@PostMapping
	public ResponseEntity<Product> save(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		productService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
}

