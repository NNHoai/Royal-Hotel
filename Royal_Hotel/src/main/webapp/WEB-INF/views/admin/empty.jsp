<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<br>
<h2 align="center">Statistic Room</h2>

<div class="container" style="display: flex;">
	<div class="card"
		style="width: 36%; margin: 36px; background-color: rgb(197, 249, 232); padding: 10px; box-shadow: 5px 10px 18px #888888; border-radius: 10%;">
		<div class="card-body">
			<h3 class="card-title" align="center">Quantity of rooms</h3>
			<p class="card-text" align="center" style="font-size: 40px;">
				${numberRoom1}</p>
			<button type="button" class="btn btn-outline-info"
				data-toggle="modal" data-target="#myModal1"
				style="margin-left: 30%; width: 40%;">Detail</button>

			<!-- The Modal -->
			<div class="modal" id="myModal1">
				<div class="modal-dialog">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">All room</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<ul class="list-group list-group-flush">
								<li class="list-group-item">Standard : ${R1}</li>
								<li class="list-group-item">Superior : ${R2}</li>
								<li class="list-group-item">Deluxe : ${R3}</li>
								<li class="list-group-item">Junior Suite : ${R4}</li>
								<li class="list-group-item">Family Suite : ${R5}</li>
								<li class="list-group-item">Senior Suite : ${R6}</li>
								<li class="list-group-item">Executive Suite : ${R7}</li>
							</ul>
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="card"
		style="width: 36%; margin: 36px; background-color: rgb(252, 129, 140); padding: 10px; box-shadow: 5px 10px 18px #888888; border-radius: 10%;">
		<div class="card-body">
			<h3 class="card-title" align="center">NotEmpty</h3>
			<p class="card-text" align="center" style="font-size: 40px;">
				<c:set var="Income" scope="session"
					value="${numberRoom1-numberRoom}" />
				<c:out value="${Income}" />
			</p>
			<button type="button" class="btn btn-outline-info"
				data-toggle="modal" data-target="#myModal"
				style="margin-left: 30%; width: 40%;">Detail</button>

			<!-- The Modal -->
			<div class="modal" id="myModal">
				<div class="modal-dialog">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Detail status NotEmpty</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<ul class="list-group list-group-flush">
								<li class="list-group-item">Standard : ${N1}</li>
								<li class="list-group-item">Superior : ${N2}</li>
								<li class="list-group-item">Deluxe : ${N3}</li>
								<li class="list-group-item">Junior Suite : ${N4}</li>
								<li class="list-group-item">Family Suite : ${N5}</li>
								<li class="list-group-item">Senior Suite : ${N6}</li>
								<li class="list-group-item">Executive Suite : ${N7}</li>
							</ul>
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container" style="display: flex;">
	<div class="card"
		style="width: 36%; margin: 36px; background-color: rgb(49, 244, 153); padding: 10px; box-shadow: 5px 10px 18px #888888; border-radius: 10%;">
		<div class="card-body">
			<h3 class="card-title" align="center">Empty</h3>
			<p class="card-text" align="center" style="font-size: 40px;">${numberRoom}</p>
			<button type="button" class="btn btn-outline-info"
				data-toggle="modal" data-target="#myModal2"
				style="margin-left: 30%; width: 40%;">Detail</button>

			<!-- The Modal -->
			<div class="modal" id="myModal2">
				<div class="modal-dialog">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Detail Status Empty</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<ul class="list-group list-group-flush">
								<li class="list-group-item">Standard : ${R1-N1}</li>
								<li class="list-group-item">Superior : ${R2-N2}</li>
								<li class="list-group-item">Deluxe : ${R3-N3}</li>
								<li class="list-group-item">Junior Suite : ${R4-N4}</li>
								<li class="list-group-item">Family Suite : ${R5-N5}</li>
								<li class="list-group-item">Senior Suite : ${R6-N6}</li>
								<li class="list-group-item">Executive Suite : ${R7-N7}</li>
							</ul>
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="card"
		style="width: 36%; margin: 36px; background-color: rgb(77, 62, 250); padding: 10px; box-shadow: 5px 10px 18px #888888; border-radius: 10%;">
		<div class="card-body">
			<h3 class="card-title" align="center">Details of rooms</h3>
			<p class="card-text" align="center" style="font-size: 25px;">Room
				Controll</p>
			<p style="font-size: 15px;">click Detail for see list room</p>
			<a href="/Royal_Hotel/admin/room" class="btn btn-outline-info"
				style="margin-left: 30%; width: 40%;">Detial</a>
		</div>
	</div>
</div>


