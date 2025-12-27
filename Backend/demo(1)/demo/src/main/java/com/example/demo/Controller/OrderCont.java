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

import com.example.demo.Model.Order;
import com.example.demo.Service.OrderService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ORDER")
public class OrderCont {
    OrderService proser;
public OrderCont(OrderService userserv)
    {
        this.proser=userserv;
    }
@GetMapping("/User/{OrderId}")
public Order getuser(@PathVariable Long OrderId)
{
    return proser.getuserorddetails(OrderId);
}
@GetMapping("/Admin")
public List<Order>getalldetails()
{
    return proser.getallorddetails();
}
@PatchMapping("/Admin/patch/{OrderId}")
    public String patchadmin(@RequestBody Order product,@PathVariable Long OrderId)
    {
        if(product.getTotal_am()!=null)
        {
            proser.patchorddetails(product,OrderId);
        }
        if(product.getQuantity()!=null)
        {
            proser.patchorddetails(product,OrderId);
        }
        if(product.getPrname()!=null)
        {
            proser.patchorddetails(product,OrderId);
        }
        if(product.getUserId()!=null)
        {
            proser.patchorddetails(product,OrderId);
        }
        return "PRODUCT PATCHED SUCCESSFULLY!";
}
@PostMapping("/User/post")
    public String postMethod(@RequestBody Order product){
        proser.postorddetails(product);
        return "PRODUCT SUCCESSFULLY CREATED!";
    }
        @PutMapping("/Admin/put/{OrderId}")
        public String updateadmin(@RequestBody Order product,@PathVariable Long OrderId){
                    proser.updateorddetails(product,OrderId);
    return "PRODUCT UPDATED SUCCESSFULLY!";
        }
    @DeleteMapping("/Admin/Delete/{OrderId}")
    public String deleteuser(@PathVariable Long OrderId)
    {
        proser.deleteorddetails(OrderId);
        return "PRODUCT DELETED SUCCESSFULLY!";
    }
}
