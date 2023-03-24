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

</head>

<body>

	<%@ include file="/common/admin/header.jsp"%>

	<div class="container-body">
		<div class="row ">
			<div class="col-sm-2 border">
				<%@ include file="/common/admin/menu.jsp"%>
				<hr class="d-sm-none">
			</div>
			<div class="col-sm-10 detail">
				<dec:body />
			</div>
		</div>
</body>
</html>