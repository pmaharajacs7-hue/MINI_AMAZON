package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Order;
public interface OrderRep extends JpaRepository<Order,Long>{
    
}
