package main.java.com.Scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorResponseDTO {
    private String message;
    private int messageCode;
}
