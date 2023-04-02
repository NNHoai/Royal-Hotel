package com.fa.mock.Services.admin.HotelServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.mock.Dao.admin.BankDao;
import com.fa.mock.Model.admin.Bank;
import com.fa.mock.Services.admin.BankService;

@Service
public class BankServicelmpl implements BankService {
	@Autowired
	BankDao bankdao;

	@Override
	public List<Bank> getDataBank() {
		return bankdao.getDataBank();
	}

	@Override
	public int insertBank(Bank bank) {
		return bankdao.insertBank(bank);
	}

	@Override
	public Bank getBankByID(String id) {
		return bankdao.getBankByID(id);
	}

	@Override
	public int updateBank(Bank bank) {
		return bankdao.updateBank(bank);
	}

//	@Override
//	public int updateRoom(Room room) {
//		return roomdao.updateRoom(room);
//	}
//
//	@Override
//	public int insertRoom(Room room) {
//		return roomdao.insertRoom(room);
//	}
//
//	@Override
//	public Room getRoomByID(String id) {
//		return roomdao.getRoomByID(id);
//	}

}
