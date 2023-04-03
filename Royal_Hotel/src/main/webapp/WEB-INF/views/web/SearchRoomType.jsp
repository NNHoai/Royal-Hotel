<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../common/taglib.jsp"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>
	<!-- maincontent -->
	<div class="maincontent_search">
		<form action='/Royal_Hotel/loai-phong' method="post" class="form_search">
			<div class="searchbooking_search">
				<div class="searchform_search">
					<div class="input">
						<h4>Ngày Checkin</h4>
						<input type="date" id="dateCheckin" name="dateCheckin" value="${dateCheckin }"/>
					</div>

					<div class="input">
						<h4>Ngày Checkout</h4>
						<input type="date" id="dateCheckout" name="dateCheckout" value="${dateCheckout }"/>
					</div>

					<div class="input">
						<h4>Số phòng</h4>
						<div class="btn-quantity-room">
							<i class="fa-solid fa-hotel"></i> <input type="number" id="room"
								min="1" max="100" value="1"/>
						</div>
					</div>

					<div class="btn-search">
						<button type="submit">
							<i class="fa-solid fa-magnifying-glass"></i>
							<p class="search-text">Tìm kiếm</p>
						</button>
					</div>
				</div>
			</div>
		</form>
		<div class="roomtype">
			<div class="list_roomtype">
				<c:forEach var="item" items="${roomtypelist }">
					<div class="detail_roomtype" id="${item.idRoomType }">
						<div class="img_roomtype">
							<img src="./template/web/assets/img/bathroom.png">
						</div>
						<div class="context_roomtype">
							<div>
								<h4 class="nameRoomtype">${item.nameRoomType }</h4>
								<h5 class="description">${item.description }</h5>
							</div>
							<div class="roomtype_price">
								<div class="min_price">
									<h5>Giá phòng</h5>
									<div class="price_room">
										<p class="price"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${item.price }" /></p> 
										<p>&nbsp; VNĐ <span>/ đêm </span></p>
									</div>
								</div>
								<div class="btn_room_book">
									<button class="btnbooking" onclick="addroom('${item.idRoomType }')">Chọn Phòng</button>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<div class="info_booking">
				<h4>Thông tin đặt phòng</h4>
				<hr />
				<div class="info_date">
					<h5>Royal Hotel Đà Nẵng</h5>
					<h6>Ngày Checkin: ${dateCheckin }</h6>
					<h6>Ngày Checkout: ${dateCheckout }</h6>
				</div>
				<hr />
				<div class="info_room" id="info_room">
					<h5>Thông tin phòng</h5>
					<div class="list_info_room" id="list_info_room">
              
          			</div>
				</div>
				<hr />
				<div class="info_total_price">
					<div class="detail_total_price">
						<h5>Tổng cộng:</h5>
						<div class="total_price"  id="total_price">0 VND</div>
					</div>
					<div class="btn_booking">
						<form action="<c:url value='/dat-phong'/>" method="post">
							<input type="text" id="listroom" name="listroom" hidden/>
							<button type="submit" id="btnbooking" disabled <%-- onclick="location.href =  '<c:url value="/dat-phong"/>' --%>">ĐẶT NGAY</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>