package tn.esprit.spring.entities.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
