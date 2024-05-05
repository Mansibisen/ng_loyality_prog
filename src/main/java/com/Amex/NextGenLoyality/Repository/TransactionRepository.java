package com.Amex.NextGenLoyality.Repository;



import com.Amex.NextGenLoyality.Models.Transaction;
import com.Amex.NextGenLoyality.Models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

    List<Transaction> findAllTransactionByUserId(String userId);

}