package service;

import org.springframework.beans.factory.annotation.Autowired;

import model.User;
import repository.UserRepository;

public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
