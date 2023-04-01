package com.fa.mock.Services.web;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.web.RoomType;

@Service
public interface RoomTypeService {

	List<RoomType> getDataRoomType();

}
