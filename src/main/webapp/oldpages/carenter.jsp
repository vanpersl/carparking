<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="cp.ajax.*,java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/matrix.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<s:if test="pageNow == null">
	<meta http-equiv="refresh" content="0;URL=EnterPage.action?pageNow=1">
</s:if>
<title>Insert title here</title>
<script type="text/javascript" src="jquery/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/ajaxdata.js"></script>
</head>
<body style="background-image: url('pics/1425.jpg');">
<div>
	欢迎您：[<s:property value="#session.obj.adminRname"/>] | <a href="LogoutAdm.action">退出系统</a>
</div>
<div id="header">
	<table id="tab1" width="800" align="center" title="停车场当前所停车辆情况">
		<tr align="center"><h2>[<s:property value="#session.obj.adminCpaname"/>]&nbsp;车辆停放信息</h2></tr>
		<tr align="center">
			<td width="18%">入场时间</td>
			<td width="10%">车牌号码</td>
			<td width="10%">车辆类型</td>
			<td width="10%">支付卡类型</td>
			<td width="10%">停车编号</td>
			<td width="7%">停车状态</td>
			<td width="10%">入场经办人</td>
			<td width="15%">备注信息</td>
		</tr>
		<s:iterator value="ceb">
			<tr align="center">
				<td width="15%"><s:property value="cpaEnterTime"/></td>
				<td width="10%"><s:property value="cpaEnterCarno"/></td>
				<td width="10%"><s:property value="cpaEnterType"/></td>
				<td width="10%"><s:property value="cpaEnterBt"/></td>
				<td width="10%"><s:property value="cpaEnterEn"/></td>
				<td width="10%"><s:property value="cpaEnterStatus"/></td>
				<td width="10%"><s:property value="cpaEnterOpt"/></td>
				<td width="15%"><s:property value="cpaEnterCarbz"/></td>
		    </tr>
		</s:iterator>
	</table>
	<div id="pageaction">
	共<strong><s:property value="#request.intPageCount"/></strong>页
                        <a href="EnterPage.action?pageNow=1">首页</a>
                        <a href="EnterPage.action?pageNow=<s:property value='%{PageNow-1}'/>"> 上一页</a>
                        <a href="EnterPage.action?pageNow=<s:property value='%{PageNow+1}'/>">下一页</a>
                        <a href="EnterPage.action?pageNow=<s:property value='#request.intPageCount'/>">末页</a>
                        <span>第<strong><s:property value="#request.pageNow"/></strong>页</span>
	</div>
<br />
<br />
</div>
<div id="contain">
	<div id="left">
		<s:form action="CarEnter.action">
				<table align="center" id="tableleft">
					<tr></tr>
					<tr align="left">
						<td>支付卡类型：</td>
						<td>
							<select name="carBt">
								<option value="会员卡" label="会员卡"/>
								<option value="临时卡" label="临时卡">
							</select>
						</td>
					</tr>
					<tr align="left">
						<td>选择车牌号前两位：</td>
						<td><select size="1" name="head" id="sel1" onchange="loadajax()">
								<option value="-1" label="请选择"/>
									<%
										DataStrc ds = new DataStrc();
										LinkedList ld = ds.query("11", "head");
										for (int i = 0; i < ld.size(); i++) {
									%>
								<option value="<%=ld.get(i)%>"><%=ld.get(i)%></option>
									<%
										}
									%>
							</select>
							<select size="1" name="scnd" id="sel2">
								<option value="1">字母</option>
							</select>
						</td>
					</tr>
					<tr></tr>
					<tr align="left">
						<td>
							输入车牌号后五位：
						</td>
						<td><input type="text" class="longtf" name="lastFive" maxlength="5"/></td>
					</tr>
					<tr></tr>
					<tr align="left">
						<td>计费卡卡号：</td>
						<td><input type="text" class="longtf" name="cardNo"/></td>
					</tr>
					<tr></tr>
					<tr align="left">
						<td>车辆类型：</td>
						<td>
							<select name="carType">
								<option value="大型车" label="大型车"/>
								<option value="小汽车" label="小汽车">
							</select>
						</td>
					</tr>
					<tr></tr>
					<tr align="left">
						<td>备注信息：</td>
						<td><input type="text" class="longtf" name="carBz"/></td>
					</tr>
					<tr>
						<td></td>
					</tr>
					<tr align="left">
						<td></td>
						<td><input type="submit" value="入场">&nbsp;&nbsp;&nbsp;<input type="reset" value="重填"></td>
					</tr>
				</table>
		</s:form>
	</div>
	<div id="right">
		<s:form action="CalcFee.action">
			<table align="center" id="tableright">
				<tr align="left">
					<td>请输入车牌：</td>
					<td><input type="text" name="outCarNo"/></td>
				</tr>
				<tr align="center">
					<td>选择支付类型：</td>
					<td>
						<select name="payType" id="selPay">
								<option value="会员卡" label="会员卡" selected="selected"/>
								<option value="现金" label="现金">
						</select>
					</td>
				</tr>
				<tr align="center">
					<td><a id="a1">支付卡卡号：</a></td>
					<td><input type="text" class="longtf"  name="cardNo" id="cn"/></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr align="left">
					<td></td>
					<td><input type="submit"  value="出场"></td>
				</tr>
			</table>		
		</s:form>
	</div>
</div>
</body>
</html>