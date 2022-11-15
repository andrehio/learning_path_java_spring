package data_jpa.repository;

import data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> { //<Classe referencia, Id>

}
