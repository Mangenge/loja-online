<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Loja Online - ${title}</title>
<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- Bootstrap readable theme -->
<link href="${css}/bootstrap-readable.css" rel="stylesheet">

<link href="${css}/bootstrap.min.css" rel="stylesheet">

<script type="text/javascript"
	src="https://gc.kis.v2.scr.kaspersky-labs.com/79263DD4-9AD6-CD4C-92DC-82EB0759544A/main.js"
	charset="UTF-8"></script>
</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- End Navigation -->

		<!-- Page Content -->

		<div class="content">

			<!-- Loading the home content -->

			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Loading only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Loading only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>

		</div>

		<!-- /.container -->

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- End Footer -->

		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrapbundle.js"></script>

		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>


</html>
