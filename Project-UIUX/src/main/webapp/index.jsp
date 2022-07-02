<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css/common.css">
		<link rel="stylesheet" type="text/css" href="css/menu.css">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		<link rel="stylesheet" type="text/css" href="css/mainPage/slideShow.css">
		<link rel="stylesheet" type="text/css" href="css/mainPage/feed.css">
		<script src="js/jquery-3.6.0.min.js"></script>
		<script src="js/mainPage/subMenu.js"></script>
		<script src="js/mainPage/slideShow.js"></script>
	</head>
	<body>
	<div id="wrap">
	<header>
		<div id="top-headBox">
			<div>
			헤더
			</div>
	 	</div>
	</header>
	 <nav>
		<div id="menuBox">
			<div id="mainMenuBox">
			메인메뉴
			</div>
			<div id="subMenuBox">
			서브메뉴
			</div>	 
	 	</div>
	 </nav>
	 <section>
	 	<article id="slideShow">
		<div id="slideBox">
			<div id="slidePanel">
			<div>1</div>
			<div>2</div>
			<div>3</div>
			<div>4</div>
			<div>5</div>
			</div> 
	 	</div>
	 	</article>
	 	<article id="feed">
	 		<h2 id="feedNameBox"> 피드</h2> 
		<div id="feedBox">
			<div>1</div>
			<div>2</div>
			<div>3</div>
			<div>4</div>
			<div>5</div>
			<div>6</div>
	 	</div>
	 	</article>
	 	
	 </section>
	 <footer>
	 	<div id="ent-info">
			<div>
			기업정보
			</div> 
	 	</div>
	 </footer>
	</div>
	</body>
</html>