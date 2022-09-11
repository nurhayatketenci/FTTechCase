package patika.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.tech.model.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
