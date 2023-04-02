 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<h2 style="margin-top: 10px;">List Bank</h2>
<button type="button" class="btn btn-info" data-toggle="modal"
	data-target="#myModal" style="float: right; margin: 10px;">+
	Add Bank</button>

<!-- The Modal -->
<div class="modal fade" id="myModal">
	<div class="modal-dialog">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header">
				<h4 class="modal-title">Add Bank</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<!-- Modal body -->
			<div class="modal-body">
				<div class="container p-3 my-3 bg-dark text-white">
					<form action='/Royal_Hotel/admin/newbank' method="post">
					<div class="form">
							<p>ID:</p>
							<input  type="Text" class="form-control"
								placeholder="" id="NameRoom" name="id">
						</div>
						<div class="form">
							<p>PayName:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="payname">
						</div>
						<div class="form">
							<p>Description:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="description">
						</div>
						<button type="submit" class="btn btn-primary" value="inputDataBank">Add</button>
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
	<table class="table table-hover">
		<thead class="thead-light">
			<tr>
				<th>No</th>
				<th>PayName</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="BankService" items="${Bank}" varStatus="loop">
				<tr>
					<td>${loop.index + 1}</td>
					<td><a href="/Royal_Hotel/admin/editBank?id=${BankService.id}" >${BankService.payname}</a></td>
					<td>${BankService.description}</td>
					
					<td><a href="" class="btn btn-danger" style="float: right;">Delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>