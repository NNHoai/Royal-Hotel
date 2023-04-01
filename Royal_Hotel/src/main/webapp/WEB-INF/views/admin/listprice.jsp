<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
#modal-delete .modal-header {
	background-color: #ff9933;
}

#modal-delete h4 {
	font-size: 18px;
	color: #f9f9d7;
}
</style>
<h2 style="margin-top: 10px;">New prices</h2>

<a style="float: right; margin: 10px;"
	href="/Royal_Hotel/admin/priceType" class="btn btn-secondary">Prices</a>
<button type="button" class="btn btn-info" data-toggle="modal"
	data-target="#myModal" style="float: right; margin: 10px;">+
	new</button>


<!-- The Modal -->
<div class="modal fade" id="myModal">
	<div class="modal-dialog">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header">
				<h4 class="modal-title">New Price</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<!-- Modal body -->
			<div class="modal-body">
				<div class="container  my-3 bg-dark text-white">

					<form action="/Royal_Hotel/admin/newprice" method="post">
						<div class="form">
							<p>ID:</p>
							<input type="text" class="form-control" placeholder="ID" id="ID"
								name="ID">
						</div>
						<div class="form">
							<p>Reason:</p>
							<input type="text" class="form-control"
								placeholder="enter Reason" id="Reason" name="Reason">
						</div>
						<div class="form">
							<p>Persents:</p>
							<input type="number" class="form-control"
								placeholder="enter persent" id="persent" name="persent">
						</div>
						<div class="form">
							<p>Date From:</p>
							<input id="datepicker" width="300" placeholder="Start Day"
								name="start" />
						</div>
						<div class="form">
							<p>Date To:</p>
							<input id="datepicker1" width="300" placeholder="Start Day"
								name="end" />
						</div>
						<div style="padding: 10px;">
							<input type="submit" class="btn btn-success" value="Submit">
						</div>
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
				<th>Id</th>
				<th>Reason</th>
				<th>Percents</th>
				<th>DateFrom</th>
				<th>DateTo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="Price" items="${PriceByTime}" varStatus="loop">
				<tr>
					<td>${Price.id}</td>
					<td><a href="/Royal_Hotel/admin/editprice?id=${Price.id}">${Price.reason}</a></td>
					<td>${Price. persent}</td>
					<td>${Price.dateFrom}</td>
					<td>${Price.dateTo}<a href="#"
						class="btn btn-danger btn-delete-user" data-key="${Price.id}"
						data-title="${Price.reason}" data-toggle="modal"
						data-target="#modal-delete" style="float: right;">Delete</a> <a
						href="/Royal_Hotel/admin/editidprice?id=${Price.id}"
						class="btn btn-outline-info "
						style="float: right; margin-right: 10px">Use</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<jsp:include page="/common/admin/modeldelete.jsp" />

