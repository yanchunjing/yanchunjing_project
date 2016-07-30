<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>HelloAction</title>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<h1>这是HelloAction默认的hello.jsp</h1>
		<div>
			<h3><a href="${ctx}/base/user.action">点击链接，执行UserAction</a></h3>
		</div>
		<div>
			<h3><a href="${ctx}/base/role.action">点击链接，执行RoleAction</a></h3>
		</div>
	</body>
</html>