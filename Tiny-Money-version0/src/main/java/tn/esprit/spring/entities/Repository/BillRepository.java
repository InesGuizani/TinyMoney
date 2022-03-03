package tn.esprit.spring.entities.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Bill;

@Repository

public interface BillRepository extends CrudRepository<Bill, Long> {

}
