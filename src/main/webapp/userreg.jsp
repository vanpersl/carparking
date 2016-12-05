<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/userreg.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<div id="first">
	<s:form action="UserReg.action">
		<table align="center" width="320" id="tab1" title="注册">
			<tr align="right">
				<td>用户名：</td>
				<td align="left"><input type="text" name="name" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>密码：</td>
				<td align="left"><input type="password" name="password" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>确认：</td>
				<td align="left"><input type="password" name="pin" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>车牌号：</td>
				<td align="left"><input type="text" name="carno" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>联系电话：</td>
				<td align="left"><input type="text" name="tel" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>住址：</td>
				<td align="left""><input type="text" name="address" size="19" maxlength="12" style="width:140px;height:16"/></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="right">
				<td>性别：</td>
				<td align="left">
					<select name="sex">
						<option value="man" label="男" selected="selected"/>
						<option value="women" label="女"/>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			<tr align="center">
				<td>&nbsp;</td>
				<td align="left"><input type="submit" value="立即注册"/>&nbsp;&nbsp;<input type="submit" value="清空"/></td>
			</tr>
		</table>
	</s:form>
</div>
</body>
</html>