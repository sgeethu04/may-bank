package com.mb.maybank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mb.maybank.model.Account;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	
private static List<Account> accounts;
	
	static{
		accounts= populateDummyAccounts();
	}

	public List<Account> findAllAccounts() {
		return accounts;
	}
	

	private static List<Account> populateDummyAccounts(){
		List<Account> accounts = new ArrayList<Account>();
	/*	Account account1= Account.builder()
				.id(101)
				.accountNumber("10001")
				.currentBalance(5000.00)
				.bankName("May bank")
				.ownerName("Geethu")
				.build();
				*/
		accounts.add(new Account(101,"15000021",12345.00,"May Bank","Geethu"));
		accounts.add(new Account(102,"15000022",112345.00,"May Bank","Siya"));
		return accounts;
		
	}
	
	public Account findById(int id) {
		for(Account account : accounts){
			if(account.getId() == id){
				return account;
			}
		}
		return null;
	}


}
