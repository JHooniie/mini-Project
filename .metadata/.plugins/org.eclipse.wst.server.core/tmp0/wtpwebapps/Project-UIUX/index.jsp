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
		<link rel="stylesheet" type="text/css" href="css/mainPage/poster.css">
		<link rel="stylesheet" type="text/css" href="css/mainPage/notice.css">
		<link rel="stylesheet" type="text/css" href="css/mainPage/community.css">
		<link rel="stylesheet" type="text/css" href="css/mainPage/feed.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
		<style type="text/css">



		</style>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
		<script src="js/jquery-3.6.0.min.js"></script>
		<script src="js/mainPage/subMenu.js"></script>
		<script src="js/mainPage/slideShow.js"></script>
		<script src="js/mainPage/poster.js"></script>
	</head>
	<body>
	<div id="wrap">
	<header>
	<!-- top navBar -->
		<div class="navbar navbar-expand-lg navbar-light bg-light d-flex justify-content-between bg-$blue-100">
		    <div class="container-fluid"  style="background-color:#CFE2FF">
		      <a class="navbar-brand col-1" href="#">Navbar</a>
		      <form class="d-flex col-6">
		        <input class="form-control me-2 rounded-0 rounded-top border-0 border-bottom border-dark" style="background-color:#CFE2FF" type="search" placeholder="Search" aria-label="Search">
		        <button class="btn btn-outline-success" type="submit">Search</button>
		      </form>
		        <ul class="navbar-nav me-5 ">
		          <li class="nav-item dropdown">
		            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		              Dropdown
		            </a>
		            <ul class="dropdown-menu me-7" aria-labelledby="navbarDropdown" style="right:1%">
		              <li><a class="dropdown-item" href="#">Action</a></li>
		              <li><a class="dropdown-item" href="#">Another action</a></li>
		              <li><hr class="dropdown-divider"></li>
		              <li><a class="dropdown-item" href="#">Something else</a></li>
		            </ul>
		          </li>
		        </ul>
		    </div>
		  </div>
		  <!-- ????????? div ??? col ???????????? ?????? ?????? ?????? ?????? -->
<!-- 		<nav class="navbar bg-light">
		  <div class="d-flex flex-row justify-content-between">
		    <div class="col-4"><a class="navbar-brand">Navbar</a></div>
		    <div class="col-4">
		    	<form class="d-flex" role="search">
		     	 <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
		      	<button class="btn btn-outline-success" type="submit">Search</button>
		   		</form>
		   	</div>
		   	<div class="col-4 navbar-collapse" id="navbarNav">
		      <ul class="col-4 navbar-collapse navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">Features</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">Pricing</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link disabled">Disabled</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav> -->
		<!-- <div id="top-headBox">
			<div id="top-headLogo">
			<h3>??????</h3>
			</div>
			<div id="top-headSearchBar">
				<form>
					<input type="text" name="mainSearch" value="search...">
					<input type="submit" name="mainSearchBtn" value="??????">
				</form>
			</div>
			<div id="top-headLoginSignUp">
			<a href="#">???????????? </a>/
			<a href="#">????????? &nbsp;</a>
			</div>
	 	</div> -->
	</header>
	 <nav>
		<div id="menuBox">
			<div id="mainMenuBox">
			????????????
			</div>
			<div id="subMenuBox">
			????????????
			</div>	 
	 	</div>
	 </nav>
	 <section>
	 <!-- ???????????? ????????? ?????? ???????????? ?????? -->
	 	<article class="ratio ratio-21x9" id="slideShow">
	 		<div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
			  <div class="carousel-indicators">
			    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
			    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
			  </div>
			  <div class="carousel-inner">
			    <div class="carousel-item active ratio ratio-21x9" data-bs-interval="3000">
			      <img src="image/mainPage/konigssee.jpg" class="d-block w-100" alt="...">
			      <div class="carousel-caption d-none d-md-block">
			        <h5>Festith</h5>
			        <p>First companion</p>
			      </div>
			    </div>
			    <div class="carousel-item ratio ratio-21x9" data-bs-interval="3000">
			      <img src="image/mainPage/konigssee.jpg" class="d-block w-100" alt="...">
			      <div class="carousel-caption d-none d-md-block">
			        <h5>Second</h5>
			        <p>I really almost died.</p>
			      </div>
			    </div>
			    <div class="carousel-item ratio ratio-21x9">
			      <img src="image/mainPage/konigssee.jpg" class="d-block w-100" alt="...">
			      <div class="carousel-caption d-none d-md-block">
			        <h5>Third</h5>
			        <p>Help me.</p>
			      </div>
			    </div>
			  </div>
			  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			  </button>
			  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			  </button>
			</div>
		<!-- <div id="slideBox">
			<div id="slidePanel">
			<div>1</div>
			<div>2</div>
			<div>3</div>
			<div>4</div>
			<div>5</div>
			</div> 
	 	</div> -->
	 	</article>
	 	<article id="poster">
	 		<!-- <div class="postercontainer">
			  <div id="carousel">
			    <figure data-number="1">1</figure>
			    <figure data-number="2">2</figure>
			    <figure data-number="3">3</figure>
			    <figure data-number="4">4</figure>
			    <figure data-number="5">5</figure>
			    <figure data-number="6">6</figure>
			    <figure data-number="7">7</figure>
			    <figure data-number="8">8</figure>
			    <figure data-number="9">9</figure>
			  </div>
			 </div> -->
	 		<h2 id="posterNameBox"> ?????????</h2> 
		<div id="posterBox">
			<div class="posterTemp">1
				<div class="posterImg"></div>
				<div class="posterExplain">5</div>
			</div>
			<div class="posterTemp">2
				<div class="posterImg"></div>
				<div class="posterExplain">6</div>
			</div>
			<div class="posterTemp">3
				<div class="posterImg"></div>
				<div class="posterExplain">7</div>
			</div>
			<div class="posterTemp">4
				<div class="posterImg"></div>
				<div class="posterExplain">8</div>
			</div>
	 	</div>
	 	</article>
	 	<article id="notice">
			<div id="noticeBox">
				<div id="mainNotice" class="noticeBoxCols">
					<h3>&#60;????????????&#62;</h3>
					<a href="#">???????????? ????????????  </a><br>
					<a href="#">???????????? ????????????  </a><br>
					<a href="#">???????????? ????????????  </a><br>
					<a href="#">???????????? ????????????  </a><br>
					<a href="#">???????????? ????????????  </a><br>
				</div>
					<div id="searchRankingNotice" class="noticeBoxCols">
					????????? ?????? ?????? ??????
				</div>
					<div id="eventNotice" class="noticeBoxCols">
					????????? ???
				</div>
		 	</div>
	 	</article>
	 	<article id="community">
	 		<h2 id="communityNameBox"> ????????????</h2> 
				<div id="communityBox">
					<div id="communityHref">
						<div id="SNSReview" class="communityBoxCols">
						????????? or ????????? ??????
						</div>
						<div id="accompanyBoard" class="communityBoxCols">
						????????? ?????? ?????? ??????
						</div>
						<div id="communityBoard" class="communityBoxCols">
						????????? ???
						</div>
					</div>
					<div id="communitySNSHashTag">
						<span>&#35;?????????</span>
						<span>&#35;????????????</span>
						<span>&#35;??????_????????????_???_????????????</span>
			 		</div>
			 		<div id="communityAmenity">
						?????? ?????? ????????? ??????
			 		</div>
			 		<div id="communityAd">
						???????????? ?????? ?????????
			 		</div>
			 		<div id="communityAllianceCard">
						????????? ??????
			 		</div>
			 		<div id="communityPublic">
						<div class="communityPublicCols">
						??????1
						</div>
						<div class="communityPublicCols">
						??????2
						</div>
						<div class="communityPublicCols">
						??????3
						</div>
						<div class="communityPublicCols">
						??????4
						</div>
			 		</div>
			 	</div>
			 	
	 	</article>
	 	<!-- <article id="feed">
	 		<h2 id="feedNameBox"> ??????</h2> 
		<div id="feedBox">
			<div>1</div>
			<div>2</div>
			<div>3</div>
			<div>4</div>
			<div>5</div>
			<div>6</div>
	 	</div>
	 	</article> -->
	 </section>
	 <footer id="bottomBox">
	 	<div id="ent-info">
			<div>
			????????????
			</div> 
	 	</div>
	 </footer>
	</div>
	</body>
</html>