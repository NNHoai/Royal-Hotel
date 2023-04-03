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
	<div class="maincontent_booking">
		<form action="/Royal_Hotel/thong-tin-dat-phong" method="post">
			
			<div class="booking">
				<div class="input_info_booking">
					<div class="head_info">
						<a href='<c:url value="/loai-phong"/>' class="back_search"><i
							class="fa-solid fa-angle-left"></i> Quay Lại</a>
						<h4>THÔNG TIN ĐẶT PHÒNG</h4>
					</div>
					<div class="add_info_booking">
						<div class="input_title">Thông tin người đặt phòng</div>
						<hr>
	
						<div class="input_info">
							<div class="input_info_detail1">
								<div class="input_info_detail2">
									<div class="input_title">Tiêu đề</div>
									<select name="title" id="title">
										<option value="mr">Ông</option>
										<option value="ms">Bà</option>
										<option value="he">Anh</option>
										<option value="she">Chị</option>
									</select>
								</div>
								<div class="input_info_detail">
									<div class="input_title">
										CCCD/CMND
										<p>*</p>
									</div>
									<input type="text" id="citizenId" class="citizenId" name="citizenId" value="${sessionScope.custommer.citizenID }">
								</div>
							</div>
							<div class="input_info_detail">
								<div class="input_title">
									Họ và tên
									<p>*</p>
								</div>
								<input type="text" class="fullnameCustommer"  id="fullnameCustommer" name="fullnameCustommer" value="${sessionScope.custommer.fullName }">
							</div>
						</div>
						<div class="input_info">
							<div class="input_info_detail">
								<div class="input_title">
									Emai
									<p>*</p>
								</div>
								<input type="email" class="email" id="email" name="email" value="${sessionScope.custommer.email }">
							</div>
							<div class="input_info_detail">
								<div class="input_title">
									Nhập lại email
									<p>*</p>
								</div>
								<input type="email" class="reemail" id="reemail" value="${sessionScope.custommer.email }">
							</div>
						</div>
						<div class="input_info">
							<div class="input_info_detail">
								<div class="input_title">
									Số điện thoại
									<p>*</p>
								</div>
								<input type="phone" class="phone" id="phone" name="phone" value="${sessionScope.custommer.phone }">
							</div>
							<div class="input_info_detail">
								<div class="input_title">
									Quốc gia
								</div>
								<input type="text" class="country">
							</div>
						</div>
						<div class="input_info">
							<div class="input_info_detail">
								<div class="input_title">Yêu cầu thêm</div>
								<textarea name="request" id="" cols="" rows="5"
									placeholder="Ví dụ: Sở thích về Giường, địa điểm đón hoặc trả khách"></textarea>
							</div>
						</div>
					</div>
					<div class="head_service">
						<div class="header_title">
							<div class="input_title">Dịch vụ</div>
							<i class="fa-solid fa-circle-plus"></i>
						</div>
						<hr>
					</div>
					<div class="policy">
						<div class="input_title">Chính sách đặt phòng</div>
						<hr>
						<div class="policy_detail">
							<h5>
								<span>Hủy:</span> Nếu hủy, thay đổi hoặc không đến, khách sẽ trả
								toàn bộ giá trị tiền đặt phòng.
							</h5>
							<h5>
								<span>Thanh toán:</span> Thanh toán toàn bộ giá trị tiền đặt
								phòng.
							</h5>
							<span>Đã bao gồm ăn sáng</span>
						</div>
					</div>
				</div>
				<div class="booking_payment">
					<div class="info_booking">
						<h4>Yêu cầu đặt phòng của bạn</h4>
						<hr />
						<div class="info_date">
							<h5>Royal Hotel Đà Nẵng</h5>
							<h6>Ngày Chechin: ${sessionScope.dateCheckin }</h6>
							<h6>Ngày Chechout: ${sessionScope.dateCheckout }</h6>
						</div>
						<hr />
						<div class="info_room">
							<h5>Thông tin phòng</h5>
							<div class="list_info_room" id="list_info_room">
								<c:set var="total" value="${0}" />
								<c:forEach items="${sessionScope.listRoomType}" var="roomtype"
									varStatus="loop">
									<div class='detail_info_room'>
										<hr>
										<h6><span>Phòng ${loop.index+1}:</span> ${roomtype.nameRoomType}</h6>
										<h6><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${roomtype.price}" /> VND</h6>
									</div>
									<c:set var="total" value="${total + roomtype.price}" />
								</c:forEach>
							</div>
						</div>
						<hr />
						<div class="info_total_price">
							<div class="detail_total_price">
								<h5>Tổng cộng:</h5>
								<div class="total_price">
									<fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${total}" /> VND
								</div>
							</div>
						</div>
	
					</div>
					<div class="payment">
						<h5>Phương thức thanh toán</h5>
						<hr>
						<select name="bank" id="bank" class="bank">
							<option value="bidv">BIDV</option>
							<option value="viettin">VietTin</option>
							<option value="momo">Momo</option>
						</select> 
						<input type="radio" class="radio" id="radio_accept"> 
						<label for="radio">Vui lòng đọc kỹ và đồng ý với điều khoản đặt phòng bằng cách đánh dấu vào ô bên cạnh.</label>
						<div class="btn_booking_payment">
							<button id="btn_booking"  disabled >
								<i class="fa-solid fa-unlock-keyhole"></i> THỰC HIỆN ĐẶT PHÒNG
							</button>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>

</html>