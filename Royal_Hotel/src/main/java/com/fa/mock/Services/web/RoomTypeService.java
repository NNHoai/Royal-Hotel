package com.fa.mock.Services.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.web.RoomType;

@Service
public interface RoomTypeService {

	List<RoomType> searchRoomTypes(LocalDate dateCheckin, LocalDate dateCheckout);
	RoomType getRoomTypeById(String id);
}
