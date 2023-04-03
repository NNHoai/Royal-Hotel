package com.fa.mock.Dao.employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fa.mock.Mapper.employee.CheckinMapper;
import com.fa.mock.Model.employee.CheckinOut;
import com.fa.mock.Model.web.DetailBooking;

@Repository
public class CheckinOutDao {
	@Autowired
	JdbcTemplate _jdbctemplate;

	public List<CheckinOut> getDataCheckin() {
		List<CheckinOut> list = new ArrayList<CheckinOut>();
		String sql = "select ck.IDBooking, r.IDRoom, r.NameRoom, c.FullName, ck.TimeCheckin, ck.Timecheckout"
				+ " from CHECKIN ck join BOOKING b on ck.IDBooking = b.IDBooking join BOOKINGDETAIL bd on ck.IDBooking = bd.IDBooking"
				+ "	join ROOM r on bd.IDRoom = r.IDRoom join CUSTOMER c on b.IDCustomer = c.IDCustomer";
		list = _jdbctemplate.query(sql, new CheckinMapper());
		return list;
	}
	
	public int insertCheckin(CheckinOut checkinOut) {
		String sql = "INSERT INTO CHECKIN VALUES ('" + checkinOut.getIdBooking() + "','" + checkinOut.getTimeCheckin() + "','"
				+ checkinOut.getTimeCheckout()   +"')";
		int n = _jdbctemplate.update(sql);
		return n;
	}

	public int updateCheckin(String idBooking, String idRoom, String timeCheckin) {
		String sql = "UPDATE CHECKIN SET TimeCheckin='" + timeCheckin + "' WHERE IDBooking='" + idBooking + "'";
		int n = _jdbctemplate.update(sql);
		updateStatusNotEmpty(idRoom);
		return n;
	}

	public int updateCheckout(String idBooking, String idRoom, String timeCheckout) {
		String sql = "UPDATE CHECKIN SET TimeCheckout='" + timeCheckout + "' WHERE IDBooking='" + idBooking + "'";
		int n = _jdbctemplate.update(sql);
		updateStatusEmpty(idRoom);
		return n;
	}
	
	public int updateStatusEmpty( String idRoom) {
		String sql = "UPDATE ROOM SET Status=N'Trống' WHERE IDRoom='" + idRoom + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}
	
	public int updateStatusNotEmpty( String idRoom) {
		String sql = "UPDATE ROOM SET Status=N'Đã đặt' WHERE IDRoom='" + idRoom + "'";
		int n = _jdbctemplate.update(sql);
		return n;
	}
}
