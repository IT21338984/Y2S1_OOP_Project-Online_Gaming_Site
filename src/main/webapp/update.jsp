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
	
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String age = request.getParameter("cate");
		String des = request.getParameter("desc");
		String img = request.getParameter("img");
	%>
	<div class="g2">
		<div class="row">
			<div class ="col-md-8 offset-md-2">
				<p class="formtitle">Update Game</p>
				<div class="card">
					<div class="card-body">
							<form action="update" method="post" class="gameform">
							  	<div class="form-group">
						    		<label for="exampleInputName">Game ID</label>
						    		<input type="text" name = "id" class="form-control" value="<%=id%>" readonly>
						  		</div>						  
							  	<div class="form-group">
						    		<label for="exampleInputName">Game Name</label>
						    		<input type="text" name = "name" class="form-control" value="<%=name%>" readonly>
						  		</div>						  
						  		<div class="form-group">
						    		<label for="exampleInputType">Game Type</label>
						    		<select 
										name="type">
										<option selected><%=type%></option>
										<option value="Action">Action</option>
										<option value="Shooting">Shooting</option>
										<option value="Multiplayer">Multiplayer</option>
										<option value="Racing">Racing</option>
										<option value="Kids">Kids</option>		
									</select>
						    		
						  		</div>
						  		<div class="form-group">
						    		<label for="exampleInputAge">Age Category</label>
						    		<select 
										name="category">
										<option selected><%=age%></option>
										<option value="5+">5+</option>
										<option value="7+">7+</option>
										<option value="10+">10+</option>
										<option value="15+">15+</option>
										<option value="18+">18+</option>		
									</select>
						    		</div>
						  		<div class="form-group">
						    		<label for="exampleInputUsertype">Description</label>
						    		<input type="text" name = "description" class="form-control" value="<%=des%>">
						  		</div>						  		
						  		<div class="text-center">
						  			<input type="submit" name="submit" class="btn btn-primary " value="Update Game">
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