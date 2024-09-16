package org.example.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class InvoiceCreationModel  {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @NotBlank(message = "Location is mandatory")
    private String location;

    @Min(value = 0, message = "Amount must be greater than or equal to 0")
    private Double amount;

    @NotNull(message = "File cannot be null")
    private MultipartFile file;
}
