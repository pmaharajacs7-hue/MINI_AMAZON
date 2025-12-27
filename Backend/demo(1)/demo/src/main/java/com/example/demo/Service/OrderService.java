package com.example.demo.Service;
import java.util.List;

import com.example.demo.Model.Order;
public interface OrderService {
    public String postorddetails(Order product);
    public String deleteorddetails(Long OrderId);
    public String updateorddetails(Order product,Long OrderId);
    public String patchorddetails(Order product,Long OrderId);
    public List<Order>getallorddetails();
    public Order getuserorddetails(Long OrderId);
}
