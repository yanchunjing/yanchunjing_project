<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>RoleAction</title>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<h1>这是RoleAction对应的role.jsp</h1>
		<div>
			<div><h4>通过RoleAction的redirectUser方法重定向到user.action</h4></div>
			<h3><a href="${ctx}/base/role!redirectUser.action">点击链接，执行redirectUser</a></h3>
			<h3><a href="${ctx}/base/role!input.action">新增</a></h3>
		</div>
		<div>
			<table width="100%" border="0" align="center" cellpadding="3" cellspacing="1">
				<tr align="center">
					<th>序号</th>
					<th>角色</th>
					<th>操作</th>
				</tr>
				<s:iterator value="list">
					<tr align="center" bgcolor="#FFFFFF">
						<td>${id}</td>
						<td>${name}</td>
						<td>
							<a href="role!view.action?id=${id}">详细</a>
							<a href="role!input.action?id=${id}">修改</a>
							<a href="role!delete.action?id=${id}">删除</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
		<div>
			<h3><a href="${ctx}/hello.action">返回</a></h3>
		</div>
	</body>
</html>