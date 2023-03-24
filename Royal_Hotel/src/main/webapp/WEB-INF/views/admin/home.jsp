<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../common/taglib.jsp"%>
<div class="infoHotel">
	<h2>Information Hotel</h2>
	<hr>
	<form action="">
		<c:forEach var="item" items="${HotelManage }">
			<div class="form-group">
				<p>Name Hotel</p>
				<input type="Text" class="form-control" placeholder="ROYAL HOTEL"
					id="NameHotel" value="${item.nameHotel }">
			</div>
			<div class="form-group">
				<p>Address Hotel</p>
				<input type="text" class="form-control"
					placeholder="22-Nguyen Van Linh-Da Nang" id="AddressHotel" value="${item.addressHotel }">
			</div>
			<div class="form-group">
				<p>Phone Hotel</p>
				<input type="text" class="form-control" placeholder="0789999999"
					id="PhoneHotel" value="${item.phoneHotel }">
			</div>
			<div class="form-group">
				<p>Email Hotel</p>
				<input type="text" class="form-control"
					placeholder="vinhlong.lovely@gmail.com" id="EmailHotel" value="${item.emailHotel }">
			</div>
			<div class="form-group">
				<p>Fax Hotel</p>
				<input type="text" class="form-control" placeholder="012131415"
					id="EmailHotel" value="${item.faxHotel }">
			</div>
			<button type="submit" class="btn btn-primary"
				style="margin-left: 23%; background-color: rgb(25, 130, 68);">Update</button>

			<button type="submit" class="btn btn-primary"
				style="margin-left: 20%; background-color: rgb(25, 130, 68);">Cancel</button>
		</c:forEach>

	</form>
</div>