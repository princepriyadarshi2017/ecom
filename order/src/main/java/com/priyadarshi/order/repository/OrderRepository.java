package com.priyadarshi.order.repository;

import com.priyadarshi.order.model.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<order,Long> {

}
