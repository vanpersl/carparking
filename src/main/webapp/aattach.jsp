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
<title>停车管理系统---系统管理员端</title>
<link href="styles/style.css" rel="stylesheet" type="text/css" />
<link href="styles/inner.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/hoverIntent.js"></script> 
<script type="text/javascript" src="js/superfish.js"></script> 
<script type="text/javascript" src="js/supersubs.js"></script>
<script type="text/javascript">
jQuery(document).ready(function(){
	jQuery("ul.sf-menu").supersubs({ 
	minWidth		: 12,		
	maxWidth		: 27,		
	extraWidth		: 3							  
	}).superfish(); 
					 					 
	jQuery(".tab-content").hide();
	jQuery("ul.tabs li:first").addClass("active").show(); 
	jQuery(".tab-content:first").show(); 
	//On Click Event
	jQuery("ul.tabs li").click(function() {
		jQuery("ul.tabs li").removeClass("active");
		jQuery(this).addClass("active");
		jQuery(".tab-content").hide(); 
		var activeTab = jQuery(this).find("a").attr("href");
		jQuery(activeTab).fadeIn(200); 
		return false;
	});
					 
});
</script>
</head>
<body>
<div>
	欢迎您：[<s:property value="#session.obja.adminRname"/>] | <a href="LogoutAdm.action">退出系统</a>
</div>
<div id="outer-container">
	<div id="container">
    	<div id="top">
        	<div id="logo"><a href="amngcpa.jsp"><img src="images/cpa_logo.jpg" alt=""  /></a>
        	</div>
            <div id="nav">
                <ul id="topnav" class="sf-menu">
                    <li><a href="amngcpa.jsp">停车场设置</a></li>
                    <li><a href="#">员工管理</a>
                    	<ul>
                            <li><a href="aincadm.jsp">增加员工</a></li>
                            <li><a href="aclearadm.jsp">注销员工</a></li>                           
                        </ul>
                    </li>
                    <li><a href="#">查看停车场</a>
                    	<ul>
                            <li><a href="acparecord.jsp">历史停车记录</a></li>
                            <li><a href="acebrecord.jsp">当前停放所有车辆</a></li>  
                            <li><a href="aquery.jsp">某一停车场停车情况</a></li> 
                            <li><a href="ShowSn.action">剩余车位</a></li>                                                     
                        </ul>
                    </li>
                    <li><a href="#">查看员工</a>
                    	<ul>
                            <li><a href="aworklog.jsp">工作记录</a></li>
                            <li><a href="arechlog.jsp">充值记录</a></li>  
                            <li><a href="acashlog.jsp">收取现金</a></li>                                                      
                        </ul>
                    </li>
                    <li><a href="apubnew.jsp">发布新闻</a>                   
                  
                </ul><!-- #topnav -->
            </div><!-- #nav -->	
        </div><!-- end #top -->
        
        <div id="header" class="innerpage">
        	<div class="shadow"></div>
        	<div class="container940">
        		<h1 class="pagetitle">系统管理员端</h1>
                <div class="pagedesc">以优质的服务吸引客户，以专业的技巧提高效率</div>
                <div class="clear"></div>
            </div>
        </div>
        
        
		<div id="content">
        	<div id="main">               
                <h2 class="title_pattern uppercase"><span><font color="blue"><s:property value="#request.var"/></font>当前车辆停放信息</span></h2>      
                <div class="separator"></div>   
                <table id="tabfst" align="center" title="<s:property value="#request.var"/>当前所停车辆情况">
					<tr align="center">
						<td width="18%">入场时间</td>
						<td width="15%">车牌号码</td>
						<td width="10%">车辆类型</td>
						<td width="10%">支付卡类型</td>
						<td width="14%">停车编号</td>
						<td width="10%">停车状态</td>
						<td width="12%">入场经办人</td>
						<td width="11%">备注信息</td>
					</tr>
					<s:iterator value="ceb">
						<tr align="center">
							<td width="18%"><s:property value="cpaEnterTime"/></td>
							<td width="15%"><s:property value="cpaEnterCarno"/></td>
							<td width="10%"><s:property value="cpaEnterType"/></td>
							<td width="10%"><s:property value="cpaEnterBt"/></td>
							<td width="14%"><s:property value="cpaEnterEn"/></td>
							<td width="10%"><s:property value="cpaEnterStatus"/></td>
							<td width="12%"><s:property value="cpaEnterOpt"/></td>
							<td width="11%"><s:property value="cpaEnterCarbz"/></td>
					    </tr>
					</s:iterator>
				</table>
				<div id="pageaction">
				共<strong><s:property value="#request.intPageCount"/></strong>页
			                        <a href="ShowOneCeb.action?pageNow=1">首页</a>
			                        <a href="ShowOneCeb.action?pageNow=<s:property value='%{PageNow-1}'/>"> 上一页</a>
			                        <a href="ShowOneCeb.action?pageNow=<s:property value='%{PageNow+1}'/>">下一页</a>
			                        <a href="ShowOneCeb.action?pageNow=<s:property value='#request.intPageCount'/>">末页</a>
			                        <span>第<strong><s:property value="#request.pageNow"/></strong>页</span>
				</div>              
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