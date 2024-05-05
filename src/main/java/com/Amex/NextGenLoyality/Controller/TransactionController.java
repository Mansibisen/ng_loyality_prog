package com.Amex.NextGenLoyality.Controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.Amex.NextGenLoyality.Models.Transaction;
import com.Amex.NextGenLoyality.Models.User;
import com.Amex.NextGenLoyality.Repository.TransactionRepository;
import com.Amex.NextGenLoyality.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	UserRepository userRepository;



	@GetMapping("/transactions")
	public List<Transaction> index(@RequestParam String userId) {

		List<Transaction> transactions = transactionRepository.findAllTransactionByUserId(userId);

		return transactions;


	}

	@PostMapping("/transactions/add")
	Transaction newEmployee(@RequestBody Transaction t) {
		String userId = t.getUserid();
		User user = userRepository.findById(userId);
		user.setloyality(user.getloyality() + t.getamount()*0.5);
		userRepository.save(user);
		return transactionRepository.save(t);
	}

}