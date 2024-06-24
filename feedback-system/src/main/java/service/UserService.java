package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.User;
import repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public User loginUser(String email, String password) {
		Optional<User> user = userRepository.findByEmailAndPassword(email, password);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new RuntimeException("Invalid login credentials");
		}
	}

	// Nova funcionalidade: atualizar usuário
	public User updateUser(Long id, User userDetails) {
		User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

		user.setUsername(userDetails.getUsername());
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		// Atualize outros campos conforme necessário

		return userRepository.save(user);
	}

}
