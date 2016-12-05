<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<s:form action="RepLost.action">
		<table align="center" width="320" id="tab1" title="挂失/解禁">
			<tr align="right">
				<td>卡&nbsp;号：</td>
				<td align="left"><input type="text" name="cardno" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>&nbsp;</td>
				<td align="left">
					<input type="radio" value="lock" name="act">解挂
					<input type="radio" value="unlock" name="act">挂失
				</td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="center">
				<td>&nbsp;</td>
				<td align="left"><input type="submit" value="GO !"/></td>
			</tr>
		</table>
	</s:form>
</div>
</body>
</html>