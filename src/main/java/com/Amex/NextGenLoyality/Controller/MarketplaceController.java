package com.Amex.NextGenLoyality.Controller;

import com.Amex.NextGenLoyality.Models.Cart;
import com.Amex.NextGenLoyality.Models.Product;
import com.Amex.NextGenLoyality.Models.Transaction;
import com.Amex.NextGenLoyality.Models.Wishlist;
import com.Amex.NextGenLoyality.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketplaceController {
//    GET: show all products
//    POST: add to wishlist
//    POST: add to cart
//    POST: BUY an item remove that pts from user
//    GET: show recommended product
//    POST: To add new products(backend only).




    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    WishlistRepository wishlistRepository;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductRepository productRepository;



    @GetMapping("/products")
    public List<Product> getAllProducts() {

        return (List<Product>) productRepository.findAll();




    }

    @PostMapping("/products/add")
    Product newProduct(@RequestBody Product p) {
        return productRepository.save(p);
    }

    @GetMapping("/wishlist")
    public List<Wishlist> getAllWishlist(@RequestParam int customerId) {

        return wishlistRepository.findAllByCustomerId(customerId);




    }

    @PostMapping("/products/wishlist/add")
    Wishlist newWishlist(@RequestBody Wishlist w) {
        return wishlistRepository.save(w);

    }

    @GetMapping("/cart")
    public List<Cart> getAllCart(@RequestParam int customerId) {

        return cartRepository.findAllByCustomerId(customerId);


    }

    @PostMapping("/products/cart/add")
    Cart newCart(@RequestBody Cart c) {

        return cartRepository.save(c);

    }
}
