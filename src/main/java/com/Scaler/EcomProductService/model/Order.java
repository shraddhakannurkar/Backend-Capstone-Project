package main.java.com.Scaler.EcomProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "ECOM_ORDER")
public class Order extends BaseModel{
    private double price;
    @ManyToMany
    private List<Product> products; // ECOM_ORDER_PRODUCTS
}