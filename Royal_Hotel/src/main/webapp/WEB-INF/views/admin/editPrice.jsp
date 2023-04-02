<h2>Edit price</h2>
	<hr>
<div class="container  my-3 bg-dark text-white" style="width: 50%;">
	
	<form action="/Royal_Hotel/admin/editprice" method="post">
		<div class="form">
			<p>ID:</p>
			<input type="text" class="form-control" placeholder="ID" id="ID"
				name="ID" value="${PriceByTime.id}" readonly>
		</div>
		<div class="form">
			<p>Reason:</p>
			<input type="text" class="form-control" placeholder="enter Reason"
				id="Reason" name="Reason" value="${PriceByTime.reason}">
		</div>
		<div class="form">
			<p>Persents:</p>
			<input type="number" class="form-control" placeholder="enter persent"
				id="persent" name="persent" value="${PriceByTime.persent}">
		</div>
		<div class="form">
			<p>Date From:</p>
			<input id="datepicker" width="300" placeholder="Start Day"
				name="start" value="${PriceByTime.dateFrom}" />
		</div>
		<div class="form">
			<p>Date To:</p>
			<input id="datepicker1" width="300" placeholder="Start Day"
				name="end" value="${PriceByTime.dateTo}" />
		</div>
		<hr>
		<div style="padding: 10px;">
			<input style="margin: 0px 10px 0px 170px; width: 120px;"
				type="submit" class="btn btn-success" value="Update"> <a
				href="/Royal_Hotel/admin/pricebytime" class="btn btn-danger"
				style="margin: 0px 20px 0px 20px; width: 120px;">Close</a>
		</div>
	</form>

</div>