package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);

	Optional<User> findByEmailAndPassword(String email, String password);
}
