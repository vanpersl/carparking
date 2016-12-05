<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/record.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<div id="first">
		<table id="tabfst" align="center" title="所有停车场的历史停车记录">
			<tr align="center">
				<h2>停车信息记录</h2>
			</tr>
			<tr align="center">
				<td width="6%">车牌号码</td>
				<td width="9%">入场时间</td>
				<td width="9%">出场时间</td>
				<td width="9%">停车时长</td>
				<td width="6%">计费类型</td>
				<td width="4%">费用</td>
				<td width="6%">停车编号</td>
				<td width="4%">车辆类型</td>
				<td width="5%">付费方式</td>
				<td width="6%">付费卡号</td>
				<td width="8%">出场状态</td>
				<td width="6%">入场操作</td>
				<td width="6%">出场操作</td>
				<td width="6%">停车场名</td>
				<td width="10%">备注信息</td>
			</tr>
			<s:iterator value="cpb">
				<tr align="center">
					<td width="6%"><s:property value="cpaRecordCarno" /></td>
					<td width="9%"><s:property value="cpaRecordEt" /></td>
					<td width="9%"><s:property value="cpaRecordOt" /></td>
					<td width="10%"><s:property value="cpaRecordPt" /></td>
					<td width="6%"><s:property value="cpaRecordBt" /></td>
					<td width="6%"><s:property value="cpaRecordFee" /></td>
					<td width="6%"><s:property value="cpaRecordCpn" /></td>
					<td width="6%"><s:property value="cpaRecordType" /></td>
					<td width="6%"><s:property value="cpaRecordPft" /></td>
					<td width="6%"><s:property value="cpaRecordCardno" /></td>
					<td width="6%"><s:property value="cpaRecordStatus" /></td>
					<td width="6%"><s:property value="cpaRecordOpte" /></td>
					<td width="5%"><s:property value="cpaRecordOpto" /></td>
					<td width="6%"><s:property value="cpaRecordCpaname" /></td>
					<td width="6%"><s:property value="cpaRecordCarbz" /></td>
				</tr>
			</s:iterator>
		</table>
		<br /> <br />
		<div id="pageaction">
			共<strong><s:property value="#request.intPageCount" /></strong>页 <a
				href="RecordPage.action?pageNow=1">首页</a> <a
				href="RecordPage.action?pageNow=<s:property value='%{PageNow-1}'/>">
				上一页</a> <a
				href="RecordPage.action?pageNow=<s:property value='%{PageNow+1}'/>">下一页</a>
			<a
				href="RecordPage.action?pageNow=<s:property value='#request.intPageCount'/>">末页</a>
			<span>第<strong><s:property value="#request.pageNow" /></strong>页
			</span>
		</div>
	</div>
</body>
</html>