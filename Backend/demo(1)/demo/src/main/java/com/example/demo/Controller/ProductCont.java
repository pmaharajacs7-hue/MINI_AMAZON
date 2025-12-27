package com.example.demo.Controller;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Service.ProductSer;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PRODUCT")
public class ProductCont {
    ProductSer proser;
    public ProductCont(ProductSer userserv)
    {
        this.proser=userserv;
    }
@GetMapping("/user/{pr_Id}")
public Product getuser(@PathVariable Long pr_Id)
{
    return proser.getuserprodetails(pr_Id);
}
@GetMapping("/Users")
public List<Product>getalldetails()
{
    return proser.getallprodetails();
}
@GetMapping("/Admin")
public List<Product>getalladetails()
{
    return proser.getallprodetails();
}

@PostMapping("/Admin/post")
    public String postMethodUser(@RequestBody Product product) {
        proser.postprodetails(product);
        return "PRODUCT SUCCESSFULLY CREATED!";
    }
        @PutMapping("/Admin/put/{pr_Id}")
        public String updateadmin(@RequestBody Product product,@PathVariable Long pr_Id){
                    proser.updateprodetails(product,pr_Id);
    return "PRODUCT UPDATED SUCCESSFULLY!";
        }
    @DeleteMapping("/Admin/Delete/{pr_Id}")
    public String deleteuser(@PathVariable Long pr_Id)
    {
        proser.deleteprodetails(pr_Id);
        return "PRODUCT DELETED SUCCESSFULLY!";
    }
    @PatchMapping("/Admin/patch/{pr_Id}")
    public String patchadmin(@RequestBody Product product,@PathVariable Long pr_Id)
    {
        if(product.getquan()!=null)
        {
            proser.patchprodetails(product,pr_Id);
        }
        if(product.getamount()!=null)
        {
            proser.patchprodetails(product,pr_Id);
        }
        if(product.getprname()!=null)
        {
            proser.patchprodetails(product,pr_Id);
        }
        if(product.getcategory()!=null)
        {
            proser.patchprodetails(product,pr_Id);
        }
        return "PRODUCT PATCHED SUCCESSFULLY!";
}
}
