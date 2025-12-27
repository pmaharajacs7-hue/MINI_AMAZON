package com.example.demo.Service.Service1;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Model.User;
import com.example.demo.Service.UserSer;
import java.util.List;
@Service
public class UserSerImpl implements UserSer {

    private final UserRepository repository;

    public UserSerImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public String postadmindetails(User user) {
        repository.save(user);
        return "SIGN IN SUCCESSFULLY COMPLETED!";
    }
    @Override
    public String postuserdetails(User user)
    {
        repository.save(user);
        return "SIGN IN SUCCESSFULLY COMPLETED!";
    }
    @Override
    public String deleteuserdetails(Long userId)
    {
    repository.deleteById(userId);
    return "Deleted Successfully!";
}
    @Override
    public String deleteadmindetails(Long userId)
    {
    repository.deleteById(userId);
    return "Deleted Successfully!";
}
@Override
public String updateuserdetails(User user, Long userId) {

    User existingUser = repository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

    // update fields
    existingUser.setname(user.getname());
    existingUser.setphnum(user.getphnum());
    existingUser.setroll(user.getroll());

    repository.save(existingUser);

    return "USER UPDATE SUCCESSFULLY COMPLETED!";
}

@Override
public String updateadmindetails(User user, Long userId) {

    User existingAdmin = repository.findById(userId)
            .orElseThrow(() -> new RuntimeException("Admin not found with id: " + userId));

    existingAdmin.setname(user.getname());
    existingAdmin.setphnum(user.getphnum());
    existingAdmin.setroll(user.getroll());

    repository.save(existingAdmin);

    return "ADMIN UPDATE SUCCESSFULLY COMPLETED!";
}
  @Override
  public String patchadmindetails(User user,Long userId){
        User existingAdmin = repository.findById(userId)
            .orElseThrow(() -> new RuntimeException("Admin not found with id: " + userId));
    if(user.getname()!=null){
    existingAdmin.setname(user.getname());
    }
    if(user.getphnum()!=null)
    {
    existingAdmin.setphnum(user.getphnum());
    }
    if(user.getroll()!=null)
    {
    existingAdmin.setroll(user.getroll());
    }

    repository.save(existingAdmin);

    return "USER PATCH SUCCESSFULLY COMPLETED!";
}
  @Override
  public String patchuserdetails(User user,Long userId){
        User existingAdmin = repository.findById(userId)
            .orElseThrow(() -> new RuntimeException("Admin not found with id: " + userId));
    if(user.getname()!=null){
    existingAdmin.setname(user.getname());
    }
    if(user.getphnum()!=null)
    {
    existingAdmin.setphnum(user.getphnum());
    }
    if(user.getroll()!=null)
    {
    existingAdmin.setroll(user.getroll());
    }

    repository.save(existingAdmin);

    return "ADMIN PATCH SUCCESSFULLY COMPLETED!";
}
@Override
public User getuserdetails(Long userId)
{
    return repository.findById(userId).get();
}
@Override
public User getadmindetails(Long userId){
    return repository.findById(userId).get();
}
@Override
public List<User>getalluserdetails(){
    return repository.findAll();
}

}

