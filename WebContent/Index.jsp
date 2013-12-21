<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.sandeep.core.ContentRenderer" %>
<html>
<head>

<title>CMS Login</title>
</head>

<body>
	<div style="width:99%;height:100px;background-color:rgb(220,0,0);color:#fff">
		<%=ContentRenderer.getRenderedContent(getServletContext().getRealPath("view/")+"/atoms/header/cms-header.xml", getServletContext().getRealPath("view/")+"/atoms/header/cms-header.xsl")%>
	</div>
<div>
<h2>CMS - Login</h2>
<s:actionerror />
<s:form action="login" method="post">
	<s:textfield name="username" key="label.username" size="20" />
	<s:password name="password" key="label.password" size="20" />
	<s:submit method="execute" key="label.login" align="center" />
</s:form>
</div>
</body>
</html>

