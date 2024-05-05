package com.Amex.NextGenLoyality.Repository;



import com.Amex.NextGenLoyality.Models.Reward;
import com.Amex.NextGenLoyality.Models.User;
import org.springframework.data.repository.CrudRepository;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RewardRepository extends CrudRepository<Reward, Integer> {

}