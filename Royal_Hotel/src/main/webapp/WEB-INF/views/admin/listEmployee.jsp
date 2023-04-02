 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<h2 style="margin-top: 10px;">List Employee</h2>
<button type="button" class="btn btn-info" data-toggle="modal"
	data-target="#myModal" style="float: right; margin: 10px;">+
	Add Employee</button>

<!-- The Modal -->
<div class="modal fade" id="myModal">
	<div class="modal-dialog">
		<div class="modal-content">

			<!-- Modal Header -->
			<div class="modal-header">
				<h4 class="modal-title">Add Employee</h4>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>

			<!-- Modal body -->
			<div class="modal-body">
				<div class="container p-3 my-3 bg-dark text-white">
					<form action="/Royal_Hotel/admin/newemployee" method="post">
					<div class="form">
							<p>ID Employee:</p>
							<input  type="Text" class="form-control"
								placeholder="" id="NameRoom" name="id">
						</div>
						<div class="form">
							<p>FullName:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="fullname">
						</div>
						<div class="form">
							<p>Gender:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="gender">
						</div>
						<div class="form">
							<p>Brithday:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="brithday">
						</div>
						<div class="form">
							<p>Address:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="address">
						</div>		
						<div class="form">
							<p>Phone:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="phone">
						</div>	
						<div class="form">
							<p>Email:</p>
							<input type="Email" class="form-control"
								placeholder="" id="NameRoom" name="email">
						</div>	
						<div class="form">
							<p>CitizenID:</p>
							<input type="text" class="form-control"
								placeholder="" id="NameRoom" name="citizenID">
						</div>
						<div class="form">
							<p>UserName:</p>
							<input type="text" class="form-control"
								placeholder="" id="NameRoom" name="username">
						</div>								
						<hr>
						<button type="submit" class="btn btn-primary" >Add</button>
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
				<th>FullName</th>
                <th>Gender</th>
                <th>Birthday</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Email</th>
                <th>CitizenID</th>
                <th>UserName</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="Emp" items="${Employee}" varStatus="loop">
				<tr>
					<td>${loop.index + 1}</td>
                    <td><a href="/Royal_Hotel/admin/editemployee?id=${Emp.id}">${Emp.fullname}</a></td>
                    <td>${Emp.gender}</td>
                    <td>${Emp.birthday}</td>
                    <td>${Emp.address}</td>
                    <td>${Emp.phone}</td>
                    <td>${Emp.email}</td>
                    <td>${Emp.citizenID}</td>
                    <td>${Emp.userName}</td>
					<td><a href="" class="btn btn-danger" style="float: right;">Delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>