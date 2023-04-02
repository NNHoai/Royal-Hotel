
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
#modal-delete1 .modal-header {
	background-color: #ff9933;
}

#modal-delete1 h4 {
	font-size: 18px;
	color: #f9f9d7;
}
</style>

<h2 style="margin-top: 10px;">BOOKING MANAGE</h2>
<a style="float: right; margin: 10px;"
	href="/Royal_Hotel/admin/roomtype" class="btn btn-secondary">List
	RoomType</a>


<div class="form-group" style="margin: 25px;">
	<table class="table table-hover" style="width: 80%; margin-left: 100px">
		<thead class="thead-light">
			<tr>
				<th>No</th>
				<th>IDBooking</th>
				<th>NameRoom</th>
				<th>NameCustomer</th>
				<th>TimCheckin</th>
				<th>TimeCheckout</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="checkin" items="${ListCheckin}" varStatus="loop">
				<tr>
					<td>${loop.index + 1}</td>
					<td>${checkin.idBooking}</td>
					<td>${checkin.nameRoom}</td>
					<td>${checkin.nameCustomer}</td>
					<td>${checkin.timeCheckin}</td>
					<td>${checkin.timeCheckout}</td>

					<td><a href="/Royal_Hotel/employee/checkin?idBooking=${checkin.idBooking}&idRoom=${checkin.idRoom}" class="btn btn-danger btn-delete-user1"
						style="float: right;">Checkin</a></td>

					<td><a href="/Royal_Hotel/employee/checkout?idBooking=${checkin.idBooking}&idRoom=${checkin.idRoom}" class="btn btn-danger btn-delete-user1"
						style="float: right;">Checkout</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>
<jsp:include page="/common/admin/roomdelete.jsp" />