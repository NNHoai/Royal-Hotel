<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2 style="margin-top: 40px">List RoomType</h2>
<br>

<table class="table table-hover" style="width: 80%; margin-left: 100px">

	<thead class="thead-light">
		<tr>
			<th>No</th>
			<th>RoomType</th>
			<th>Price</th>
			<th>description</th>
			<th>idPrice</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="Rt" items="${Roomtype}" varStatus="loop">
			<tr>
				<td>${loop.index + 1}</td>
				<td>${Rt.nameRoomType}</td>
				<td>${Rt.price}</td>
				<td class="col-sm-6">${Rt.description}</td>
				<td>${Rt.idPrice}<a
					href="/Royal_Hotel/admin/editroomtype?id=${Rt.idRoomType}"
					class="btn btn-outline-success" style="float: right;">Update</a></td>
			</tr>
		</c:forEach>

	</tbody>
</table>