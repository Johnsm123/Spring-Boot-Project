package com.ecommerce.project.Payload;

import com.ecommerce.project.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OderItemDTO {
    private Long orderItemId;

    private ProductDTO product;

    private Integer quantity;

    private double discount;

    private double orderedProductPrice;
}
