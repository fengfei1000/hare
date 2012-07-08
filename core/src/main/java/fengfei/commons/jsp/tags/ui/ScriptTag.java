package fengfei.commons.jsp.tags.ui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 
 <script src="xxx.js" type="text/javascript">//</script>
 * 
 */
public class ScriptTag extends SimpleTagSupport implements DynamicAttributes {

	private Map<String, Object> attributes = new HashMap<String, Object>();
	HtmlElement htmlElement = new HtmlElement("script");
	// <link href="index.css" media="screen" rel="stylesheet" type="text/css" />
	private String src;

	public ScriptTag() {
		super();
		htmlElement.addAttribute("type", "text/javascript");

	}

	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();

		String path = pageContext.getServletContext().getContextPath();
		htmlElement.addAttribute("href", path + src);
		getJspContext().getOut().write(htmlElement.toHtml());
	}

	@Override
	public void setDynamicAttribute(String uri, String localName, Object value)
			throws JspException {
		attributes.put(localName, value);
		htmlElement.addAttribute(localName, value.toString());

	}

	public void setSrc(String src) {
		this.src = src;
	}
}
