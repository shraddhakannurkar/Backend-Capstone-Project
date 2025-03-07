package main.java.com.Scaler.EcomProductService.repository;

import main.java.com.scaler.EcomProductService.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PriceRepository extends JpaRepository<Price, UUID> {
}