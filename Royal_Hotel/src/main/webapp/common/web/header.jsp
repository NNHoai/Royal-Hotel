<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../common/taglib.jsp"%>
<!--header-->
<div class="logo_header">
	<img src="<c:url value='/template/web/assets/img/logo.jpg'/>" />
</div>
<div class="menu_header">
	<div class="menu_left">
		<li><a href="#home">HOME</a></li>
		<li><a href="#about">ABOUT US</a></li>
		<li><a href="#contact">CONTACTS</a></li>
	</div>
	<div class="menu_right">
		<c:choose>
			<c:when test="${not empty sessionScope.custommer}">
				<div class="dropdown">
					<button class="dropbtn">
					<i class="fa-solid fa-circle-user logo-user"></i> <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
						<p>${sessionScope.custommer.userName }</p>
						<a id="editprofile" href="<c:url value='/thong-tin'/>"><i
							class="fa fa-user"></i> Thônng tin</a> <a
							href="<c:url value='/dang-xuat'/>"><i
							class="fa-solid fa-right-from-bracket"></i> Đăng xuất</a>
					</div>
				</div>
			</c:when>
			<c:otherwise>
				<div class="dropdown">
					<button class="dropbtn" onclick="location.href = '<c:url value="/dang-nhap"/>'">
						<i class="fa-solid fa-circle-user"></i> <i class="fa fa-caret-down"></i>
					</button>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</div>