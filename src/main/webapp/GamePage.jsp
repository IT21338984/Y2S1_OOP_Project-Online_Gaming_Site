	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_styles/allCss.jsp"%>
<style type="text/css">
header {
	background-color: rgb(46, 46, 46);
	height: 28vh;
	background-image: url("images/Black background Pattern Light Texture Wallpaper Background 4K.jpg");
	background-size: 50%;
}

.foot {
	background-color: rgb(0, 0, 0);
	margin-top: 2cm;
	padding-bottom: 3cm;
	background-image: url("images/Black background Pattern Light Texture Wallpaper Background 4K.jpg");
	background-size: 100%;
	background-repeat: no-repeat;
}
body{
	background-color: #0c1429;
}
.card-img-top img{
	background-image: url(../GameFiles/godofwar.jpg);
}
</style>
</head>
<body>
<%@include file="includes/header.jsp"%>
	
	<%
		String fileName = (String)request.getAttribute("fileName");
	%>
	<br>
	<div>
		<a href="create.jsp" name="upload" class="btn btn-primary" >Upload A New Game</a>
	</div>
	<c:forEach var="gm" items="${getAllDetails}">
	
	<c:set var="id" value="${gm.id}"/>
	<c:set var="name" value="${gm.name}"/>
	<c:set var="type" value="${gm.type}"/>
	<c:set var="category" value="${gm.category}"/>
	<c:set var="description" value="${gm.description}"/>	
	
	<div class="card" style="width: 18rem;">
		<img src="GameFiles/godofwar.jpg">
			
		<div class="card-body">
			<h5 class="card-title">Game ID: ${gm.id}</h5>
			<h5 class="card-title">Game Name: ${gm.name}</h5>
			<h5 class="card-title">Game Type: ${gm.type}</h5>
			<h5 class="card-title">Age Category: ${gm.category}</h5>
			<h5 class="card-title">Description: ${gm.description}</h5>

			<c:url value="update.jsp" var="gameupdate">
			<c:param name="id" value="${id}"/>
			<c:param name="name" value="${name}"/>
			<c:param name="type" value="${type}"/>
			<c:param name="cate" value="${category}"/>
			<c:param name="desc" value="${description}"/>
			<c:param name="img" value="${fileName}"/>
			</c:url>

			<c:url value="delete.jsp" var="gamedelete">
			<c:param name="id" value="${id}"/>
			<c:param name="name" value="${name}"/>
			<c:param name="type" value="${type}"/>
			<c:param name="cate" value="${category}"/>
			<c:param name="desc" value="${description}"/>
			</c:url>

			<a href="${gameupdate}" name="update" class="btn btn-primary" >Update Game</a>
			&nbsp;&nbsp;
			<a href="${gamedelete}" name="delete" class="btn btn-primary" >Delete Game</a>
		</div>
	  </div>
	  <br>
	
	</c:forEach>

<%@include file="includes/footer.jsp"%>
</body>
</html>