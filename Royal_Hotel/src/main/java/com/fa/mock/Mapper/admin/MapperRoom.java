package com.fa.mock.Mapper.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fa.mock.Model.admin.Room;

public class MapperRoom implements RowMapper<Room>{
	

	public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
		Room rm = new Room();
		
		rm.setId(rs.getString("IDRoom"));
		rm.setRoomName(rs.getString("NameRoom"));
		rm.setStatus(rs.getString("Status"));
		rm.setType(rs.getString("IDRoomType"));
		return rm;
	}
	
}
