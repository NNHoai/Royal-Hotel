<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="POST">
		<div class="form-row">
			<div class="form-group">
				<div class="form-input">
					<label for="name" class="required">Họ và tên</label> <input
						value="${sessionScope.custommer.fullName }" type="text"
						name="name" id="name" />
				</div>
				<div class="form-input">
					<label for="username" class="required">Tên tài khoản</label> <input
						value="${sessionScope.custommer.userName }" type="text"
						name="username" id="username" readonly />
				</div>
				<div class="form-input">
					<label for="gender" class="required">Giới tính</label> 
					<select name="gender" id="gender">
						<option value = "1">Nam</option>
						<option value = "0">Nữ</option>
					</select>
					<script type="text/javascript">
					document.getElementById("gender").value = ${sessionScope.custommer.gender}
					</script>
					<%-- <input
						value="<c:choose><c:when test='${sessionScope.custommer.gender == "1"}'>Nam</c:when><c:when test='${sessionScope.custommer.gender == "0"}'>Nữ</c:when></c:choose>"
						type="text" name="gender" id="gender" /> --%>
				</div>
				<div class="form-input">
					<label for="birthday" class="required">Ngày sinh</label> <input
						value="${sessionScope.custommer.birthday }" type="text"
						name="birthday" id="birthday" />
				</div>
				<div class="form-input">
					<label for="address" class="required">Địa chỉ</label> <input
						value="${sessionScope.custommer.address }" type="text"
						name="address" id="address" />
				</div>
				<div class="form-input">
					<label for="phone" class="required">Số điện thoại</label> <input
						value="${sessionScope.custommer.phone }" type="tel" name="phone"
						id="phone" />
				</div>
				<div class="form-input">
					<label for="email" class="required">Email</label> <input
						value="${sessionScope.custommer.email }" type="email" name="email"
						id="email" />
				</div>
				<div class="form-input">
					<label for="citizenID" class="required">CCCD</label> <input
						value="${sessionScope.custommer.citizenID }" type="text"
						name="citizenID" id="citizenID" />
				</div>
			</div>
		</div>

		<div class="form-submit">
			<input type="submit" value="Cập nhật" class="submit" id="submit"
				name="submit" />
		</div>
	</form>
</body>
</html>