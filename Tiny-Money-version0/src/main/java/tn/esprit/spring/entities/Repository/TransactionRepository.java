package tn.esprit.spring.entities.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Transaction;

@Repository

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
