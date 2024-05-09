package com.Amex.NextGenLoyality.Repository;


import com.Amex.NextGenLoyality.Models.Cart;
import com.Amex.NextGenLoyality.Models.Transaction;
import com.Amex.NextGenLoyality.Models.Wishlist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WishlistRepository extends CrudRepository<Wishlist, Integer> {

    @Query("SELECT u FROM Wishlist u WHERE u.customer_id = 1")
    List<Wishlist> findAllByCustomerId(int id);

}