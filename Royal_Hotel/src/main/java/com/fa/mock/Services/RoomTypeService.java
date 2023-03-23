package com.fa.mock.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fa.mock.Model.RoomType;

@Service
public interface RoomTypeService {

	List<RoomType> getDataRoomType();

}
