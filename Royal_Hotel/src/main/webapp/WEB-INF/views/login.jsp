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
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form login-form"
					name="LoginForm" method="post" action="/Royal_Hotel/dang-nhap" id="login-form">
					<div class="logo login100-form-title">
						<a href="#"> <img src="<c:url value='/template/web/images/logo.jpg'/>" alt="" /></a>
					</div>

					<div style="margin: 10px 0px">
						<span style="color: red"> <c:if
								test="${not empty message }">
								<c:out value="${message}"></c:out>
							</c:if>
						</span>
					</div>

					<div class="text-login">
						<span> ĐĂNG NHẬP </span>
					</div>

					<div class="wrap-input100 validate-input">
						<input value="${signUpService.userName }" class="input100"
							type="text" name="username" id="username"
							placeholder="Tên đăng nhập" /> <span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="password" name="password"
							id="password" placeholder="Mật khẩu" /> <span
							class="focus-input100"></span>
					</div>


					<div class="flex-sb-m w-full p-t-3 p-b-12">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox"
								name="remember-me" /> <label class="label-checkbox100"
								for="ckb1"> Nhớ mật khẩu </label>
						</div>

						<div>
							<a href="#" class="txt1"> Quên mật khẩu? </a>
						</div>
					</div>

					<div class="register p-b-20">
						<a href="/Royal_Hotel/dang-ky">Đăng ký tài khoản</a>
					</div>

					<div class="container-login100-form-btn">
						<input type="submit" value="Đăng nhập" class="login100-form-btn">
					</div>

					<div class="text-center p-t-20 p-b-20">
						<span class="txt2"> Hoặc </span>
					</div>

					<div class="login100-form-social flex-c-m">
						<a href="#" class="login100-form-social-item flex-c-m bg1 m-r-5">
							<i class="fa fa-facebook-f" aria-hidden="true"></i>
						</a> <a href="#" class="login100-form-social-item flex-c-m bg2 m-r-5">
							<i class="fa fa-twitter" aria-hidden="true"></i>
						</a>
					</div>
				</form>
				<div class="login100-more"
					style="background-image: url('<c:url value="/template/web/images/login-banner.jpg"/>')">
				</div>

			</div>
		</div>
	</div>
</body>
</html>