package Online.Shopping.Management.System.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Online.Shopping.Management.System.dto.userdto;
import Online.Shopping.Management.System.entity.user;
import Online.Shopping.Management.System.service.Userservice;

@RestController
public class usercontroller {
	@Autowired

    private Userservice userservice;

    @PostMapping("/users/createaccount")

    public userdto saveUser(@RequestBody userdto userDTO) {

        return userservice.saveuser(userDTO);

    }
    @GetMapping("/users")

    public List<user> getUsers() {

        return userservice.getUsers();

    }
    @GetMapping("/users/get/{id}")
    public user getUserById(@PathVariable Long id) {
        return userservice.getUserById(id);
    }
    @PutMapping("/users/update/{id}")
    public user updateUser(@PathVariable Long id, @RequestBody userdto userDTO) {
        return userservice.updateUser(id, userDTO);
    }
    @DeleteMapping("/users/delete/{id}")
    public user deleteUserById(@PathVariable Long id) {
        return userservice.deleteUserById(id);
    }
}
