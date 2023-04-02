<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="op">
	<img src="<c:url value='/template/admin/img/logo.jpg'/>" alt="abc" style="width: 90%; border-radius: 50%;">

</div>
<ul class="nav nav-pills flex-column ">
	<li class="nav-item"><a class="nav-link" href="/Royal_Hotel/admin/home">About Me</a></li>
	<li class="nav-item"><a class="nav-link" href="/Royal_Hotel/admin/employee">Employee</a></li>
	<li class="nav-item"><a class="nav-link" href="/Royal_Hotel/admin/room">Room & RoomType</a></li>
	<li class="nav-item"><a class="nav-link" href="/Royal_Hotel/admin/pricebytime">PriceByTime</a>
	</li>
	<li class="nav-item"><a class="nav-link" href="#">Services</a></li>
	<li class="nav-item"><a class="nav-link" href="/Royal_Hotel/admin/bank">Bank</a></li>
	<li class="nav-item">
		<div class="dropdown dropright">
			<button type="button" class="btn btn-link size  dropdown-toggle"
				data-toggle="dropdown">Statistic</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="/Royal_Hotel/admin/empty">Room</a> <a class="dropdown-item"
					href="#">Revence</a> <a class="dropdown-item" href="#">Customer
					Information</a>
			</div>
	</li>
</ul>