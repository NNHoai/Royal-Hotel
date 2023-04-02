<div class="container  my-3 bg-dark text-white">
	<h2>Edit price</h2>
	<hr>
	<form action="/Royal_Hotel/admin/editBank" method="post">
		<div class="form">
							<p>ID:</p>
							<input  type="Text" class="form-control"
								placeholder="" id="NameRoom" name="id" value="${Bank.id}">
						</div>
						<div class="form">
							<p>PayName:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="payname" value="${Bank.payname}">
						</div>
						<div class="form">
							<p>Description:</p>
							<input type="Text" class="form-control"
								placeholder="" id="NameRoom" name="description" value="${Bank.description}">
						</div>
		<div style="padding: 10px;">
			<input type="submit" class="btn btn-success" value="Submit">
		</div>
	</form>

</div>