package tn.esprit.spring.entities.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Account;
@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {

}
