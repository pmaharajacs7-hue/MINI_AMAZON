package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_details1")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ph_num")
    private String phoneNumber;
    @JsonProperty("Role")
    private String Role;

    public User(){}
    public User(String ph,String Role,String name)
    {
        this.phoneNumber=ph;
        this.Role=Role;
        this.name=name;
    }

    public Long getId()
    {
        return userId;
    }
    public void setuserId(Long userId)
    {
        this.userId=userId;
    }
    public void setphnum(String ph_num)
    {
        this.phoneNumber=ph_num;
    }
    public String getphnum()
    {
        return phoneNumber;
    }
        public void setroll(String Role)
    {
        this.Role=Role;
    }
    public String getroll()
    {
        return Role;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }

}
