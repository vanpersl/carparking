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
<title>Cpa 智能停车系统后台登陆</title>
<link href="styles/style.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="styles/skitter.styles.css" media="all"
	rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.animate-colors-min.js"></script>
<script type="text/javascript" src="js/jquery.skitter.js"></script>
<script type="text/javascript" src="js/hoverIntent.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/supersubs.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		//Menu
		jQuery("ul.sf-menu").supersubs({
			minWidth : 12,
			maxWidth : 27,
			extraWidth : 3
		}).superfish();

		jQuery(document).ready(function() {
			jQuery(".box_skitter_large").skitter({
				animation : "random",
				interval : 3000,
				numbers : false,
				numbers_align : "right",
				hideTools : true,
				controls : false,
				focus : false,
				focus_position : true,
				width_label : '340px',
				enable_navigation_keys : true,
				progressbar : false
			});
		});

	});
</script>
</head>
<body>
	<s:if test="#session.ui != null">
请登录
</s:if>
	<div id="outer-container">
		<div id="container">
			<div id="top">
				<div id="logo">
					<a href="admlog.jsp"><img src="images/cpa_logo.jpg" alt="" /></a>
				</div>
				<!-- end #logo -->
				<div id="nav">
					<ul id="topnav" class="sf-menu">
						<li><a href="uindex.jsp" class="current">公共首页</a></li>
					</ul>
					<!-- #topnav -->
				</div>
				<!-- #nav -->
			</div>
			<!-- end #top -->

			<div id="header" class="innerpage">
				<div class="shadow"></div>
				<div class="container940">
					<h1 class="pagetitle">系统后台</h1>
					<div class="pagedesc">爱岗、敬业、热忱、严谨</div>
					<div class="clear"></div>
				</div>
			</div>

			<div id="content">
				<div id="main">
					<h2 class="title_pattern uppercase">
						<span>后台登陆</span>
					</h2>
					<s:form action="Login.action" method="post">
						<table align="center" width="300">
							<tr>
								<td width="30%">用户名：</td>
								<td width="70%"><input type="text" name="name" size="19"
									maxlength="12" style="width: 140px; height: 16" /></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td width="30%">密码：</td>
								<td width="70%"><input type="password" name="password"
									size="19" maxlength="12" style="width: 140px; height: 16" /></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>身份：</td>
								<td><select name="loginStatus">
										<option value="operator" label="操作员" selected="selected" />
										<option value="admin" label="管理员" />
								</select></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr align="center">
								<td colspan="2"><input type="submit" value="登录" /> <input
									type="reset" value="重置" /></td>
							</tr>
						</table>
					</s:form>
					<div class="clear"></div>
				</div>
			</div>

			<div id="after-footer">
				<div class="container940">
					<div id="sn">
						<ul>
							<li><a href="#"><img src="images/icons/fb.png" alt="" /></a></li>
							<li><a href="#"><img src="images/icons/stumbleupon.png"
									alt="" /></a></li>
							<li><a href="#"><img src="images/icons/lastfm.png"
									alt="" /></a></li>
							<li><a href="#"><img src="images/icons/twitter.png"
									alt="" /></a></li>
							<li><a href="#"><img src="images/icons/youtube.png"
									alt="" /></a></li>
						</ul>
					</div>
					<div id="footertext">Copyright &copy;2012 Cpa System. All
						Rights Reserved. 【Recommended To Use IE6.0 or Above Browse.】</div>
					<div class="clear"></div>
					<!-- clear float -->
				</div>
				<!-- end container940 -->
			</div>
			<!-- end #after-footer -->

		</div>
		<!-- end #container -->
	</div>
	<!-- end #outer-container -->

</body>
</html>