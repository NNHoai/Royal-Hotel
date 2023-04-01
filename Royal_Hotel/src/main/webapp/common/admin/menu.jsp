<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="op">
	<img src="<c:url value='/template/admin/img/logo.jpg'/>" alt="abc" style="width: 90%;">

</div>
<ul class="nav nav-pills flex-column ">
	<li class="nav-item"><a class="nav-link " href="/Royal_Hotel/admin/home">About Me</a></li>
	<li class="nav-item"><a class="nav-link" href="#">Employee</a></li>
	<li class="nav-item"><a class="nav-link" href="#">Room & RoomType</a></li>
	<li class="nav-item"><a class="nav-link" href="#">PriceByTime</a>
	</li>
	<li class="nav-item"><a class="nav-link" href="/Royal_Hotel/admin/Infoservice">Services</a></li>
	<li class="nav-item"><a class="nav-link" href="#">Bank</a></li>
	<li class="nav-item">
		<div class="dropdown dropright">
			<button type="button" class="btn btn-link size  dropdown-toggle"
				data-toggle="dropdown">Statistic</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Room</a> <a class="dropdown-item"
					href="#">Revence</a> <a class="dropdown-item" href="#">Customer
					Information</a>
			</div>
	</li>
</ul>