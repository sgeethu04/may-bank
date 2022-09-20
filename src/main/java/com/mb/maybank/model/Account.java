package com.mb.maybank.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

	private int id;

	private String accountNumber;

	private double currentBalance;

	private String bankName;

	private String ownerName;

	public Account(int id, String accountNumber, double currentBalance, String bankName, String ownerName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.bankName = bankName;
		this.ownerName = ownerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
