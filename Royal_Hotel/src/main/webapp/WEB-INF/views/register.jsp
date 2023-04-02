<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>


</head>
<body>
	<div class="main">
		<div class="container">
			<div class="signup-content">
				<div class="signup-img"
					style="background-image: url('<c:url value="template/web/images/login-banner.jpg"/>')">
					<div class="signup-img-content">
						<h2>Register now</h2>
						<p>while seats are available !</p>
					</div>
				</div>
				<div class="signup-form">
					<form method="POST" class="register-form" id="register-form"
						action="/dang-ky">
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

</body>


</body>
</html>