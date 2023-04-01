<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br>
<h2>Price by time of Roomtype</h2>
<hr>
<br>
<table class="table table-hover" style="width: 50%; margin-left: 50px; ">

		<thead class="thead-light">
			<tr>
				<th>No</th>
				<th>RoomType</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="Rt" items="${Roomtype}" varStatus="loop">
				<tr>
					<td>${loop.index + 1}</td>
					<td>${Rt.nameRoomType}</td>
					<td>${Rt.price}</td>
			
				</tr>
			</c:forEach>

		</tbody>
	</table>