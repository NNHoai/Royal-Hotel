 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<style>
#modal-delete1 .modal-header{
    background-color: #ff9933;
}
#modal-delete1 h4{
    font-size: 18px;
    color: #f9f9d7;
}
</style>

<h2 style="margin-top: 10px; ">List Room</h2>
<a  style="float: right;margin: 10px;"  href="/Royal_Hotel/admin/roomtype" class="btn btn-secondary">List RoomType</a>
<button type="button" class="btn btn-info" data-toggle="modal"
	data-target="#myModal" style="float: right; margin: 10px;">+
	Add Room</button>

<!-- The Modal -->
<div class="modal fade" id="myModal">
	<div class="modal-dialog">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header">
				<h4 class="modal-title">Add Room</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<!-- Modal body -->
			<div class="modal-body">
				<div class="container p-3 my-3 bg-dark text-white">
					<form action='/Royal_Hotel/admin/add' method="post">
					<div class="form">
							<p>ID Room:</p>
							<input  type="Text" class="form-control"
								placeholder="Example R007" id="NameRoom" name="id">
						</div>
						<div class="form">
							<p>Room Name:</p>
							<input type="Text" class="form-control"
								placeholder="Example A201" id="NameRoom" name="NameRoom">
						</div>
						<div class="option">
							<p>Room Type:</p>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									class="form-check-input" value="RT001" name="optradio">Standard(STD)
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									class="form-check-input" value="RT002" name="optradio">Superior(SUP)
								</label>
							</div>
							<div class="form-check-inline disabled">
								<label class="form-check-label"> <input type="radio"
									class="form-check-input" value="RT003" name="optradio">Deluxe(DLX)
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label" style="margin-right: 18px;">
									<input type="radio" class="form-check-input" value="RT004"
									name="optradio">Junior Suite
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label" style="margin-right: 14px;">
									<input type="radio" class="form-check-input" value="RT005"
									name="optradio">Family Suite
								</label>
							</div>
							<div class="form-check-inline disabled">
								<label class="form-check-label"> <input type="radio"
									class="form-check-input" value="RT006" name="optradio">Senior
									Suite
								</label>
							</div>
							<div class="form-check-inline disabled">
								<label class="form-check-label"> <input type="radio"
									class="form-check-input" value="RT007" name="optradio">Executive
									Suite
								</label>
							</div>
						</div>
						<hr>

						<button type="submit" class="btn btn-primary" value="inputDataRoom">Add</button>
					</form>
				</div>
			</div>

			<!-- Modal footer -->
			<div class="modal-footer">
				<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
			</div>

		</div>
	</div>
</div>
<div class="form-group" style="margin: 25px;">
	<table class="table table-hover" style="width: 80%; margin-left: 100px">
		<thead class="thead-light">
			<tr>
				<th>No</th>
				<th>NameRomm</th>
				<th>Status</th>
				<th>RoomType</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="Room" items="${Room}" varStatus="loop">
				<tr>
					<td>${loop.index + 1}</td>
					<td><a href="/Royal_Hotel/admin/edit?id=${Room.id}" >${Room.roomName}</a></td>
					<td>
					<c:choose>
							<c:when test="${Room.status == 'Trống'}">
							<p style="color: #00e6e6;">Empty</p>
							</c:when>
							<c:when test="${Room.status == 'Đã đặt'}">
							<p style="color: #ff1a1a;">NotEmpty</p>
							</c:when>
						</c:choose></td>
					<td><c:choose>
							<c:when test="${Room.type == 'RT001'}">
							standard
							</c:when>
							<c:when test="${Room.type == 'RT002'}">
							Superior
							</c:when>
							<c:when test="${Room.type == 'RT003'}">
							Deluxe
							</c:when>
							<c:when test="${Room.type == 'RT004'}">
							Suite
							</c:when>
						</c:choose> 
						<a href="#" class="btn btn-danger btn-delete-user1"  data-key="${Room.id }" data-title="${Room.roomName}"
                                       data-toggle="modal" data-target="#modal-delete1" style="float: right;">Delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>
<jsp:include page="/common/admin/roomdelete.jsp"/>