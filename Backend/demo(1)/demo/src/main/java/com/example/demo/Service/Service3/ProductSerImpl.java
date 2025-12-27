package com.example.demo.Service.Service3;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRep;
import com.example.demo.Service.ProductSer;
@Service
public class ProductSerImpl implements ProductSer {
    private final ProductRep repository;
    public ProductSerImpl(ProductRep repository) {
        this.repository = repository;
    }
    @Override
    public Product getuserprodetails(Long pr_Id){
        return repository.findById(pr_Id).get();
    }
    @Override
    public List<Product> getallprodetails()
    {
        return repository.findAll();
    }
    @Override
    public String postprodetails(Product product)
    {
        repository.save(product);
        return"Create Successfully";
    }
    @Override
    public String deleteprodetails(Long pr_Id)
    {
        repository.deleteById(pr_Id);
        return "PRODUCT DELETE SUCCESSFULLY!";
    }
@Override
public String updateprodetails(Product product, Long pr_Id) {

    Product existingUser = repository.findById(pr_Id)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + pr_Id));

    // update fields
    existingUser.setprname(product.getprname());
    existingUser.setcategory(product.getcategory());
    existingUser.setamount(product.getamount());
    existingUser.setuserId(product.getuserId());
    existingUser.setquan(product.getquan());

    repository.save(existingUser);

    return "USER UPDATED SUCCESSFULLY COMPLETED!";
}
@Override
public String patchprodetails(Product product, Long pr_Id) {

    Product existingUser = repository.findById(pr_Id)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + pr_Id));
    if(product.getprname()!=null){
    existingUser.setprname(product.getprname());
    }
    if(product.getcategory()!=null)
    {
    existingUser.setcategory(product.getcategory());
    }
    if(product.getquan()!=null)
    {
    existingUser.setquan(product.getquan());
    }
    if(product.getamount()!=null)
    {
    existingUser.setamount(product.getamount());
    }
    if(product.getuserId()!=null)
    {
    existingUser.setuserId(product.getuserId());
    }

    repository.save(existingUser);


    repository.save(existingUser);

    return "USER PATCHED SUCCESSFULLY COMPLETED!";
}
}