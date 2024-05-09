package com.Amex.NextGenLoyality.Repository;




import com.Amex.NextGenLoyality.Models.Cart;
import com.Amex.NextGenLoyality.Models.Customer;
import com.Amex.NextGenLoyality.Models.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CartRepository extends CrudRepository<Cart, Integer> {

    @Query("SELECT u FROM Cart u WHERE u.customer_id = 1")
    List<Cart> findAllByCustomerId(int id);

}
