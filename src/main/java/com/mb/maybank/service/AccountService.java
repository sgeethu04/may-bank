package com.mb.maybank.service;

import java.util.List;

import com.mb.maybank.model.Account;

public interface AccountService {
	List<Account> findAllAccounts();

	Account findById(int id);
	
}
