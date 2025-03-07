package main.java.com.Scaler.EcomProductService.service;

import main.java.com.scaler.EcomProductService.client.UserServiceClient;
import main.java.com.scaler.EcomProductService.dto.ProductListResponseDTO;
import main.java.com.scaler.EcomProductService.dto.ProductRequestDTO;
import main.java.com.scaler.EcomProductService.dto.ProductResponseDTO;
import main.java.com.scaler.EcomProductService.exception.InvalidTitleException;
import main.java.com.scaler.EcomProductService.exception.ProductNotFoundException;
import main.java.com.scaler.EcomProductService.mapper.ProductMapper;
import main.java.com.scaler.EcomProductService.model.Product;
import main.java.com.scaler.EcomProductService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private final UserServiceClient userServiceClient;

    public ProductServiceImpl(ProductRepository productRepository, UserServiceClient userServiceClient) {
        this.productRepository = productRepository;
        this.userServiceClient = userServiceClient;
    }

    @Override
    public ProductListResponseDTO getAllProducts() throws Exception {
        List<Product> products = productRepository.findAll();
        ProductListResponseDTO productListResponseDTO = ProductMapper.convertProductsToProductListResponseDTO(products);
        return productListResponseDTO;
    }

    @Override
    public ProductResponseDTO getProductById(int id) {
        return null;
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        return null;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }

    @Override
    public Product updateProduct(int id, Product updatedProduct) {
        return null;
    }

    @Override
    public ProductResponseDTO findProductByTitle(String title) throws ProductNotFoundException {
        // findAll() -> list of all products
        // findById() -> product by productId
        if(title == null || title.isEmpty()){
            throw new InvalidTitleException("title is invalid");
        }
        Product product = productRepository.findByTitle(title);
        if(product == null){
            throw new ProductNotFoundException("Product with given title is not available");
        }
        ProductResponseDTO responseDTO = ProductMapper.convertProductToProductResponseDTO(product);
        return responseDTO;
    }


}
