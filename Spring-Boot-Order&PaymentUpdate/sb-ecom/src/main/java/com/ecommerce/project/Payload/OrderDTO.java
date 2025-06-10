package com.ecommerce.project.Payload;

import com.ecommerce.project.model.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long orderId;
    private String email;
    private List<OderItemDTO> orderItems;
    private LocalDate orderDate;
    private PaymentDTO payment;
    private Double totalAmount;
    private String orderStatus;

    public void setAddressId(Long addressId) {
    }
}
