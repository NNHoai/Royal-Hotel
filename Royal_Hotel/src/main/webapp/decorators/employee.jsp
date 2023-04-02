<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>

<!DOCTYPE html>
<html>
<head>
<title>Trang chu</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link href="<c:url value='/template/admin/css/style.css'/> "
	rel="stylesheet" type="text/css">

<link href="<c:url value='/template/admin/css/informationHotel.css'/> "
	rel="stylesheet" type="text/css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js"
	type="text/javascript"></script>
<link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css"
	rel="stylesheet" type="text/css" />
	<script
	src="<c:url value='/template/admin/js/delet.js'/> "></script>
	<script
	src="<c:url value='/template/admin/js/deleteroom.js'/>"></script>

</head>

<body>

	<%@ include file="/common/employee/header.jsp"%>

	<div class="container-body">
		<div class="row ">
			<div class="col-sm-2 border">
				<%@ include file="/common/employee/menu.jsp"%>
				<hr class="d-sm-none">
			</div>
			<div class="col-sm-10 detail">
				<dec:body />
			</div>
		</div>
	</div>
	<script>
		$('#datepicker').datepicker({
			uiLibrary : 'bootstrap4'
		});
		$('#datepicker1').datepicker({
			uiLibrary : 'bootstrap4'
		});
	</script>
</body>
</html>