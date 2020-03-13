<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style /
//	Global---------------------------------------------------------------->

* {
	margin: 0;
	padding: 0;
	font-family: 'opensansregular';
	color: rgb(152, 152, 152);
}

.container {
	width: 70%;
	margin: 0 auto;
}

a {
	text-decoration: none;
	color: orange;
}

.btn {
	padding: 3px 10px;
	height: 20px;
	width: 100px;
	background-color: orange;
	color: #e5e5e5;
	text-transform: uppercase;
	font-weight: bold /*font-size: px;*/
}
/*Header----------------------------------------------------------------->*/
header {
	background-color: rgb(51, 51, 51);
	height: 200px;
}
/*Index-------------------------------->*/
.index {
	padding: 20px 20px;
	color: #e5e5e5;
	margin-bottom: 70px;
	/*padding-top: 20px;*/
	/*padding-bottom: 50px;*/
}

.index h1 {
	font-size: 3vw;
}

.index-left {
	float: left;
}

.index-right {
	float: right;
	display: inline;
}

.index-right input {
	width: 200px;
	height: 20px;
	background-color: rgb(51, 51, 51);
	border: 1px solid #e5e5e5;
	margin-top: 20px;
}
/*Navigation bar------------------------>*/
nav {
	height: 60px;
	background-color: rgb(35, 35, 35);
}

nav ul {
	list-style: none;
	padding-top: 20px;
	padding-left: 20px;
}

nav ul li {
	display: inline;
	padding: 16px 32px;
}

nav ul li a {
	color: lightgray;
	text-decoration: none;
	text-transform: uppercase;
}

nav ul li a:hover {
	color: orange;
}

/*Showcase------------------------------------------------>*/
.showcase {
	margin: 30px 0px;
	height: 300px;
	width: 100%;
}

.showcase-left {
	width: 30%;
	height: 100%;
	float: left;
	background-color: rgb(70, 70, 70);
	padding: 20px 20px;
	box-sizing: border-box;
	color: rgb(152, 152, 152);
}

.showcase-left h1 {
	font-size: 2.5vw;
	margin-bottom: 10px;
}

.showcase-left p {
	margin-bottom: 10px;
}

.showcase-right {
	width: 70%;
	height: 100%;
	float: right;
	background-color: rgb(51, 51, 51);
}

/*About --------------------------------------------------->*/
.about {
	height: 300px;
}

.about-left {
	width: 50%;
	height: 100%;
	float: left;
	/*margin-right: 1px;*/
}

.about-right {
	width: 50%;
	height: 100%;
	float: right;
	text-align: center;
}

.about-right img {
	width: 130px;
	height: 130px;
	margin-left: 35px;
	margin-bottom: 20px;
	float: right;
	padding: 5px 5px;
	border: 1px solid black;
}

hr {
	width: 70%;
	margin: 50px auto;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!DOCTYPE html>
<html>
<head>
<title>Proiect</title>
<link rel="stylesheet" type="text/css" href="styleboda.css">
</head>
<body>
	<!-- Navigation bar -->
	<header>
		<!-- partea de sus o faci tu -->
		<div class="container index">
			<div class="index-left">
				<h1>ImoMarkt</h1>
				<p>Your home is here!</p>
			</div>
			<div class="index-right">
				<input type="text" name="" placeholder="   Enter your text here...">
				<a href="#" class="btn">submit</a>
			</div>
		</div>
		<div class="container">
			<nav>
				<ul>
					<li><a href="#">Vanzari</a></li>
					<li><a href="#">Inchirieri</a></li>
					<li><a href="#">Stiri</a></li>
					<li><a href="#">Juridic</a></li>
					<li><a href="#">Despre</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<!-- Showcase -->
	<div class="container">
		<div class="showcase">
			<div class="showcase-left">
				<h1>Apartament 2 camere, Zorilor</h1>
				<p>Apartament decomandat, 2 camere, 50 mp, etaj 2/4, centrala termica, izolat termic. Observatorului. .</p>
				<a href="#">Mai mult >></a>
			</div>
			<div class="showcase-right">
				<img src="img/showcase.jpg" width="100%" height="300px">
			</div>
		</div>
	</div>

	<!-- About Section -->
	<div class="container">
		<div class="about">
			<div class="about-left">
				<h2>Alte apartamente cu 2 camere >></h2>
				<p>
					Vezi si alte apartamente asemanatoare din cartierul Zorilor!
					
				</p>
				<p>
					Vezi si >> <a href="#">Apartament cu 2 camere</a>.
				</p>
			</div>
			<div class="about-right">
				<img src="img/poza1.jpg"> <img src="img/poza2.jpg"> <img
					src="img/poza3.jpg">
				<p>
					<a href="#">Pentru mai multe informatii luat legatura cu echipa ImoMarkt!</a>
				</p>
			</div>
		</div>
	</div>

	<hr>
</body>
</html>
</body>
</html>