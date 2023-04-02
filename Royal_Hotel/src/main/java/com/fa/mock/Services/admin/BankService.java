package com.fa.mock.Services.admin;

import java.util.List;

import com.fa.mock.Model.admin.Bank;

public interface BankService {
	public List<Bank> getDataBank();
	public Bank getBankByID(String id);
	public int updateBank(Bank bank);
	public int insertBank(Bank bank);
}
