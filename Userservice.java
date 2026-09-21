package Online.Shopping.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Online.Shopping.Management.System.dto.userdto;
import Online.Shopping.Management.System.entity.user;
import Online.Shopping.Management.System.repository.userRepository;

@Service

public class Userservice {
	@Autowired

    private userRepository userRepository;

    public userdto saveuser(userdto userDTO) {

        user user = new user();

        user.setName(userDTO.getName());

        user.setEmail(userDTO.getEmail());

        user.setPassword(userDTO.getPassword());

        user.setPhone(userDTO.getPhone());

        userRepository.save(user);

        return userDTO;

    }

	public List<user> getUsers() {
		
		return userRepository.findAll();
	}

	public user getUserById(Long id) {
		return userRepository.findById(id).orElse(null);

	   }

	public user updateUser(Long id, userdto userDTO) {
		
		user user = userRepository.findById(id).orElse(null);
		if (user != null) {

	        user.setName(userDTO.getName());

	        user.setEmail(userDTO.getEmail());

	        user.setPassword(userDTO.getPassword());

	        user.setPhone(userDTO.getPhone());
		}
	        return userRepository.save(user);

	}
	public user deleteUserById(Long id) {

	    user user = userRepository.findById(id).orElse(null);

	    if (user != null) {
	        userRepository.deleteById(id);
	        return user;
	    }

	    return null;
	}
	

}
