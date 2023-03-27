<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../common/taglib.jsp"%>

<div class="container">
	<br>
	<h2>Manage Service</h2>
	<br>
	<table class="table table-hover">
		<thead class="thead-light">
			<tr class="Size-table">
				<th>ID Service</th>
				<th>Name Service</th>
				<th>Price</th>
				<th>Description</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${serviceOfHotel }">
				<tr>
					<td>${item.IDServices}</td>
					<td>${item.nameServices}</td>
					<td>${item.price}</td>
					<th class="col-sm-6">${item.description}</th>
					<th style="float: right;"><button type="button"
							class="btn btn-outline-primary">Edit</button>
						<button type="button" class="btn btn-danger">Delete</button></th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>

		<button type="button" class="btn btn-outline-success"
			data-toggle="modal" data-target="#myModal" style="float: right;">
			+ Add an Service</button>

		<!-- The Modal -->
		<div class="modal fade" id="myModal">
			<div class="modal-dialog modal-lg">
				<div class="modal-content" style="width: 70%; margin: auto;">

					<!-- Modal Header -->
					<div class="modal-header"
						style="background-color: rgb(197, 192, 192);">
						<h4 class="modal-title">Add an Service</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body ">
						<form action="/Royal_Hotel/admin/Create" method="post">

							<div class="form">
								<label for="IDS">ID Service</label> <input type="text"
									class="form-control" id="IDS" name="ID"
									style="margin: auto; width: 90%; display: block">
							</div>
							<div class="form">
								<label for="nameService">Name Service</label> <input type="text"
									class="form-control" id="nameService" name="nameService"
									style="margin: auto; width: 90%; display: block">
							</div>
							<div class="form">
								<label for="priceService">Price Service</label> <input
									type="text" class="form-control" id="priceService"
									name="priceService"
									style="margin: auto; width: 90%; display: block">
							</div>
							<div class="form">
								<label for="Description">Description</label> <input type="text"
									class="form-control" id="Description" name="Description"
									style="margin: auto; width: 90%; display: block"">
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-secondary hoversecondary"
									style="position: absolute; left: 15%; margin-top: 50px;">
									ADD</button>
								<button type="button" class="btn btn-secondary hover"
									style="position: absolute; right: 15%; margin-top: 50px;"
									data-dismiss="modal">Close</button>

							</div>
							<div>
								<br>
							</div>

						</form>

					</div>

				</div>
			</div>
		</div>
	</div>
</div>
