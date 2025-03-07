package main.java.com.Scaler.EcomProductService.repository;

import main.java.com.scaler.EcomProductService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}