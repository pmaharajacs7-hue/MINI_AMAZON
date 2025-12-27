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

import com.example.demo.Model.User;
import com.example.demo.Service.UserSer;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/SignIn")
public class UserCont {
    UserSer userser;
    public UserCont(UserSer userserv)
    {
        this.userser=userserv;
    }
@GetMapping("/user/{userId}")
public User getuser(@PathVariable Long userId)
{
    return userser.getuserdetails(userId);
}
@GetMapping("/Admin/{userId}")
public User getadmin(@PathVariable Long userId)
{
    return userser.getadmindetails(userId);
}
@GetMapping("/All")
public List<User>getalludetails()
{
    return userser.getalluserdetails();
}
@PostMapping("/User")
    public String postMethodUser(@RequestBody User user) {
        userser.postuserdetails(user);
        return "USER SIGN IN SUCCESSFULLY COMPLETED!";
    }

    @PostMapping("/Admin")
    public String postMethodAdmin(@RequestBody User user) {
        userser.postadmindetails(user);
        return "ADMIN SIGN IN SUCCESSFULLY COMPLETED!";
    }
    @DeleteMapping("/user/{userId}")
    public String deleteuser(@PathVariable Long userId)
    {
        userser.deleteuserdetails(userId);
        return "USER DELETED SUCCESSFULLY COMPLETED!";
    }
        @DeleteMapping("/Admin/{userId}")
    public String deleteadmin(@PathVariable Long userId)
    {
        userser.deleteadmindetails(userId);
        return "ADMIN DELETED SUCCESSFULLY COMPLETED!";
    }
        @PutMapping("/user/{userId}")
        public String updateuser( @RequestBody User user,@PathVariable Long userId){
        userser.updateuserdetails(user,userId);
    return "USER UPDATE SUCCESSFULLY COMPLETED!";
    }
            @PutMapping("/Admin/{userId}")
        public String updateadmin(@RequestBody User user,@PathVariable Long userId){
                    userser.updateadmindetails(user,userId);
    return "ADMIN UPDATE SUCCESSFULLY COMPLETED!";
        }
    @PatchMapping("/user/{userId}")
    public String patchuser(@RequestBody User user,@PathVariable Long userId)
    {
        if(user.getname()!=null)
        {
            userser.patchuserdetails(user,userId);
        }
        if(user.getphnum()!=null)
        {
            userser.patchuserdetails(user,userId);
        }
        if(user.getroll()!=null)
        {
            userser.patchuserdetails(user,userId);
        }
        return "USER PATCH SUCCESSFULLY COMPLETED!";
}
    @PatchMapping("/Admin/{userId}")
    public String patchadmin(@RequestBody User user,@PathVariable Long userId)
    {
        if(user.getname()!=null)
        {
            userser.patchadmindetails(user,userId);
        }
        if(user.getphnum()!=null)
        {
            userser.patchadmindetails(user,userId);
        }
        if(user.getroll()!=null)
        {
            userser.patchadmindetails(user,userId);
        }
        return "ADMIN PATCH SUCCESSFULLY COMPLETED!";
}

}
