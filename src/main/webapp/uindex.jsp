<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="images/favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="robots" content="index, follow" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<title>Cpa 智能停车系统</title>
<link href="styles/style.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="styles/skitter.styles.css" media="all" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.animate-colors-min.js"></script>
<script type="text/javascript" src="js/jquery.skitter.js"></script>
<script type="text/javascript" src="js/hoverIntent.js"></script> 
<script type="text/javascript" src="js/superfish.js"></script> 
<script type="text/javascript" src="js/supersubs.js"></script>
<script type="text/javascript">
jQuery(document).ready(function(){
	//Menu
	jQuery("ul.sf-menu").supersubs({ 
	minWidth		: 12,		
	maxWidth		: 27,		
	extraWidth		: 3	
	}).superfish(); 
					 
	jQuery(document).ready(function() {
		jQuery(".box_skitter_large").skitter({
			animation: "random",
			interval: 3000,
			numbers: false, 
			numbers_align: "right", 
 			hideTools: true,
			controls: false,
			focus: false,
			focus_position: true,
			width_label:'340px', 
			enable_navigation_keys: true,   
 			progressbar: false
		});
	});				  
					 
});
</script>
</head>
<body>

<div id="outer-container">
	<div id="container">
    	<div id="top">
        	<div id="logo"><a href="uindex.jsp"><img src="images/cpa_logo.jpg" alt=""  /></a></div><!-- end #logo -->
            <div id="nav">
                <ul id="topnav" class="sf-menu">
                    <li><a href="uindex.jsp"  class="current">首页</a></li>
                    <li><a href="ulogin.jsp">登录</a></li>                
                    <li><a href="uregister.jsp">注册</a></li>
                    <li><a href="ShowSn.action">剩余车位</a></li>                   
                    <li><a href="ucontact.jsp">联系我们</a></li>
                </ul><!-- #topnav -->
            </div><!-- #nav -->	
        </div><!-- end #top -->
        
        <div id="header">
        	<div id="slider-container">
            	
                <div class="box_skitter box_skitter_large">
                    <ul>
                        <li>
                            <a href="#"><img src="images/content/slide_3.jpg" alt="" /></a>
                            <div class="label_text">
                                <h3 class="colortext uppercase">我们是 Cpa System</h3>
                                <span>为客户提供专业的停车场解决方案，以及系统升级、维护或者其它咨询服务.</span>
                            </div>
                        </li>
                        <li>
                            <a href="#"><img src="images/content/slide_1.jpg" alt="" /></a>
                            <div class="label_text">
                                <h3 class="colortext uppercase">采 用 最 新 技 术</h3>
                                <span>能为你的车辆提供全方位的看护</span>
                            </div>
                        </li>
                        <li>
                            <a href="#"><img src="images/content/slide_2.jpg" alt="" /></a>
                            <div class="label_text"> 
                                <h3 class="colortext uppercase">客 户 反 馈 良 好</h3>
                                <span>质量过关  不会出现漏洞或者死机现象</span>
                            </div>
                        </li>
                    </ul>
                </div>
                <div id="shadow-img-slider"></div>
            </div><!-- end #slider-container -->
        </div><!-- end #header -->
        
        <div id="after-header">
        	<h1>您好！我们是<span class="colortext">Cpa System公司</span>并且我们有<span class="colortext">最好</span>的停车系统解决方案<br/>我们将带给您全新的停车享受</h1>
        </div><!-- end #after-header -->
        
        <div id="before-content" class="patternbox">
        	<div class="shadow"></div>
        	<div class="container940">
            	<ul class="customlist">
                	<li>
                        <img src="images/icons/icon1.png" alt="" class="alignleft" /><h3 class="valignmiddle">灵活的方案</h3>
                        <span>我们有众多资深的行业顾问，能为你的停车场量身定制一套高效的系统</span>
                    </li>
                	<li>
                        <img src="images/icons/icon2.png" alt="" class="alignleft" /><h3 class="valignmiddle">整洁的页面</h3>
                        <span>整洁舒适的页面能积极的影响员工情绪，使员工真正的爱上工作</span>
                    </li>
                	<li class="last">
                        <img src="images/icons/icon3.png" alt="" class="alignleft" /><h3 class="valignmiddle">专业的技术</h3>
                        <span>众多的技术精湛的工程师，能够制造一套安全性极高的系统，让你不在担忧系统崩溃</span>
                    </li>
                </ul>
                <div class="clear"></div><!-- clear float -->
            </div><!-- end container940 -->
        </div><!-- end #before-content -->
        
		<div id="content">
        	<div id="main">
                <h2 class="title_pattern uppercase"><span>已有的解决方案</span></h2>
                <ul id="recentpost">
                    <li>
                        <img src="images/content/p1.jpg" alt="" class="frame" />
                        <span class="shadowimg220"></span>
                        <div class="entry-date">2008/01/12 - <a href="#">点此参观</a></div>
                        <h5 class="colortext"><a href="#">抚顺校区停车场</a></h5>
                        <span>智能停车系统，适应当今快节奏的生活应运而生，它能极大地提高停车场的泊取车效率，极大地节省人工成本， 并且能够实现电子支付功能.</span>
                    </li>
                    <li>
                        <img src="images/content/p2.jpg" alt="" class="frame" />
                        <span class="shadowimg220"></span>
                        <div class="entry-date">2008/09/30 - <a href="#">点此参观</a></div>
                        <h5 class="colortext"><a href="#">成信院停车场</a></h5>
                        <span>智能停车系统，适应当今快节奏的生活应运而生，它能极大地提高停车场的泊取车效率，极大地节省人工成本， 并且能够实现电子支付功能.</span>
                    </li>
                    <li>
                        <img src="images/content/p3.jpg" alt="" class="frame" />
                        <span class="shadowimg220"></span>
                        <div class="entry-date">2009/03/22 - <a href="#">点此参观</a></div>
                        <h5 class="colortext"><a href="#">天赋广场停车场</a></h5>
                        <span>智能停车系统，适应当今快节奏的生活应运而生，它能极大地提高停车场的泊取车效率，极大地节省人工成本， 并且能够实现电子支付功能.</span>
                    </li>
                    <li class="last">
                        <img src="images/content/p4.jpg" alt="" class="frame" />
                        <span class="shadowimg220"></span>
                        <div class="entry-date">2010/11/05 - <a href="#">点此参观</a></div>
                        <h5 class="colortext"><a href="#">加州港湾</a></h5>
                        <span>智能停车系统，适应当今快节奏的生活应运而生，它能极大地提高停车场的泊取车效率，极大地节省人工成本， 并且能够实现电子支付功能.</span>
                    </li>
                </ul>
                <div class="clear"></div><!-- clear float -->
            </div><!-- end #main -->
		</div><!-- end #content -->
        
        <div id="after-content" class="patternbox">
        	<div class="container940">
            	<a href="#" class="button large">立即购买 !</a>
            	<h2>您停车场管理方案想使用<span class="colortext">Cpa System</span>吗  ? 当然可以.</h2>
                <div class="clear"></div><!-- clear float -->
            </div><!-- end container940 -->
        </div><!-- end #after-content -->
        
        
		<div id="footer">
        <div id="footer-pattern">
        
			<div class="container940">
            	<div id="footcol1">
                	<ul>
                    	<li class="widget-container">
                            <h2 class="widget-title">最新客户 </h2>
                            <ul id="recentpostwidget">
                                <li>
                                    <img src="images/content/pic5.jpg" alt="" class="alignleft frame" />
                                    <h5><a href="#">酋长球场停车场!</a></h5>
                                    <span>深受驾车球迷好评！短时间内能大量进行出入场</span>
                                </li>
                                <li>
                                    <img src="images/content/pic6.jpg" alt="" class="alignleft frame" />
                                    <h5><a href="#">海布里停车场!</a></h5>
                                    <span>公司的标杆系统,系统运行期间未发现任何漏洞</span>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div id="footcol2">
                	<ul>
                        <li class="widget-container">
                        	<h2 class="widget-title">信息公告</h2>
                            <marquee scrollAmount=2 width=200 height=130 direction=up onmouseover=this.stop() onmouseout=this.start() >
								<s:iterator value="#session.newsList">
									<div><a href="Newfw.action?uid=<s:property value="id"/>" target="_blank"><s:property value="title"/></a></div>
								</s:iterator>
							</marquee>
                        </li>
                    </ul>
                </div>
                <div id="footcol3">
                	<ul>
                        <li class="widget-container">
                        	<h2 class="widget-title">方案效果</h2>
                             <ul id="flickr">
                            	<li><a href="#"><img src="images/content/pic7.jpg" alt="" class="frame" /></a></li>
                                <li><a href="#"><img src="images/content/pic8.jpg" alt="" class="frame" /></a></li>
                                <li class="nomargin"><a href="#"><img src="images/content/pic9.jpg" alt="" class="frame" /></a></li>
                                <li><a href="#"><img src="images/content/pic10.jpg" alt="" class="frame" /></a></li>
                                <li><a href="#"><img src="images/content/pic11.jpg" alt="" class="frame" /></a></li>
                                <li class="nomargin"><a href="#"><img src="images/content/pic12.jpg" alt="" class="frame" /></a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div id="footcol4">
                	<ul>
                        <li class="widget-container">
                        	<h2 class="widget-title">关于Cpa System</h2>
                            <div class="textwidget">
                            <p>
                            	智能停车系统，适应当今快节奏的生活应运而生，它能极大地提高停车场的泊取车效率，极大地节省人工成本，
                            	并且能够实现电子支付功能.使支付方式实现了无纸化，并且方便用户管理停车场，是你值得你信赖的方案提供商。
                            </p>
                            </div>
                        </li>
                    </ul>
                </div>
           
            <div class="clear"></div><!-- clear float -->
            </div><!-- end container940 -->
            
        </div><!-- end #footer-pattern -->  
		</div><!-- end #footer -->
        
        <div id="after-footer">
        	<div class="container940">
                <div id="sn">
                	<ul>
                    	<li><a href="#"><img src="images/icons/fb.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/icons/stumbleupon.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/icons/lastfm.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/icons/twitter.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/icons/youtube.png" alt="" /></a></li>
                    </ul>
                </div>
                <div id="footertext">
                    Copyright &copy;2012 Cpa System.  All Rights Reserved. 【Recommended To Use IE6.0 or Above Browse.】
                </div>
               <div class="clear"></div><!-- clear float -->
            </div><!-- end container940 -->
        </div><!-- end #after-footer -->
        
	</div><!-- end #container -->
</div><!-- end #outer-container -->
		
</body>
</html>