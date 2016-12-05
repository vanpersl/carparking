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
<title>Cpa 智能停车系统  -- 联系我们</title>
<link href="styles/style.css" rel="stylesheet" type="text/css" />
<link href="styles/inner.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/hoverIntent.js"></script> 
<script type="text/javascript" src="js/superfish.js"></script> 
<script type="text/javascript" src="js/supersubs.js"></script>
<script type="text/javascript" src="js/contact.js"></script>
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
        	<div id="logo"><a href="uindex.jsp"><img src="images/cpa_logo.jpg" alt=""  /></a></div><!-- end #logo -->
            <div id="nav">
                <ul id="topnav" class="sf-menu">
                    <li><a href="uindex.jsp"  class="current">首页</a></li>
                    <li><a href="ulogin.jsp">登录</a></li>                
                    <li><a href="uregister.jsp">注册</a></li>
                    <li><a href="ShowSn.action">剩余车位</a></li>                  
                    <li><a href="ucontact.jsp">联系我们</a></li>
                </ul>
            </div>
        </div>
        
        <div id="header" class="innerpage">
        	<div class="shadow"></div>
        	<div class="container940">
        		<h1 class="pagetitle">联系我们</h1>
                <div class="pagedesc">如果您有对我们有一些不满意的地方，麻烦您及时向我们反馈.</div>
                <div class="clear"></div>
            </div>
        </div>
        
        
		<div id="content" class="withsidebar">
        	<div id="main">
            	<div id="maincontent">
                    <h2 class="title_pattern uppercase"><span>意见反馈中心</span></h2>
                    <p>请留下您的意见和建议，帮助我们做得更好</p>内容报道合作—欢迎各类媒体、影视剧公司、制作公司、专业网站、出版社、
                                                             协会等，<span class="colortext">与我们联系</span>在各类文字、图片、音视频资讯等方面建立长期合作。活动合作—欢迎各方与新浪网洽谈推广会议、论坛、演唱会、大奖赛、巡展或体育赛事等各类活动。通过新浪的报道推广，扩大相关活动的影响力。
                    
                    <div class="separator line"></div>
                    
                    
                    <div id="contactform">
                      <form id="contact" action="#">
                        <fieldset>
                          <label for="name" id="name_label">姓名:</label>
                          <input type="text" name="name" id="name"  value="" class="text-input" /><br/>
                          <label for="email" id="email_label">邮箱:</label>
                          <input type="text" name="email" id="email"  value="" class="text-input" /><br/>
                          <label for="subject" id="subject_label">主题:</label>
                          <input type="text" name="subject" id="subject"  value="" class="text-input" /><br/>
                          <label for="msg" id="msg_label">内容:</label>
                         <textarea cols="60" rows="10" name="msg" id="msg" ></textarea> <br class="clear" />
                          <input type="submit" name="submit" class="butcontact" id="submit_btn" value="提  交"/>
                        </fieldset>
                      </form>
                      <br class="clear" />
                      <span class="error" id="name_error">请输入姓名!</span>
                      <span class="error" id="email_error">请输入邮箱!</span>
                      <span class="error" id="email_error2">请输入正确的邮箱格式!</span>
                      <span class="error" id="msg_error">请输入内容!</span>
                      
                    </div>
                    
                     <div class="clear"></div>
                </div>
                <div id="sidebar">
                	<ul>
                    	<li class="widget-container">
                        	<h2 class="widget-title">联系我们</h2>
                            <div class="textwidget">
                           <p> Cpa System停车系统公司 学府路一段   24号<br/>
                            	西南航空港开发区, 成都 ，中国</p>
                            <p>
                            Tel: +86 028 85963948<br/>
                            Fax: +86 028 85963485<br/>
                            Email: <a href="mailto:lmrz@sohu.com" class="colortext">lmrz@sohu.com</a><br/>
                            Website: <a href="http://www.cuit.edu.cn" class="colortext">www.cpasystem.com</a><br/>
                            </p>
                            </div>
                        </li>
                    	<li class="widget-container">
                        	<h2 class="widget-title">Our Map</h2>
                            <div class="textwidget">
                            <iframe style="width:270px; height:250px; border:0; margin:0" src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Jalan+Kemanggisan+Utama,+Jakarta,+Indonesia&amp;sll=37.0625,-95.677068&amp;sspn=46.092115,79.013672&amp;ie=UTF8&amp;hq=&amp;hnear=Jalan+Kemanggisan+Utama,+Jakarta+Barat,+Jakarta,+Indonesia&amp;ll=-6.189793,106.7908&amp;spn=0.016639,0.034246&amp;z=14&amp;iwloc=A&amp;output=embed"></iframe><br /><small><a href="http://maps.google.com/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Jalan+Kemanggisan+Utama,+Jakarta,+Indonesia&amp;sll=37.0625,-95.677068&amp;sspn=46.092115,79.013672&amp;ie=UTF8&amp;hq=&amp;hnear=Jalan+Kemanggisan+Utama,+Jakarta+Barat,+Jakarta,+Indonesia&amp;ll=-6.189793,106.7908&amp;spn=0.016639,0.034246&amp;z=14&amp;iwloc=A" style="text-align:left; color:#555">View Larger Map</a></small>
                            </div>
                        </li>
                    </ul>
                </div><!-- end #sidebar -->
                
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