<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_styles/allCss.jsp"%>
</head>
<body>
<%@include file="includes/header.jsp"%>
<style type="text/css">
header {
	background-color: rgb(46, 46, 46);
	height: 28vh;
	background-image: url("images/header.jpg");
	background-size: 50%;
}

.foot {
	background-color: rgb(0, 0, 0);
	margin-top: 2cm;
	padding-bottom: 3cm;
	background-image: url("images/header.jpg");
	background-size: 100%;
	background-repeat: no-repeat;
}
body{
	background-color: #0c1429;
}
</style>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String age = request.getParameter("cate");
		String des = request.getParameter("desc");
	%>
	
	<div class="g2">
		<div class="row">
			<div class ="col-md-8 offset-md-2">
				<p class="formtitle">Delete Game</p>
				<div class="card">
					<div class="card-body">
							<form action="delete" method="post" class="gameform">
							  	<div class="form-group">
						    		<label for="exampleInputName">Game ID</label>
						    		<input type="text" name = "id" class="form-control" value="<%=id%>" readonly>
						  		</div>						  
							  	<div class="form-group">
						    		<label for="exampleInputName">Game Name</label>
						    		<input type="text" name = "name" class="form-control" value="<%=name%>" readonly>
						  		</div>						  
							  	<div class="form-group">
						    		<label for="exampleInputName">Game Type</label>
						    		<input type="text" name = "type" class="form-control" value="<%=type%>" readonly>
						  		</div>						  
							  	<div class="form-group">
						    		<label for="exampleInputName">Age Category</label>
						    		<input type="text" name = "age" class="form-control" value="<%=age%>" readonly>
						  		</div>						  
						  		
						  		<div class="form-group">
						    		<label for="exampleInputUsertype">Description</label>
						    		<input type="text" name = "description" class="form-control" value="<%=des%>" readonly>
						  		</div>						  		
						  		<div class="text-center">
						  			<input type="submit" name="submit" class="btn btn-primary " value="Delete Game">
						  		</div>	
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br><br>	
	
<%@include file="includes/footer.jsp"%>
</body>
</html>