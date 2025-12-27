package com.example.demo.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long pr_Id;
    @JsonProperty("pr_name")
   private  String pr_name;
   @JsonProperty("category")
   private  String category;
    @JsonProperty("Quantity")
   private  String quantity;
    @JsonProperty("Amount")
    private String amount;
    @JsonProperty("userId")
   private  Long userId;
    public Product(){}
    public Product(String pr_name,String category, String quan,String am,Long userId)
    {
        this.pr_name=pr_name;
        this.category=category;
        this.quantity=quan;
        this.amount=am;
        this.userId=userId;
    }

    public Long getId()
    {
        return pr_Id;
    }
    public void setuserId(Long userId)
    {
        this.userId=userId;
    }
    public Long getuserId()
    {
        return userId;
    }
    public String getprname()
    {
        return pr_name;
    }
    public void setcategory(String cat)
    {
        this.category=cat;
    }
    public String getcategory()
    {
        return category;
    }
    public void setquan(String quan)
    {
        this.quantity=quan;
    }
    public String getquan()
    {
        return quantity;
    }
public void setamount(String amou)
    {
        this.amount=amou;
    }
    public String getamount()
    {
        return amount;
    }
    public void setprname(String name)
    {
        this.pr_name=name;
    }



}