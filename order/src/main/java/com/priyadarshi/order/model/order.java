package com.priyadarshi.order.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity //for JPA entity
@Table(name = "t_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class order {

    @Id //for unique ID
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems> OrderLineItemsList;
}
