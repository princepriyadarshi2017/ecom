package com.priyadarshi.order.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_order_line_items")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primaryKey
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
