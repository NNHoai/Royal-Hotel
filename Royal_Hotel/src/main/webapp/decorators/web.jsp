<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Trang Chủ</title>
  
    <!-- reset css -->
    <link href="<c:url value='/template/web/assets/css/reset.css'/>" rel="stylesheet" type="text/css">
    <!-- Embed icon -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
      integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <!-- fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;800&display=swap"
      rel="stylesheet"
    />
    <link href="<c:url value='/template/web/assets/css/style1.css'/>" rel="stylesheet" type="text/css">
    <!-- swiper -->
    <link href="<c:url value='/template/web/assets/css/swiper.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/template/web/assets/css/swiper-bundle.min.css'/>" rel="stylesheet" type="text/css">
  </head>
  <body>

	<%@ include file="/common/web/header.jsp" %>

	<dec:body/>
	
	<%@ include file="/common/web/footer.jsp" %>
	
	<script src="<c:url value='./template/web/js/swiper-bundle.min.js'/>"></script>
	<script src="<c:url value='./template//web/js/script.js'/>"></script>
</body>
</html>