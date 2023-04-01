<br>
<h2>Edit Room</h2>
<hr>
<br>
<div class="container p-3 my-3 bg-dark text-white" style="width: 50%;">

	
	<form action='/Royal_Hotel/admin/edit' method="post">
		<div class="form">
			<p>ID Room:</p>
			<input type="Text" class="form-control" placeholder="Example A201"
				id="NameRoom" name="id" value="${room.id }" readonly>
		</div>
		<div class="form">
			<p>Room Name:</p>
			<input style="width: 100%; border-radius: 5px; padding: 5px;"
				type="Text" class="form-control" placeholder="Example A201"
				id="NameRoom" name="NameRoom" value="${room.roomName }">
		</div>
		<div class="option">
			<p>Room Type:</p>
			<div class="form-check-inline">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" id="RT001" value="RT001" name="optradio">Standard(STD)
				</label>
			</div>
			<div class="form-check-inline">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" id="RT002" value="RT002" name="optradio">Superior(SUP)
				</label>
			</div>
			<div class="form-check-inline disabled">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" id="RT003" value="RT003" name="optradio">Deluxe(DLX)
				</label>
			</div>
			<div class="form-check-inline">
				<label class="form-check-label" style="margin-right: 18px;">
					<input type="radio" class="form-check-input" id="RT004"
					value="RT004" name="optradio">Junior Suite
				</label>
			</div>
			<div class="form-check-inline">
				<label class="form-check-label" style="margin-right: 14px;">
					<input type="radio" class="form-check-input" id="RT005"
					value="RT005" name="optradio">Family Suite
				</label>
			</div>
			<div class="form-check-inline disabled">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" id="RT006" value="RT006" name="optradio">Senior
					Suite
				</label>
			</div>
			<div class="form-check-inline disabled">
				<label class="form-check-label"> <input type="radio"
					class="form-check-input" id="RT007" value="RT007" name="optradio">Executive
					Suite
				</label>
			</div>
		</div>
		<hr>

		<button style="margin: 0px 10px 0px 190px; width: 100px;"
			type="submit" class="btn btn-primary" value="inputDataRoom">Add</button>
		<a href="/Royal_Hotel/admin/room" class="btn btn-danger"
			style="margin: 0px 20px 0px 20px; width: 100px;">Close</a>
	</form>
	<script type="text/javascript">
		const radio = document.getElementById('${room.type}');
		radio.checked = true;
	</script>
</div>