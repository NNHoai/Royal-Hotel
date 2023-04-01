<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../common/taglib.jsp"%>



<!-- The Modal -->
<div class="modal-content" style="width: 70%; margin: auto;">

	<!-- Modal Header -->
	<div class="modal-header" style="background-color: rgb(197, 192, 192);">
		<h4 class="modal-title">Edit an Service</h4>

	</div>

	<!-- Modal body -->
	<div class="modal-body ">
		<form action="/Royal_Hotel/admin/editservice?id=${service.idService }"
			method="post">

			<div class="form">
				<label for="IDS">ID Service</label> <input type="text"
					class="form-control" id="IDS" name="ID" readonly="readonly"
					style="margin: auto; width: 90%; display: block"
					value="${service.idService}">
			</div>
			<div class="form">
				<label for="nameService">Name Service</label> <input type="text"
					class="form-control" id="nameService" name="nameService"
					style="margin: auto; width: 90%; display: block"
					value="${service.nameServices}">
			</div>
			<div class="form">
				<label for="priceService">Price Service</label> <input type="text"
					class="form-control" id="priceService" name="priceService"
					style="margin: auto; width: 90%; display: block"
					value="${service.price}">
			</div>
			<div class="form">
				<label for="Description">Description</label> <input type="text"
					class="form-control" id="Description" name="Description"
					style="margin: auto; width: 90%; display: block"
					value="${service.description}">
			</div>
			<div class="modal-footer" style="display: inline-block;">
				<button type="submit" class="btn btn-secondary hoversecondary"
					style="position: absolute; left: 15%;">Submit</button>
				<a href="/Royal_Hotel/admin/Infoservice">
					<button type="button" class="btn btn-secondary hover"
						style="position: absolute; right: 15%;" data-dismiss="modal">Cancel</button>
				</a>

			</div>
			<div>
				<br>
			</div>

		</form>

	</div>

</div>