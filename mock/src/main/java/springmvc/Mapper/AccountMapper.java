package springmvc.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.SignUpForm;



public class AccountMapper implements RowMapper<SignUpForm>{
	@Override
	public SignUpForm mapRow(ResultSet rs, int rowNum) throws SQLException {
		SignUpForm signUpForm = new SignUpForm();
		signUpForm.setUserName(rs.getString("UserName"));
		signUpForm.setPassword(rs.getString("PassWord"));
		return signUpForm;
	}
}