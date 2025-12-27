package com.example.demo.Service.Service2;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.Repository.OrderRep;
import com.example.demo.Service.OrderService;
import com.example.demo.Model.Order;
@Service
public class OrderServImpl implements OrderService{
        OrderRep repository;
        public OrderServImpl(OrderRep product){
            this.repository=product;
        }
@Override
public String updateorddetails(Order product, Long OrderId) {

    Order existingUser = repository.findById(OrderId)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + OrderId));

    // update fields
    existingUser.setPrname(product.getPrname());
    existingUser.setTotal_am(product.getTotal_am());
    existingUser.setUserId(product.getUserId());
    existingUser.setPr_Id(product.getPr_Id());
    existingUser.setQuantity(product.getQuantity());

    repository.save(existingUser);

    return "USER UPDATED SUCCESSFULLY COMPLETED!";
}
   @Override
    public List<Order> getallorddetails()
    {
        return repository.findAll();
    }
    @Override
    public Order getuserorddetails(Long OrderId){
        return repository.findById(OrderId).get();
    }
    @Override
    public String postorddetails(Order product)
    {
        repository.save(product);
        return"Create Successfully";
    }
    @Override
    public String deleteorddetails(Long OrderId)
    {
        repository.deleteById(OrderId);
        return "PRODUCT DELETE SUCCESSFULLY!";
    }
@Override
public String patchorddetails(Order product, Long OrderId) {

    Order existingUser = repository.findById(OrderId)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + OrderId));
    if(product.getPrname()!=null){
    existingUser.setPrname(product.getPrname());
    }
    if(product.getTotal_am()!=null)
    {
    existingUser.setTotal_am(product.getTotal_am());
    }
    if(product.getQuantity()!=null)
    {
    existingUser.setQuantity(product.getQuantity());
    }
    if(product.getUserId()!=null)
    {
    existingUser.setUserId(product.getUserId());
    }
    if(product.getPr_Id()!=null)
    {
    existingUser.setPr_Id(product.getPr_Id());
    }

    repository.save(existingUser);


    repository.save(existingUser);

    return "USER PATCHED SUCCESSFULLY COMPLETED!";
}
}


