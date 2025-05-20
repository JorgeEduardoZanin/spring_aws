package project.aws.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import project.aws.entity.Product;
import project.aws.repository.ProductRepository;

@Service
public class ProductService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
		}
	
	public List<Product> listAll(){
		return productRepository.findAll();
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public void delete(Long id) {
		
		try {
		productRepository.deleteById(id);
		}catch (Exception e) {
			LOGGER.info(e.getMessage());
			throw new RuntimeException("Erro ao remover produto!");
		}
	}
	
	
}
