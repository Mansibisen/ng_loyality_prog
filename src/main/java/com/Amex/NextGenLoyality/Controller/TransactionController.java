package com.Amex.NextGenLoyality.Controller;

import java.util.List;

import com.Amex.NextGenLoyality.Models.Customer;
import com.Amex.NextGenLoyality.Models.Transaction;
import com.Amex.NextGenLoyality.Repository.TransactionRepository;
import com.Amex.NextGenLoyality.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	CustomerRepository customerRepository;



	@GetMapping("/transactions")
	public List<Transaction> index(@RequestParam int customerId) {

		List<Transaction> transactions = transactionRepository.findAllByCustomerId(customerId);

		return transactions;


	}

	@PostMapping("/transactions/add")
	Transaction newEmployee(@RequestBody Transaction t) {
		int customerId = t.getCustomer_id();
		Customer customer = customerRepository.findById(customerId).get();

		customer.setLoyalty_points( customer.getLoyalty_points() + t.getLoyalty_points_earned() );
		customerRepository.save(customer);
		return transactionRepository.save(t);
	}

}