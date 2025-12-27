package com.example.demo.Service;
import com.example.demo.Model.Product;
import java.util.List;
public interface ProductSer {
    public String postprodetails(Product product);
    public String deleteprodetails(Long pr_Id);
    public String updateprodetails(Product product,Long pr_Id);
    public String patchprodetails(Product product,Long pr_Id);
    public List<Product>getallprodetails();
    public Product getuserprodetails(Long pr_Id);
}
