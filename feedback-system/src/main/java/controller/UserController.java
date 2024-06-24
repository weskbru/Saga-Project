package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import model.User;
import service.UserService;

public class UserController {
	 @Autowired
	    private UserService userService;

	    @PostMapping("/register")
	    public ResponseEntity<User> registerUser(@RequestBody User user) {
	        return ResponseEntity.ok(userService.save(user));
	    }

	    @PostMapping("/login")
	    public ResponseEntity<User> loginUser(@RequestBody User user) {
	        User existingUser = userService.findByUsername(user.getUsername());
	        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
	            return ResponseEntity.ok(existingUser);
	        } else {
	            return ResponseEntity.status(401).build();
	        }
	    }
}
