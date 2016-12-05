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
<title>Cpa 新闻频道</title>
<link href="styles/style.css" rel="stylesheet" type="text/css" />
<link href="styles/inner.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
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
					 
});
</script>
</head>
<body>

<div id="outer-container">
	<div id="container">
    	<div id="top">
        	<div id="logo"><a href="admlog.jsp"><img src="images/cpa_logo.jpg" alt=""  /></a></div><!-- end #logo -->
            <div id="nav">
                <ul id="topnav" class="sf-menu">
                    <li><a href="uindex.jsp"  class="current">公共首页</a></li>
                </ul><!-- #topnav -->
            </div><!-- #nav -->	
        </div><!-- end #top -->       
        
        <div id="header" class="innerpage">
        	<div class="shadow"></div>
        	<div class="container940">
        		<h1 class="pagetitle">新闻频道</h1>
                <div class="pagedesc">竭诚为客户服务是我们的宗旨！</div>
                <div class="clear"></div>
            </div>
        </div>
        
        
             
		<div id="content" class="withsidebar">
        	<div id="main">
            	<div id="maincontent">
                     
                     <div class="post">
                     	<s:iterator value="cnb">
                         <img src="images/content/post1.jpg" alt="" class="frame" />
                         <span class="shadowimg610"></span>
                         <div class="entry-utility">
                            <span class="postauthor"><img src="images/icons/author.png" alt="" />管理员</span>
                            <span class="postdate"><img src="images/icons/date.png" alt="" /><s:property value="date"/></span>
                            <span class="postcomm"><img src="images/icons/comment.png" alt="" />
                             <%
							    Integer count = (Integer)application.getAttribute("count");
							    if(count==null){
							     count=1;
							     application.setAttribute("count",count);
							    }else{
							     count++;
							     application.setAttribute("count",count);
							    }
							    %>
							    访问量：
							    <%=count %>
                            </span>
                         </div>
                         <div class="entry-content">
                         	<h2 class="posttitle"></h2>
                         	<h2 align="center"><s:property value="title"/></h2>
                         	<br>
                            <p>
                            	<s:property value="content"/>
                            </p>                          
                         </div>
                         </s:iterator>                        
                     </div><!-- .post -->                                                                                
                    
                     <div class="clear"></div><!-- clear float -->
                </div><!-- end #maincontent -->
                <div id="sidebar">
                	<ul>
                    	<li class="widget-container">
                        	<h2 class="widget-title">新闻报道</h2>
                            <div class="textwidget">
                            <span class="colortext">该新闻摘自互联网，任何权益纠纷请联系原作者</span>.
                            </div>
                        </li>
                    	<li class="widget-container">
                            <h2 class="widget-title">最近阅读</h2>
                            <ul id="recentcommentwidget">
                                <li>
                                    <img src="images/content/imgcomm1.jpg" alt="" class="alignleft" />
                                    <span class="colortext">用户一</span>
                                    <span><a href="#">访问他/她.</a></span>
                                    <span class="clear"></span>
                                </li>
                                <li>
                                    <img src="images/content/imgcomm2.jpg" alt="" class="alignleft" />
                                    <span class="colortext">用户二</span>
                                     <span><a href="#">访问他/她.</a></span>
                                    <span class="clear"></span>
                                </li>
                                <li>
                                    <img src="images/content/imgcomm3.jpg" alt="" class="alignleft" />
                                    <span class="colortext">用户三</span>
                                     <span><a href="#">访问他/她.</a></span>
                                    <span class="clear"></span>
                                </li>
                            </ul>
                        </li>                   	 	
                    </ul>
                </div><!-- end #sidebar -->
                
                <div class="clear"></div><!-- clear float -->
            </div><!-- end #main -->
		</div><!-- end #content -->      		
        
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
        </div>
        
	</div><!-- end #container -->
</div><!-- end #outer-container -->
		
</body>
</html>
