package com.Amex.NextGenLoyality.Repository;



import com.Amex.NextGenLoyality.Models.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {


    @Query("SELECT u FROM Transaction u WHERE u.customer_id = :id")
    List<Transaction> findAllByCustomerId(@Param("id") int id);

    List<Transaction> findByCustomer_id(int id);

    

}