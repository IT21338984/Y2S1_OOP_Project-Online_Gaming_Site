<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>
</head>
<body>
<header class="header">
        <section>
            <nav class="account">
                <ul>
                    <a href="#"><span><i class="fa-solid fa-circle-user"></i></span></a>
                </ul>
            </nav>
            <div id="main_menu" class="main_menu">
                <div class="logo">
                <!--logo here-->
                	<a href="#"><img src="images/logo.png" alt=""></a>
                </div>
                <nav class="header_home" id="navbar">
                    <link rel="preconnect" href="https://fonts.googleapis.com">
                    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                    <link href="https://fonts.googleapis.com/css2?family=Ropa+Sans&display=swap" rel="stylesheet">
                    <ul>
                        <li><a href="index.jsp">HOME</a	></li>
                        <li><a href="create.jsp" class="active" action="insert">GAMES</a></li>
                        <li><a href="#">ABOUT US</a></li>
                        <li><a href="#">NEWS</a></li>
                        <li><a href="#">CONTACT US</a></li>
                        <li><a href="#">FAQ</a></li>
                    </ul>
                </nav>
            </div>     
        </section>
 </header>

	<div class="g2">
		<div class="row">
			<div class ="col-md-8 offset-md-2">
				<p class="formtitle">Upload A Game</p>
				<div class="card">
					<div class="card-body">
							<form action="insert" method="post" enctype="multipart/form-data" class="gameform">
							  	<div class="form-group">
						    		<label for="exampleInputName">Game Name</label>
						    		<input type="text" name = "name" class="form-control" placeholder="Call of Duty 2" required="required">
						  		</div>						  
						  		<div class="form-group">
						    		<label for="exampleInputType">Game Type</label>
						    		<select 
										name="type" required>
										<option selected>select</option>
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
										name="category" required>
										<option selected>select</option>
										<option value="5+">5+</option>
										<option value="7+">7+</option>
										<option value="10+">10+</option>
										<option value="15+">15+</option>
										<option value="18+">18+</option>		
									</select>
						    		</div>
						  		<div class="form-group">
						    		<label for="exampleInputUsertype">Description</label>
						    		<input type="text" name = "description" class="form-control" placeholder="About the Game" required="required">
						  		</div>
						  		<div class="form-group">
						    		<label for="exampleInputImage">Image</label>
						    		<input type="file" name = "image" class="form-control" placeholder="" required="required">
						  		</div>
						  		<div class="text-center">
						  			<button type="submit" name ="submit "class="btn btn-primary " value="Upload Game">Upload Game</button>
						  		</div>	
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="formtemplatediv">
		<img alt="" src="../online_gaming_system/GameFiles/wp3282859.jpg" class="formtemplate">
		<img alt="" src="../online_gaming_system/GameFiles/farcry6.jfif" class="formtemplate1">
	</div>
	
	<br>
	<div>
	<form action="retrieve" method="post">
	<center>
		<input type="submit" name="submit" value="View Alll Games" class="btn btn-primary">
	</center>
		</form>
	</div>
	
	
	<%@include file="includes/footer.jsp"%>
</body>
</html>