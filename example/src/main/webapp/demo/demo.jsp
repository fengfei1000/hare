<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>

<%@ taglib prefix="u" uri="/WEB-INF/ui.tld"%>
<meta charset="UTF-8">

</head>
<body>
	<u:body template="/demo/template.jsp" action="#"
		customAtrribute="value">不显示的文字
	<u:define name="title">Demo 页面</u:define>不显示的文字
	<u:define name="header">
			<font color="red">百度LOGO</font>
			<img src="http://www.baidu.com/img/baidu_logo.gif" width="270"
				height="129" border=0 />

			<font color="red">谷歌LOGO</font>
			<img src="http://www.google.com.hk/intl/zh-CN/images/logo_cn.png"
				width=276 height=110 border=0 alt="Google" title="Google" />
		</u:define>不显示的文字
	<u:define name="toolsbar">
			<div class="body">
				<a href="#">链接1</a> <a href="#">链接2</a> <a href="#">链接2</a> <a
					href="#">链接3</a> <a href="#">链接4</a> <br /> <br />

				<button>按钮</button>
				<input type="button" value="按钮" />
			</div>
			<br />
			<br />
		</u:define>
不显示的文字
	<u:define name="body">
			<br />
			<br />
			<center>
				<div>
					<font color="red">谷歌</font>
				</div>
				<form action="http://www.google.com/search">

					<img src="http://www.google.com.hk/intl/zh-CN/images/logo_cn.png"
						width=276 height=110 border=0 alt="Google" title="Google" /> <br />
					<input class=lst type=text name=q maxlength=2048
						value="csdn myloon" size="74" title="Google 搜索" /> <input
						type=submit name="btnG" class=lsb value="Google 搜索" />


				</form>
			</center>
			<br />
			<br />
			<hr />
			<center>
				<div>
					<font color="red">百度</font>
				</div>
				<div id="m">
					<p id="lg">
						<img src="http://www.baidu.com/img/baidu_logo.gif" width="270"
							height="129" border=0 />
					</p>

					<div id="fm">
						<form name="f" action="http://www.baidu.com/s">
							<input type="text" name="wd" id="kw" value="csdn myloon"
								size="74" maxlength="100" /><input type="submit" value="百度一下"
								id="su" />
						</form>


					</div>
				</div>
			</center>
			<br />
			<br />
			<br />
			<br />


		</u:define>
		<div>不显示的文字</div>
	</u:body>
	<div>不显示的文字</div>
</body>
</html>