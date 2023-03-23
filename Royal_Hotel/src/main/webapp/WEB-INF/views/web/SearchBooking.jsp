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
		<form action="" method="post" class="form_search">
			<div class="searchbooking_search">
				<div class="searchform_search">
					<div class="input">
						<h4>Date Checkin</h4>
						<input type="date" id="datecheckin" />
					</div>

					<div class="input">
						<h4>Date Checkout</h4>
						<input type="date" id="datecheckout" />
					</div>

					<div class="input">
						<h4>Rooms</h4>
						<div class="btn-quantity-room">
							<i class="fa-solid fa-hotel"></i> <input type="number" id="room"
								min="0" max="100" />
						</div>
					</div>

					<div class="btn-search">
						<button>
							<i class="fa-solid fa-magnifying-glass"></i>
							<p class="search-text">Search</p>
						</button>
					</div>
				</div>
			</div>
		</form>
		<div class="roomtype">
			<div class="list_roomtype">
				<c:forEach var="item" items="${roomtypelist }">
					<div class="detail_roomtype">
						<div class="img_roomtype">
							<img src="./template/web/assets/img/bathroom.png">
						</div>
						<div class="context_roomtype">
							<h4>${item.nameRoomType }</h4>
							<h5>${item.description }</h5>
							<div class="roomtype_price">
								<div class="min_price">
									<h5>Giá phòng</h5>
									<p>
										${item.price } <span>/ đêm </span>
									</p>
								</div>
								<div class="btn_room_book">
									<button>Chọn Phòng</button>

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
					<h6>Ngày Chechin: 17/03/2023</h6>
					<h6>Ngày Chechout: 20/03/2023</h6>
				</div>
				<hr />
				<div class="info_room">
					<h5>Thông tin phòng</h5>
				</div>
				<hr />
				<div class="info_total_price">
					<div class="detail_total_price">
						<h5>Tổng cộng:</h5>
						<div class="total_price">0 VND</div>
					</div>
					<div class="btn_booking">
						<button>ĐẶT NGAY</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>