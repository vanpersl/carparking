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
<s:if test="#session.ui != null">
	<meta http-equiv="refresh" content="0;URL=ubis.jsp">
</s:if>
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
		
		$("#refreshVerificode").click(function(){
			//点击更新验证码
			$("#yanzheng").attr("src","verifycode.do");
		});
	});				  
					 
});
</script>
</head>
<body>
<s:if test="#session.ui != null">
	sssss
</s:if>
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
        
        <div id="header" class="innerpage">
        	<div class="shadow"></div>
        	<div class="container940">
        		<h1 class="pagetitle">客户为尊</h1>
                <div class="pagedesc">高新技术---带给你全新的泊车享受</div>
                <div class="clear"></div>
            </div>
        </div>
        
        
		<div id="content">
        	<div id="main">               
                <h2 class="title_pattern uppercase"><span>用户登录</span></h2>
                <form name="UserLogin" method="post" action="UserLogin.do">
					<table align="center" width="300">			               
			                <tr>
			                    <td width="30%">用户名：</td>
			                    <td width="70%"><input type="text" name="name" size="19" maxlength="12" style="width:140px;height:40"/></td>
			                </tr>
			                <tr><td>&nbsp;</td></tr>
			                <tr>
			                    <td width="30%">密码：</td>
			                    <td width="70%"><input type="password" name="password" size="19" maxlength="12" style="width:140px;height:40"/></td>
			                </tr>
			                <tr>
			                    <td width="30%">验证码：</td>
			                    <td width="70%"><input type="verificode" name="verificode" size="19" maxlength="4" style="width:140px;height:40"/>
   									<span><img width="70" height="30" style="cursor:pointer;" alt="点击切换" src="verifycode.do" id="refreshVerificode"/></span>
   								</td>
			                </tr>
			                <tr><td>&nbsp;</td></tr>			                
			                <tr align="center">
			                    <td colspan="2">
			                        <input type="submit" value="登录" />
			                        <input type="reset" value="重置" />
			                    </td>
			                </tr>
			            </table>
			   	</form>
            	<div class="clear"></div>
            </div>
		</div>
        
        
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