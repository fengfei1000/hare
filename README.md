hare template tags
=======

几个简单定义的JSP标签解决了在JavaEE项目开中页面布局及页面样式更换的麻烦。
通过u:body，u:define，u:insert三个标签即可实现页面的模板化开发。
项目是用JSP/struts2来测试可用，但标签与struts2无任何依赖关系。



可能有人会疑问sitemesh和tiles是干嘛的，我也是用过这两个，不用她们有四个原因：

	1、需要侵入的配置，容易出错。
	2、对于有些MVC技术支持不是很完美。
	3、性能影响。
	4、使用过于繁琐，对于有些简单问题，过于复杂化了。



已测试通过的Web容器和JavaEE服务器列表：

	apache-tomcat-6.0.x
	glassfish-3.0.1/glassfish-3.0.1-web
	glassfish-installer-v2.1.1
	resin-3.1.10
	resin-4.0.10
	jetty-6.1.25

失败的服务器：

	jetty-hightide-7.1.6
	jetty-hightide-8.0.0.M1

由于其在部署失败，未找具体原因，其部署失败是struts2不能正确部署引起；原则上应该不会有问题。
由于条件其他服务器未作测试。

例子，参考源代码包中的/demo/demo.jsp和template.jsp文件 基本例子：

模板页：template.jsp
-----------------------------------------------------------------------------
	<body>
	输出的自定义属性值：${request._body_attr.action}
	<div>
		 标题：<u:insert name="header" />
	</div>
	<div>
		 页面内容<u:insert name="body" />
	</div>
	<div>
		页面脚部：<u:insert name="footer" />
	</div>
	</body>
-----------------------------------------------------------------------------

使用页面：

-----------------------------------------------------------------------------
	不显示的文字和内容<hr/><hr/>
	<body>
	<u:body template="template.jsp" action="自定义属性值"	 >
	不显示的文字<hr/><hr/>
					<u:define name="header">标题</u:define>
	不显示的文字和内容<hr/><hr/>
					<u:define name="body">
									<img src="http://www.google.com.hk/intl/zh-CN/images/logo_cn.png" />
					</u:define> 
	不显示的文字和内容<hr/><hr/>
	
	</body>
	不显示的文字和内容<hr/><hr/>
-----------------------------------------------------------------------------