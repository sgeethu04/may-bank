package com.mb.maybank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mb.maybank.exception.CustomErrorType;
import com.mb.maybank.model.Account;
import com.mb.maybank.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;


	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Account>> listAllAccounts() {
		List<Account> accounts = accountService.findAllAccounts();
		if (accounts.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// I many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getAccountDetails(@PathVariable("id") int id) {
		Account account = accountService.findById(id);
		if (account == null) {
			
			return new ResponseEntity(new CustomErrorType("Account with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

}
