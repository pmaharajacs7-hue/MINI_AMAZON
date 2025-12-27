package com.example.demo.Service;
import com.example.demo.Model.User;
import java.util.List;

public interface UserSer {
    public String postadmindetails(User user);
    public String postuserdetails(User user);
    public String deleteuserdetails(Long userId);
    public String deleteadmindetails(Long userId);
    public String updateuserdetails(User user,Long userId);
    public String updateadmindetails(User user,Long userId);
    public String patchadmindetails(User user,Long userId);
    public String patchuserdetails(User user,Long userId);
    public User getuserdetails(Long userId);
    public User  getadmindetails(Long userId);
    public List<User> getalluserdetails();

}
