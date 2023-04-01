package com.fa.mock.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.RoomType;

public class MapperRoomType implements 	RowMapper<RoomType>{
	@Override
	public RoomType mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoomType roomType = new RoomType();
		roomType.setIdRoomType(rs.getString("IDRoomType"));
		roomType.setNameRoomType(rs.getString("NameRoomType"));
		roomType.setPrice(rs.getFloat("Price"));
		roomType.setDescription(rs.getString("Description"));
		return roomType;
	}
}
