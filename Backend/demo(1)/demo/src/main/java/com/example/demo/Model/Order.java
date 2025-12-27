package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Order_details")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long orderId;

    private Long pr_Id;
    private String prname;
    private Long userId;
    private String quantity;
    private String total_am;
    public Order(){}
    public Order(String quan,String am,Long userId,Long pr_Id,String prname){
            this.quantity=quan;
            this.total_am=am;
            this.userId=userId;
            this.pr_Id=pr_Id;
            this.prname=prname;
        }

public Long getOrderId() {
        return orderId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal_am() {
        return total_am;
    }

    public void setTotal_am(String totalAmount) {
        this.total_am = totalAmount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPr_Id() {
        return pr_Id;
    }

    public void setPr_Id(Long productId) {
        this.pr_Id= productId;
    }
    public void setPrname(String prname)
    {
        this.prname=prname;
    }
    public String getPrname()
    {
        return prname;
    }


}