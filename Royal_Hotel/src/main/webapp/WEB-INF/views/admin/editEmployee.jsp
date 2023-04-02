<div class="container  my-3 bg-dark text-white">
	<h2>Edit price</h2>
	<hr>
	<form action="/Royal_Hotel/admin/editemployee" method="post">
		<div class="form">
							<p>ID Employee:</p>
							<input  type="Text" class="form-control"
								placeholder="id" id="id" name="id" value="${Employee.id}" readonly>
						</div>
						<div class="form">
							<p>FullName:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="fullname" value="${Employee.fullname}">
						</div>
						<div class="form">
							<p>Gender:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="gender"value="${Employee.gender}">
						</div>
						<div class="form">
							<p>Brithday:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="brithday"value="${Employee.birthday}">
						</div>
						<div class="form">
							<p>Address:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="address"value="${Employee.address}">
						</div>		
						<div class="form">
							<p>Phone:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="phone"value="${Employee.phone}">
						</div>	
						<div class="form">
							<p>Email:</p>
							<input type="Email" class="form-control"
								placeholder="" id="NameRoom" name="email"value="${Employee.email}">
						</div>	
						<div class="form">
							<p>CitizenID:</p>
							<input type="text" class="form-control"
								placeholder="" id="NameRoom" name="citizenID"value="${Employee.citizenID}">
						</div>
						<div class="form">
							<p>UserName:</p>
							<input type="text" class="form-control"
								placeholder="" id="NameRoom" name="username"value="${Employee.username}">
						</div>		
		<div style="padding: 10px;">
			<input type="submit" class="btn btn-success" value="Submit">
		</div>
	</form>

</div>