/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-07 14:22:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>Insert title here</title>\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/menu.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mainPage/slideShow.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mainPage/poster.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mainPage/notice.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mainPage/community.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mainPage/feed.css\">\r\n");
      out.write("		<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</style>\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("		<script src=\"js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("		<script src=\"js/mainPage/subMenu.js\"></script>\r\n");
      out.write("		<script src=\"js/mainPage/slideShow.js\"></script>\r\n");
      out.write("		<script src=\"js/mainPage/poster.js\"></script>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("	<header>\r\n");
      out.write("	<!-- top navBar -->\r\n");
      out.write("		<div class=\"navbar navbar-expand-lg navbar-light bg-light d-flex justify-content-between bg-$blue-100\">\r\n");
      out.write("		    <div class=\"container-fluid\"  style=\"background-color:#CFE2FF\">\r\n");
      out.write("		      <a class=\"navbar-brand col-1\" href=\"#\">Navbar</a>\r\n");
      out.write("		      <form class=\"d-flex col-6\">\r\n");
      out.write("		        <input class=\"form-control me-2 rounded-0 rounded-top border-0 border-bottom border-dark\" style=\"background-color:#CFE2FF\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("		        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("		      </form>\r\n");
      out.write("		        <ul class=\"navbar-nav me-5 \">\r\n");
      out.write("		          <li class=\"nav-item dropdown\">\r\n");
      out.write("		            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("		              Dropdown\r\n");
      out.write("		            </a>\r\n");
      out.write("		            <ul class=\"dropdown-menu me-7\" aria-labelledby=\"navbarDropdown\" style=\"right:1%\">\r\n");
      out.write("		              <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("		              <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("		              <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("		              <li><a class=\"dropdown-item\" href=\"#\">Something else</a></li>\r\n");
      out.write("		            </ul>\r\n");
      out.write("		          </li>\r\n");
      out.write("		        </ul>\r\n");
      out.write("		    </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		  <!-- 잘못된 div 및 col 사용으로 인한 배열 정리 실패 -->\r\n");
      out.write("<!-- 		<nav class=\"navbar bg-light\">\r\n");
      out.write("		  <div class=\"d-flex flex-row justify-content-between\">\r\n");
      out.write("		    <div class=\"col-4\"><a class=\"navbar-brand\">Navbar</a></div>\r\n");
      out.write("		    <div class=\"col-4\">\r\n");
      out.write("		    	<form class=\"d-flex\" role=\"search\">\r\n");
      out.write("		     	 <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("		      	<button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("		   		</form>\r\n");
      out.write("		   	</div>\r\n");
      out.write("		   	<div class=\"col-4 navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("		      <ul class=\"col-4 navbar-collapse navbar-nav\">\r\n");
      out.write("		        <li class=\"nav-item\">\r\n");
      out.write("		          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("		        <li class=\"nav-item\">\r\n");
      out.write("		          <a class=\"nav-link\" href=\"#\">Features</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("		        <li class=\"nav-item\">\r\n");
      out.write("		          <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("		        <li class=\"nav-item\">\r\n");
      out.write("		          <a class=\"nav-link disabled\">Disabled</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("		      </ul>\r\n");
      out.write("		    </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</nav> -->\r\n");
      out.write("		<!-- <div id=\"top-headBox\">\r\n");
      out.write("			<div id=\"top-headLogo\">\r\n");
      out.write("			<h3>로고</h3>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"top-headSearchBar\">\r\n");
      out.write("				<form>\r\n");
      out.write("					<input type=\"text\" name=\"mainSearch\" value=\"search...\">\r\n");
      out.write("					<input type=\"submit\" name=\"mainSearchBtn\" value=\"검색\">\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"top-headLoginSignUp\">\r\n");
      out.write("			<a href=\"#\">회원가입 </a>/\r\n");
      out.write("			<a href=\"#\">로그인 &nbsp;</a>\r\n");
      out.write("			</div>\r\n");
      out.write("	 	</div> -->\r\n");
      out.write("	</header>\r\n");
      out.write("	 <nav>\r\n");
      out.write("		<div id=\"menuBox\">\r\n");
      out.write("			<div id=\"mainMenuBox\">\r\n");
      out.write("			메인메뉴\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"subMenuBox\">\r\n");
      out.write("			서브메뉴\r\n");
      out.write("			</div>	 \r\n");
      out.write("	 	</div>\r\n");
      out.write("	 </nav>\r\n");
      out.write("	 <section>\r\n");
      out.write("	 <!-- 홈페이지 소개를 위한 슬라이드 배너 -->\r\n");
      out.write("	 	<article class=\"ratio ratio-21x9\" id=\"slideShow\">\r\n");
      out.write("	 		<div id=\"carouselExampleDark\" class=\"carousel carousel-dark slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("			  <div class=\"carousel-indicators\">\r\n");
      out.write("			    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("			    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("			    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"carousel-inner\">\r\n");
      out.write("			    <div class=\"carousel-item active ratio ratio-21x9\" data-bs-interval=\"3000\">\r\n");
      out.write("			      <img src=\"image/mainPage/konigssee.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("			      <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("			        <h5>Festith</h5>\r\n");
      out.write("			        <p>First companion</p>\r\n");
      out.write("			      </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			    <div class=\"carousel-item ratio ratio-21x9\" data-bs-interval=\"3000\">\r\n");
      out.write("			      <img src=\"image/mainPage/konigssee.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("			      <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("			        <h5>Second</h5>\r\n");
      out.write("			        <p>I really almost died.</p>\r\n");
      out.write("			      </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			    <div class=\"carousel-item ratio ratio-21x9\">\r\n");
      out.write("			      <img src=\"image/mainPage/konigssee.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("			      <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("			        <h5>Third</h5>\r\n");
      out.write("			        <p>Help me.</p>\r\n");
      out.write("			      </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide=\"prev\">\r\n");
      out.write("			    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("			    <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("			  </button>\r\n");
      out.write("			  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide=\"next\">\r\n");
      out.write("			    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("			    <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("			  </button>\r\n");
      out.write("			</div>\r\n");
      out.write("		<!-- <div id=\"slideBox\">\r\n");
      out.write("			<div id=\"slidePanel\">\r\n");
      out.write("			<div>1</div>\r\n");
      out.write("			<div>2</div>\r\n");
      out.write("			<div>3</div>\r\n");
      out.write("			<div>4</div>\r\n");
      out.write("			<div>5</div>\r\n");
      out.write("			</div> \r\n");
      out.write("	 	</div> -->\r\n");
      out.write("	 	</article>\r\n");
      out.write("	 	<article id=\"poster\">\r\n");
      out.write("	 		<!-- <div class=\"postercontainer\">\r\n");
      out.write("			  <div id=\"carousel\">\r\n");
      out.write("			    <figure data-number=\"1\">1</figure>\r\n");
      out.write("			    <figure data-number=\"2\">2</figure>\r\n");
      out.write("			    <figure data-number=\"3\">3</figure>\r\n");
      out.write("			    <figure data-number=\"4\">4</figure>\r\n");
      out.write("			    <figure data-number=\"5\">5</figure>\r\n");
      out.write("			    <figure data-number=\"6\">6</figure>\r\n");
      out.write("			    <figure data-number=\"7\">7</figure>\r\n");
      out.write("			    <figure data-number=\"8\">8</figure>\r\n");
      out.write("			    <figure data-number=\"9\">9</figure>\r\n");
      out.write("			  </div>\r\n");
      out.write("			 </div> -->\r\n");
      out.write("	 		<h2 id=\"posterNameBox\"> 포스터</h2> \r\n");
      out.write("		<div id=\"posterBox\">\r\n");
      out.write("			<div class=\"posterTemp\">1\r\n");
      out.write("				<div class=\"posterImg\"></div>\r\n");
      out.write("				<div class=\"posterExplain\">5</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"posterTemp\">2\r\n");
      out.write("				<div class=\"posterImg\"></div>\r\n");
      out.write("				<div class=\"posterExplain\">6</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"posterTemp\">3\r\n");
      out.write("				<div class=\"posterImg\"></div>\r\n");
      out.write("				<div class=\"posterExplain\">7</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"posterTemp\">4\r\n");
      out.write("				<div class=\"posterImg\"></div>\r\n");
      out.write("				<div class=\"posterExplain\">8</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	 	</div>\r\n");
      out.write("	 	</article>\r\n");
      out.write("	 	<article id=\"notice\">\r\n");
      out.write("			<div id=\"noticeBox\">\r\n");
      out.write("				<div id=\"mainNotice\" class=\"noticeBoxCols\">\r\n");
      out.write("					<h3>&#60;공지사항&#62;</h3>\r\n");
      out.write("					<a href=\"#\">공지사항 공지사항  </a><br>\r\n");
      out.write("					<a href=\"#\">공지사항 공지사항  </a><br>\r\n");
      out.write("					<a href=\"#\">공지사항 공지사항  </a><br>\r\n");
      out.write("					<a href=\"#\">공지사항 공지사항  </a><br>\r\n");
      out.write("					<a href=\"#\">공지사항 공지사항  </a><br>\r\n");
      out.write("				</div>\r\n");
      out.write("					<div id=\"searchRankingNotice\" class=\"noticeBoxCols\">\r\n");
      out.write("					실시간 행사 검색 순위\r\n");
      out.write("				</div>\r\n");
      out.write("					<div id=\"eventNotice\" class=\"noticeBoxCols\">\r\n");
      out.write("					이벤트 칸\r\n");
      out.write("				</div>\r\n");
      out.write("		 	</div>\r\n");
      out.write("	 	</article>\r\n");
      out.write("	 	<article id=\"community\">\r\n");
      out.write("	 		<h2 id=\"communityNameBox\"> 커뮤니티</h2> \r\n");
      out.write("				<div id=\"communityBox\">\r\n");
      out.write("					<div id=\"communityHref\">\r\n");
      out.write("						<div id=\"SNSReview\" class=\"communityBoxCols\">\r\n");
      out.write("						인스타 or 블로그 리뷰\r\n");
      out.write("						</div>\r\n");
      out.write("						<div id=\"accompanyBoard\" class=\"communityBoxCols\">\r\n");
      out.write("						실시간 행사 검색 순위\r\n");
      out.write("						</div>\r\n");
      out.write("						<div id=\"communityBoard\" class=\"communityBoxCols\">\r\n");
      out.write("						이벤트 칸\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div id=\"communitySNSHashTag\">\r\n");
      out.write("						<span>&#35;워터밤</span>\r\n");
      out.write("						<span>&#35;에버랜드</span>\r\n");
      out.write("						<span>&#35;인천_펜타포드_락_페스티벌</span>\r\n");
      out.write("			 		</div>\r\n");
      out.write("			 		<div id=\"communityAmenity\">\r\n");
      out.write("						숙소 연계 이벤트 배너\r\n");
      out.write("			 		</div>\r\n");
      out.write("			 		<div id=\"communityAd\">\r\n");
      out.write("						커뮤니티 광고 이미지\r\n");
      out.write("			 		</div>\r\n");
      out.write("			 		<div id=\"communityAllianceCard\">\r\n");
      out.write("						카드사 제휴\r\n");
      out.write("			 		</div>\r\n");
      out.write("			 		<div id=\"communityPublic\">\r\n");
      out.write("						<div class=\"communityPublicCols\">\r\n");
      out.write("						배너1\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"communityPublicCols\">\r\n");
      out.write("						배너2\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"communityPublicCols\">\r\n");
      out.write("						배너3\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"communityPublicCols\">\r\n");
      out.write("						배너4\r\n");
      out.write("						</div>\r\n");
      out.write("			 		</div>\r\n");
      out.write("			 	</div>\r\n");
      out.write("			 	\r\n");
      out.write("	 	</article>\r\n");
      out.write("	 	<!-- <article id=\"feed\">\r\n");
      out.write("	 		<h2 id=\"feedNameBox\"> 피드</h2> \r\n");
      out.write("		<div id=\"feedBox\">\r\n");
      out.write("			<div>1</div>\r\n");
      out.write("			<div>2</div>\r\n");
      out.write("			<div>3</div>\r\n");
      out.write("			<div>4</div>\r\n");
      out.write("			<div>5</div>\r\n");
      out.write("			<div>6</div>\r\n");
      out.write("	 	</div>\r\n");
      out.write("	 	</article> -->\r\n");
      out.write("	 </section>\r\n");
      out.write("	 <footer id=\"bottomBox\">\r\n");
      out.write("	 	<div id=\"ent-info\">\r\n");
      out.write("			<div>\r\n");
      out.write("			기업정보\r\n");
      out.write("			</div> \r\n");
      out.write("	 	</div>\r\n");
      out.write("	 </footer>\r\n");
      out.write("	</div>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
