package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
	    public User loginUser(@RequestParam String email, @RequestParam String password) {
	        return userService.loginUser(email, password);
	    }

	    // Novo endpoint: atualizar usuário
	    @PutMapping("/{id}")
	    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
	        User updatedUser = userService.updateUser(id, userDetails);
	        return ResponseEntity.ok(updatedUser);
	    }
}
