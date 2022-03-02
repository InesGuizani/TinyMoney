package tn.esprit.spring.entities.Repository;



import javax.transaction.Transaction;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TransactionRepository extends CrudRepository<Transaction,Long> {

}
