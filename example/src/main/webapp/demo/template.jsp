<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="u" uri="/WEB-INF/ui.tld"%>
<html>
<head>
<meta charset="UTF-8">
<title><u:insert name="title" /></title>
<u:style src="/css/s.css" />
<u:script src="/css/s.js"/>
<style type="text/css">
*,html,form,body,div,table,td,th {
	/*注意这个字体顺序，并且必须有(font-family:"Arial")，否则Jquery UI 显示稍有问题*/
	font-family: "Arial", "Helvetica", "Verdana", "sans-serif", "微软雅黑", "宋体";
	font-size: 14px;
	margin: 0;
	padding: 0;
}

body {
	color: #000;
	background-color: #FFFFFF;
}

ul,ol,dl {
	padding: 0;
	margin: 0;
}

h1,h2,h3,h4,h5,h6,p {
	margin-top: 0;
	padding-right: 15px;
	padding-left: 15px;
}

a img {
	border: none;
}

a:link {
	color: #414958;
	text-decoration: underline;
}

a:visited {
	color: #4E5869;
	text-decoration: underline;
}

a:hover,a:active,a:focus {
	text-decoration: none;
}

.hr,hr {
	padding: 0px;
	margin: 0px;
	margin-bottom: 4px;
	margin-top: 4px;
	border: none;
	border-bottom: 1px #CCCCCC solid;
	background: #CCCCCC;
	display: block;
}

button,input,textarea,div,.button {
	-moz-border-radius: 4px /*{cornerRadius}*/;
	-webkit-border-radius: 4px /*{cornerRadius}*/;
	border-radius: 4px /*{cornerRadius}*/;
}

input[type=text] {
	height: 18px;
}

input[type=text],textarea {
	border: 1px solid #CCCCCC;
	color: #7D7D7D;
	background: #FFFFF4;
	margin: 1px;
	padding: 2px;
}

input[type=text]:hover,textarea:hover {
	border: 1px solid #FFEE44;
	color: #7D7D7D;
	background: #FFFFF4;
}

input[type=text]:focus,textarea:focus {
	border: 1px solid #FFCC00;
	color: #7D7D7D;
	background: #FFFFF4;
}

input[type=button],input[type=submit],button,.button {
	padding: 4px 9px 4px 9px;
	border: 1px solid #CCCCCC;
	background: #deedf7 url(button.png) 50% 50% repeat-x;
	color: #999;
}

input[type=button]:hover,input[type=submit]:hover,button:hover,.button:hover
	{
	color: #617787;
}

input[type=button]:active,input[type=submit]:active,button:active,.button:active
	{
	color: #9e9e9e;
	text-decoration: none;
}

input[type=button]:disabled,input[type=submit]:disabled,button:disabled,.button:disabled
	{
	color: #9e9e9e;
	text-decoration: none;
}

.label {
	float: left;
	width: 30%
}

.red {
	color: red;
}

.blank_4 {
	padding: 4px 0px 4px 0px;
	display: block;
}

.title {
	padding: 4px 0px 0px 9px;
	margin: 0px;
	display: block;
}

body {
	background: #617787;
}

.header {
	padding: 4px;
	width: 74%;
	height: 144px;
	background: #FFF;
	margin: 0 auto;
}

.body {
	width: 74%;
	background: #FFF;
	margin: 0 auto;
	padding: 4px;
}

.footer {
	width: 74%;
	background-color: none;
	margin: 0 auto;
	padding: 14px;
	margin: 0 auto;
	text-align: center;
	color: #FFF;
}
</style>
</head>
<body>


	<div class="header">
		<u:insert name="header" />
	</div>
	<div class="blank_4"></div>
	<div class="body">
		<div class="blank_4"></div>
		<div class="title">
			<u:insert name="title" />
		</div>
		<hr />
		<div class="blank_4"></div>
		<div class="title_hr">
			<u:insert name="toolsbar" />
		</div>
		<div class="blank_4"></div>
		<hr />
		<u:insert name="body" />
		<div class="blank_4"></div>
	</div>
	<div class="blank_4"></div>

	<div class="footer">
		Powered by Fengfei Wang @Copyright 2010-2012
		<u:insert name="footer" />
	</div>

</body>
</html>