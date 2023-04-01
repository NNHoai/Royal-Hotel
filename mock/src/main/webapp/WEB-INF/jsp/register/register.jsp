<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="template/web/fonts/material-icon/css/material-design-iconic-font.min.css" />

<!-- Main css -->
<link rel="stylesheet" href="template/web/css/register.css" />

</head>
<body>
	<div class="main">
		<div class="container">
			<div class="signup-content">
				<div class="signup-img"
					style="background-image: url('template/web/images/login-banner.jpg')">
					<div class="signup-img-content">
						<h2>Register now</h2>
						<p>while seats are available !</p>
					</div>
				</div>
				<div class="signup-form">
					<form method="POST" class="register-form" id="register-form"
						action="/mock/dang-nhap">
						<div class="form-row">
							<div class="form-group">
								<div class="form-input">
									<label for="name" class="required">Họ và tên</label> <input
										type="text" name="name" id="name" />
								</div>
								<div class="form-input">
									<label for="username" class="required">Tên tài khoản</label> <input
										type="text" name="username" id="username" />
								</div>
								<div>
									<span style="color: red"> <c:if
											test="${not empty message }">
											<c:out value="${message}"></c:out>
										</c:if>
									</span>
								</div>
								<div class="form-input">
									<label for="password" class="required">Mật khẩu</label> <input
										type="password" name="password" id="password" />
								</div>
								<div class="form-input">
									<label for="email" class="required">Email</label> <input
										type="text" name="email" id="email" />
								</div>
								<div class="form-input">
									<label for="phone_number" class="required">Số điện
										thoại</label> <input type="text" name="phone" id="phone_number" />
								</div>
							</div>
						</div>

						<div class="form-submit">
							<input type="submit" value="Đăng ký" class="submit" id="submit"
								name="submit" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- JS -->
	<script src="template/web/vendor/jquery/jquery.min.js"></script>
	<script
		src="template/web/vendor/jquery-validation/dist/jquery.validate.min.js"></script>
	<script src="template/web/js/main2.js"></script>
</body>


</body>
</html>