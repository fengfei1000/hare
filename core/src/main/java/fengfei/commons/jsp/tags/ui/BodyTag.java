package fengfei.commons.jsp.tags.ui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.DynamicAttributes;

/**
 * <pre>
 * 如果doStartTag()返回的是EVAL_BODY_INCLUDE-->doAfterTag()方法,如果它返回SKIP_BODY就执行doEndTag()方法.
 * 在doAfterTag()方法中返回EVAL_BODY_AGAIN来重复执行doAfterTag()方法,   返回SKIP_BODY值则执行doEndTag()方法.
 * 在doEndTag()方法中返回EVAL_PAGE值,则执行此标签的后的其它代码,返回SKIP_PAGE则不执行此页面的其它代码.
 * </pre>
 */
public class BodyTag extends BodyTagSupport implements DynamicAttributes {
	private static final long serialVersionUID = 1L;
	public static final String BODY_TAG_DYNAMIC_ATTRIBUTES = "_body_attr";
	private String template;
	private Map<String, Object> attributes = new HashMap<String, Object>();

	@Override
	public int doStartTag() throws JspException {
		super.doStartTag();
		try {
			pageContext.getOut().clear();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return BodyTagSupport.EVAL_BODY_BUFFERED;
	}

	@Override
	public int doAfterBody() throws JspException {
		super.doAfterBody();
		return super.doAfterBody();
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			ServletRequest request = pageContext.getRequest();
			request.setAttribute(BODY_TAG_DYNAMIC_ATTRIBUTES, attributes);
			pageContext.include(template);
		} catch (ServletException e) {
			e.printStackTrace();
			try {
				pageContext.getResponse().getWriter().write(e.getClass() + ": " + e);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			throw new JspException(e.getMessage(), e);
		} catch (IOException e) {
			e.printStackTrace();
			try {
				pageContext.getResponse().getWriter().write(e.getClass() + ": " + e);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			throw new JspException(e.getMessage(), e);
		}
		return BodyTagSupport.SKIP_PAGE;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(
		String template) {
		this.template = template;
	}

	@Override
	public void setDynamicAttribute(
		String uri,
		String localName,
		Object value) throws JspException {
		attributes.put(localName, value);
	}
}
